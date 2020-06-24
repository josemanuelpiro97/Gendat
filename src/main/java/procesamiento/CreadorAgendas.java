package procesamiento;

import BaseDeDatos.*;

import java.util.ArrayList;

public class CreadorAgendas {
    //-----------VARIABLES----------------------
    //******************************************
    /**
     * variable que llevara la cuenta de cuantas veces si invoca a la creacion de agendas
     */
    private int agendasRequeridas;
    private ArrayList<EventoInterfaz> eventosRegulares;
    private ArrayList<EventoInterfaz> eventosObligatorios;

    private int[][] horariosOcupados;
    private int[][] horariosObligatorios;

    //-------------CONSTRUCTOR------------------
    //******************************************

    /**
     * @brief constructor de clase
     */
    public CreadorAgendas(ArrayList<EventoInterfaz> listaDeEventos, int[][] horariosOcupados, int agendasRequeridas) {
        this.agendasRequeridas = agendasRequeridas;
        this.horariosOcupados = horariosOcupados;
        this.horariosObligatorios = horariosOcupados;
        this.eventosObligatorios = new ArrayList<EventoInterfaz>();
        this.eventosRegulares = new ArrayList<EventoInterfaz>();

        //armo las distintas listas
        for (EventoInterfaz eventoActual : listaDeEventos) {
            if (eventoActual.isObligatoria())
                this.eventosObligatorios.add(eventoActual);
            else
                this.eventosRegulares.add(eventoActual);
        }
    }

    //********** constructores para test*******************

    /**
     * @brief constructor vacio para testeo de metodos herramienta
     */
    public CreadorAgendas() {
    }

    public CreadorAgendas(ArrayList<EventoInterfaz> listaDeEventos) {
        this.eventosObligatorios = new ArrayList<EventoInterfaz>();
        this.eventosRegulares = new ArrayList<EventoInterfaz>();
        //armo las distintas listas
        for (EventoInterfaz eventoActual : listaDeEventos) {
            if (eventoActual.isObligatoria())
                this.eventosObligatorios.add(eventoActual);
            else
                this.eventosRegulares.add(eventoActual);
        }
    }


    //-------------METODOS DE CALCULO-----------
    //******************************************
    public ArrayList<Agenda> generarAgendas() {
        //lista de agendas
        ArrayList<Agenda> agendas = new ArrayList<Agenda>();

        //genero lista de eventos ordinarios pero ordenados
        ArrayList<EventoInterfaz> eventosOrdinariosOrdenados = this.generadorColumnasOrden(this.eventosRegulares);
        eventosOrdinariosOrdenados = this.generadorFilasOrden(eventosOrdinariosOrdenados);

        //una ves ya listo
        for (int i = 0; i < this.agendasRequeridas; i++) {
            Agenda agendaGenerada = new Agenda();
            //seteo los horarios obligatorios en los horarios ocupados
            this.horariosOcupados = this.horariosObligatorios;

            //le agrego los eventos obligatorios
            this.agregadorDeObligatorias(agendaGenerada);
            this.asignadorDeEventos(agendaGenerada, eventosOrdinariosOrdenados);

            agendas.add(agendaGenerada);

            this.vaciarHorariosOcupados();
        }

        return agendas;
    }

    /**
     * @param agenda agenda en la que se agregaran los eventos
     * @brief agrega todos los eventos obligatorios a la agenda
     */
    public void agregadorDeObligatorias(Agenda agenda) {
        for (EventoInterfaz eventoActual : this.eventosObligatorios) {
            if (eventoActual instanceof Materia) {
                Materia materia = (Materia) eventoActual;
                agenda.setMateria(materia);

            } else if (eventoActual instanceof EventoParticular) {
                EventoParticular eventoParticular = (EventoParticular) eventoActual;
                agenda.setEvento(eventoParticular);
            }
        }
    }

