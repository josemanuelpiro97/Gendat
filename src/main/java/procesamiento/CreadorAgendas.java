package procesamiento;

import BaseDeDatos.*;

import java.util.ArrayList;

public class CreadorAgendas {
    //-----------VARIABLES----------------------
    //******************************************
    /**
     * variable que llevara la cuenta de cuantas veces si invoca a la creacion de agendas
     */
    private int numeroDeLLamados;
    private ArrayList<EventoInterfaz> eventosRegulares;
    private ArrayList<EventoInterfaz> eventosObligatorios;

    private int[][] horariosDisponibles;

    //-------------CONSTRUCTOR------------------
    //******************************************

    /**
     * @brief constructor de clase
     */
    public CreadorAgendas(ArrayList<EventoInterfaz> listaDeEventos, int[][] horariosOcupados, int dias, int minPorDia) {
        this.numeroDeLLamados = 0;
        this.horariosDisponibles = new int[dias][minPorDia];
        this.horariosDisponibles = horariosOcupados;

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
        Agenda agenda = new Agenda();
        //le agrego los eventos obligatorios
        this.agregadorDeObligatorias(agenda);
    }

    /**
     * @param agenda agenda en la que se agregaran los eventos
     * @brief agrega todos los eventos obligatorios a la agenda
     */
    private void agregadorDeObligatorias(Agenda agenda) {
        for (EventoInterfaz eventoActual :
                this.eventosObligatorios) {
            if (eventoActual instanceof Materia) {
                Materia materia = (Materia) eventoActual;
                agenda.setMateria(materia);

            } else if (eventoActual instanceof EventoParticular) {
                EventoParticular eventoParticular = (EventoParticular) eventoActual;
                agenda.setEvento(eventoParticular);
            }
        }
    }


    //-------------TOOLS-----------
    //******************************************

    /**
     * @param variante variante a agregar en matriz
     * @brief setea en la matriz de horarios disponibles la variable pasada por parametro
     */
    private void setHorarioOcupado(VarianteInterfaz variante) {
        int valInicial = (variante.getHoraInicio() * 60) + variante.getMinInicio();
        int valFinal = (variante.getHoraFin() * 60) + variante.getMinFin();
        int dia = variante.getDia();
        for (int i = valInicial - 1; i < valFinal - 1; i++) {
            this.horariosDisponibles[dia][i] = 1;
        }
    }

    /**
     * @param variante variante del evento
     * @return true en caso de que el rango sea correcto, false en caso contrario, es decir, esta ocupando un tiempo que
     * no deba
     * @brief consulta si el dia y horario establecido en la variante del evento esta ocupado por algun evento obligatorio
     */
    private boolean estaEnRango(VarianteInterfaz variante) {
        int valInicial = (variante.getHoraInicio() * 60) + variante.getMinInicio();
        int valFinal = (variante.getHoraFin() * 60) + variante.getMinFin();
        int dia = variante.getDia();
        for (int i = valInicial - 1; i < valFinal - 1; i++) {
            if (this.horariosDisponibles[dia][i] == 1)
                return false;
        }
        return true;
    }

    /**
     * @brief acomoda los eventos del array, poniendo primero los que tengan al menos una variante prioritaria y ultimo
     * los que no.
     * @param listaDeEventos lista a ordenar
     * @return lista ordenada
     */
    private ArrayList<EventoInterfaz> generadorColumnasOrden(ArrayList<EventoInterfaz> listaDeEventos) {
        ArrayList<EventoInterfaz> listaRetorno;
        listaRetorno = listaDeEventos;

        boolean controlFlag = true;
        EventoInterfaz eventoA;
        EventoInterfaz eventoB;
        while (controlFlag) {
            controlFlag = false;
            //busco un prioritario
            for (int i = 0; i < listaDeEventos.size(); i++) {
                EventoInterfaz eventoActual = listaRetorno.get(i);
                //si encontramos un prioritario y no es el ultimo de la lista
                if (tieneUnPriori(eventoActual) && i != listaDeEventos.size()-1){
                    //busco un NO prioritario para intercambiar
                    for (int j = i+1 ; j<listaDeEventos.size() ;j++){
                        eventoActual = listaRetorno.get(j);
                        //si lo encuentro
                        if(!this.tieneUnPriori(eventoActual)){
                            //los capturo
                            EventoInterfaz aux1 = listaRetorno.get(i);
                            EventoInterfaz aux2 = listaRetorno.get(j);
                            //realizo el cambio
                            listaRetorno.remove(i);
                            listaRetorno.add(i,aux2);
                            listaRetorno.remove(j);
                            listaRetorno.add(j,aux1);
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
     * @brief revisa si el evento tiene al menos una variante con prioridad
     * @param evento evento a ser revisado
     * @return true en caso de que el evento tenga al menos una variante con prioridad, false en caso contrario
     */
    private boolean tieneUnPriori(EventoInterfaz evento) {
        for (VarianteInterfaz varianteActual : evento.getListaVariantes()) {
            if (varianteActual.getPrioridad())
                return true;
        }
        return false;
    }

}