    public void asignadorDeEventos(Agenda agenda, ArrayList<EventoInterfaz> eventosParaAsignar) {
        boolean controlFlag = true;
        boolean controlFlag2 = true;
        int[][] horariosOcup = new int[this.horariosOcupados.length][this.horariosOcupados[0].length];
        horariosOcup = this.horariosOcupados;
        while (controlFlag) {
            controlFlag = false;
            for (EventoInterfaz eventoActual : eventosParaAsignar) {
                controlFlag2 = true;
                for (int i = 0; i < eventoActual.getListaVariantes().size(); i++) {
                    VarianteInterfaz varianteActual = eventoActual.getListaVariantes().get(i);
                    if (this.estaEnRango(horariosOcup, varianteActual) && controlFlag2) {
                        if (eventoActual instanceof Materia) {
                            //agrego la materia en la lista
                            Materia nuevaMateria = this.contructorMateriaSimple((Materia) eventoActual, varianteActual);
                            //desencolo la variante asignada
                            eventoActual.getListaVariantes().remove(i);

                            agenda.setMateria(nuevaMateria);
                            //actualizo bandera
                            controlFlag2 = false;
                            //actualizo matriz de tiempo disponible
                            this.setHorarioOcupado(horariosOcup, varianteActual);
                        } else if (eventoActual instanceof EventoParticular) {
                            //agrego el evento particular
                            EventoParticular eventoNuevo = this.contructorEventoSimple((EventoParticular) eventoActual, varianteActual);
                            //desencolo la variante asignada
                            eventoActual.getListaVariantes().remove(i);

                            agenda.setEvento(eventoNuevo);
                            //actualizo bandera
                            controlFlag2 = false;
                            //actualizo matriz de tiempo disponible
                            this.setHorarioOcupado(horariosOcup, varianteActual);
                        }
                    }
                }
            }
        }
    }


    //-------------TOOLS-----------
    //******************************************

    /**
     * @param variante variante a agregar en matriz
     * @brief setea en la matriz de horarios disponibles la variable pasada por parametro
     */
    public void setHorarioOcupado(int[][] matrix, VarianteInterfaz variante) {
        int valInicial = (variante.getHoraInicio() * 60) + variante.getMinInicio();
        int valFinal = (variante.getHoraFin() * 60) + variante.getMinFin();
        int dia = variante.getDia();
        for (int i = valInicial - 1; i < valFinal - 1; i++) {
            matrix[dia][i] = 1;
        }
    }

    public void vaciarHorariosOcupados() {
        for (int i = 0; i < this.horariosOcupados.length; i++) {
            for (int j = 0; j < this.horariosOcupados[i].length; j++) {
                this.horariosOcupados[i][j] = 0;
            }
        }
    }

    /**
     * @param variante variante del evento
     * @return true en caso de que el rango sea correcto, false en caso contrario, es decir, esta ocupando un tiempo que
     * no deba
     * @brief consulta si el dia y horario establecido en la variante del evento esta ocupado por algun evento obligatorio
     */
    public boolean estaEnRango(int[][] matrix, VarianteInterfaz variante) {
        int valInicial = (variante.getHoraInicio() * 60) + variante.getMinInicio();
        int valFinal = (variante.getHoraFin() * 60) + variante.getMinFin();
        int dia = variante.getDia();
        for (int i = valInicial - 1; i < valFinal - 1; i++) {
            if (matrix[dia][i] == 1)
                return false;
        }
        return true;
    }

    /**
     * @param listaDeEventos lista a ordenar
     * @return lista ordenada
     * @brief acomoda los eventos del array, poniendo primero los que tengan al menos una variante prioritaria y ultimo
     * los que no.
     */
    public ArrayList<EventoInterfaz> generadorColumnasOrden(ArrayList<EventoInterfaz> listaDeEventos) {
        ArrayList<EventoInterfaz> listaRetorno;
        listaRetorno = listaDeEventos;

        boolean controlFlag = true;
        while (controlFlag) {
            controlFlag = false;
            //busco un NO prioritario
            for (int i = 0; i < listaDeEventos.size(); i++) {
                EventoInterfaz eventoActual = listaRetorno.get(i);
                //si encontramos un NO prioritario y no es el ultimo de la lista
                if (!tieneUnPriori(eventoActual) && i != listaDeEventos.size() - 1) {
                    //busco un  prioritario para intercambiar
                    for (int j = i + 1; j < listaDeEventos.size(); j++) {
                        eventoActual = listaRetorno.get(j);
                        //si lo encuentro
                        if (this.tieneUnPriori(eventoActual)) {
                            //lo saco de ahi y lo pongo al principio
                            listaRetorno.add(0, listaRetorno.remove(j));
                            //actualizo el flag
                            controlFlag = true;
                        }
                    }
                }
            }
        }
        return listaRetorno;
    }

    /**
     * @param listaDeEventos lista a ordenar
     * @return lista ordenada
     * @brief acomoda las variantes de cada evento del array, poniendo primero las variantes prioritarias y ultimas
     * las NO prioritarias
     */
    public ArrayList<EventoInterfaz> generadorFilasOrden(ArrayList<EventoInterfaz> listaDeEventos) {
        ArrayList<EventoInterfaz> listaRetorno;
        listaRetorno = listaDeEventos;

        boolean controlFlag = true;
        while (controlFlag) {
            controlFlag = false;
            for (EventoInterfaz eventoActual : listaRetorno) {
                //reviso si la columna tiene un priori, en dicho caso ordeno
                if (this.tieneUnPriori(eventoActual)) {
                    ArrayList<VarianteInterfaz> columna = eventoActual.getListaVariantes();
                    //recorro la columna pra ordenarla
                    for (int i = 0; i < columna.size(); i++) {
                        VarianteInterfaz varianteActual = columna.get(i);
                        //si encuentro una variante NO prioritaria y no es la ultima, busco una priori
                        if (!varianteActual.getPrioridad() && i != columna.size() - 1) {
                            //busco una prioritaria
                            for (int j = i + 1; j < columna.size(); j++) {
                                varianteActual = columna.get(j);
                                //si no es prioritaria, la capturo
                                if (varianteActual.getPrioridad()) {
                                    //cumplido esto quiere decir que debo reEncolar la priori
                                    //la saco de la columna
                                    VarianteInterfaz aux1 = columna.remove(j);
                                    //la reEncolo
                                    columna.add(0, aux1);

                                    //acomodo el flag para una nueva iteracion
                                    controlFlag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return listaRetorno;
    }

    /**
     * @param evento evento a ser revisado
     * @return true en caso de que el evento tenga al menos una variante con prioridad, false en caso contrario
     * @brief revisa si el evento tiene al menos una variante con prioridad
     */
    public boolean tieneUnPriori(EventoInterfaz evento) {
        for (VarianteInterfaz varianteActual : evento.getListaVariantes()) {
            if (varianteActual.getPrioridad())
                return true;
        }
        return false;
    }

    /**
     * @param materia  matria de la cual tomar los datos
     * @param variante variante elegida para asignar
     * @return nueva materia
     * @brief genera una nueva materia con una unica comision, la cual es la elegida por el creador de agendas
     */
    public Materia contructorMateriaSimple(Materia materia, VarianteInterfaz variante) {
        //tomo los datos de la materia
        String nombre = materia.getNombre();
        boolean obligatoriedad = materia.isObligatoria();
        int anio = materia.getAnio();
        boolean semestre = materia.getSemestre();

        //creo la materia y le asigno la comision
        Materia nuevaMateria = new Materia();
        nuevaMateria.setNombre(nombre);
        nuevaMateria.setObligatoriedad(obligatoriedad);
        nuevaMateria.setAnio(anio);
        nuevaMateria.setSemestre(semestre);
        nuevaMateria.setVariante(variante);

        //retorno la nueva materia
        return nuevaMateria;
    }

    /**
     * @param eventoParticular evento del cual tomare los datos
     * @param variante         variante a asignar
     * @return nuevo evento particular
     * @brief genero un nuevo evento particular con una sola opcion, la cual sera la elegida por el creador de agendas
     */
    public EventoParticular contructorEventoSimple(EventoParticular eventoParticular, VarianteInterfaz variante) {
        //tomo los datos del evento particular
        String nombre = eventoParticular.getNombre();
        boolean obligatoriedad = eventoParticular.isObligatoria();
        String rubro = eventoParticular.getRubro();

        //creo el evento particular y le asigno la opcion
        EventoParticular nuevoEventoParticular = new EventoParticular();
        nuevoEventoParticular.setNombre(nombre);
        nuevoEventoParticular.setObligatoriedad(obligatoriedad);
        nuevoEventoParticular.setRubro(rubro);
        nuevoEventoParticular.setVariante(variante);

        //retorno la nueva materia
        return nuevoEventoParticular;
    }


}
