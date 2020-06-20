package BaseDeDatos;

import Observer.Sujeto;
import Observer.Observador;

import java.util.ArrayList;


public class Usuario implements Sujeto {


    //-----------VARIABLES----------------------
    //******************************************
    //-----------Interface needed-------------

    //-----------requerido por interfaz--------
    /**
     * lista de los observadores que hacen uso de esta base de datos
     */
    private ArrayList<Observador> listaDeObservadores;

    //------------requerido por usuario---------
    /**
     * nombre de usuario
     */
    private String nombreDeUsusario;
    /**
     * lista de eventos particulares cargados por este usuarios
     */
    private ArrayList<EventoInterfaz> listaEventosInterfaz;
    /**
     * lista de agendas generadas por este usuario
     */
    private ArrayList<Agenda> agendas;

    /**
     * variables destinadas al control de rangos de horarios
     */
    private final int NUM_DIAS = 7;
    private final int NUM_MIN_X_DIA = 1080;
    private int[][] horariosOcupados;

    //-------------CONSTRUCTOR------------------
    //******************************************

    /**
     * @param nombreDeUsuario
     * @brief constructor de la clase
     */
    public Usuario(String nombreDeUsuario) {
        this.nombreDeUsusario = nombreDeUsuario;

        horariosOcupados = new int[this.NUM_DIAS][this.NUM_MIN_X_DIA];
        for (int i = 0; i < this.NUM_DIAS; i++) {
            for (int j = 0; j < this.NUM_MIN_X_DIA; j++) {
                this.horariosOcupados[i][j] = 0;
            }
        }
    }

    //-------------GETTERS----------------------
    //******************************************

    /**
     * @return lista de eventos
     * @brief retorna la lista con todos los eventos de este usuario
     */
    public ArrayList<EventoInterfaz> getListaEventos() {
        return this.listaEventosInterfaz;
    }

    /**
     * @return lista de agendas
     * @brief retorna la lista de agendas del usuario
     */
    public ArrayList<Agenda> getAgendas() {
        return this.agendas;
    }

    /**
     * @param nombre nombre del evento buscado
     * @return evento buscado
     * @brief retorna un evento  en particular
     */
    public EventoInterfaz getEvento(String nombre) {
        for (EventoInterfaz eventoInterfazActual : this.listaEventosInterfaz) {

            if (eventoInterfazActual.getNombre().equals(nombre))
                return eventoInterfazActual;
        }
        return null;
    }

    /**
     * @param ID id de la agenda buscada
     * @return agenda buscada
     * @brief retorna una agenda en particular
     */
    public Agenda getAgenda(int ID) {
        for (Agenda agendaActual : this.agendas) {
            if (agendaActual.getID() == ID)
                return agendaActual;
        }
        return null;
    }


    /**
     * @param evento nombre del evento del cual quiero obtener las variantes
     * @return retorna la lista de variantes del evento
     * @brief retorna la lista de variantes de un evento
     */
    public ArrayList<VarianteInterfaz> getListaVariantes(String evento) {
        for (EventoInterfaz eventoInterfazActual : this.listaEventosInterfaz) {

            if (eventoInterfazActual.getNombre().equals(evento))
                return eventoInterfazActual.getListaVariantes();
        }
        return null;
    }

    //-------------SETTERS----------------------
    //******************************************

    /**
     * @param evento evento a agregar
     * @brief agrega un evento a nuestra lista de eventos y retorna un mensaje de confirmacion
     * en caso de que el evento ya exista, retorna un mensaje de error y no lo agrega
     */
    public String addEvento(EventoInterfaz evento) {
        final String msjERROR = "Evento duplicado";
        final String msjCORRECT = "Evento agregado";


        for (EventoInterfaz eventoActual : this.listaEventosInterfaz
        ) {
            if (eventoActual.getNombre().equals(evento.getNombre()))
                return msjERROR;
        }
        //notifico cambios
        this.notificarObservador();

        return msjCORRECT;
    }

    /**
     * @param variante     variante a agregar
     * @param nombreEvento nombre del evento al que quiero agregarle la variante
     * @brief añade una variante al evento especificado e imprime un mensaje de
     *        confirmacion(si es que esta en rango adecuado),
     *        en caso de encontrar el evento pero que la variante este duplicada se imprime
     *        un mensaje de error y no se agrega la varianto, por ultimo, se pude dar el caso
     *        en que no se encuentre el evento, en este caso tambien se imprimira un mensaje
     *        de error
     */
    public String addVariante(VarianteInterfaz variante, String nombreEvento) {
        final String msjERROR = "Variante duplicada";
        final String msjERROR2 = "Evento no encontrado";
        final String msjERROR3 = "Este evento ocupa una franja horaria que ya esta ocupada por una" +
                                 "variante obligatoria";
        final String msjCORRECT = "Variante agregada";

        for (EventoInterfaz eventoActual : this.listaEventosInterfaz) {
            if (eventoActual.getNombre().equals(nombreEvento)) {
                for (VarianteInterfaz varianteActual : eventoActual.getListaVariantes()) {
                    if (varianteActual.getIdentificador() == variante.getIdentificador())
                        return msjERROR;
                }
                if(this.estaEnRango(variante)){
                    //agrego variante
                    eventoActual.getListaVariantes().add(variante);
                    if(variante.get)

                    //notifico cambios
                    this.notificarObservador();
                    return msjCORRECT;
                }
                else
                    return msjERROR3;
            }
        }
        return msjERROR2;
    }

    //-------------ELIMINATORS----------------------
    //*********************************************

    /**
     * @param nombreEvento nombre del evento que se quiere eliminar de la lista
     * @return mensaje de confirmacion o de error
     * @brief elimina el evento especificado por parametro y retorna confirmacion, en caso
     * de no encontrarlo retornara un mensaje de error.
     */
    public String quitEvento(String nombreEvento) {
        final String msjERROR = "Evento no encontrado";
        final String msjCORRECT = "Evento eliminado";

        for (int i = 0; i < this.listaEventosInterfaz.size(); i++) {
            if (this.listaEventosInterfaz.get(i).getNombre().equals(nombreEvento)) {
                this.listaEventosInterfaz.remove(i);
                return msjERROR;
            }
        }

        //notifico cambios
        this.notificarObservador();
        return msjCORRECT;
    }

    /**
     * @param nombreEvento nombre del evento del que quiero borrar la variable
     * @param idVariante   id de la variable a eliminar
     * @return
     * @brief quita una variante de un evento en particular y retorna un mensaje de confirmacion,
     * en caso de no encontrar el evento o la variante retorna un mensaje de error, indicando
     * cual fue el causante
     */
    public String quitVariante(String nombreEvento, int idVariante) {
        final String msjERROR = "Evento no encontrado";
        final String msjERROR2 = "Variante no encontrada";
        final String msjCORRECT = "Variable eliminado";

        for (EventoInterfaz eventoActual : this.listaEventosInterfaz) {
            if (eventoActual.getNombre().equals(nombreEvento)) {
                for (int j = 0; j < eventoActual.getListaVariantes().size(); j++) {
                    VarianteInterfaz varianteActual = eventoActual.getListaVariantes().get(j);
                    if (varianteActual.getIdentificador() == idVariante) {
                        eventoActual.getListaVariantes().remove(j);

                        //notifico cambios
                        this.notificarObservador();
                        return msjCORRECT;
                    }
                }
                return msjERROR2;
            }
        }
        return msjERROR;
    }

    //----------------SUBJECT----------------------
    //*********************************************
    @Override
    public int registrarObservador(Observador nuevoObservador) {
        this.listaDeObservadores.add(nuevoObservador);
        int ID = this.listaDeObservadores.size();
        return ID;
    }

    @Override
    public void removerObservador(Observador observadorPorEliminar) {
        int i = observadorPorEliminar.getID();
        this.listaDeObservadores.remove(i);
    }

    @Override
    public void notificarObservador() {
        for (Observador observadorActual : this.listaDeObservadores){
            observadorActual.actialuzar();
        }
    }

    //----------------TOOLS----------------------
    //**************************************************
    /**
     * @brief consulta si el dia y horario establecido en la variante del evento esta ocupado por algun evento obligatorio
     * @param variante variante del evento
     * @return true en caso de que el rango sea correcto, false en caso contrario, es decir, esta ocupando un tiempo que
     *         no deba
     */
    private boolean estaEnRango(VarianteInterfaz variante) {
        int valInicial = (variante.getHoraInicio()*60) + variante.getMinInicio();
        int valFinal = (variante.getHoraFin()*60) + variante.getMinFin();
        int dia = variante.getDia();
        for (int i = valInicial-1 ; i< valFinal-1 ; i++){
            if(this.horariosOcupados[dia][i] == 1)
                return false;
        }
        return true;
    }

    private void setHorarioOcupado(VarianteInterfaz variante){
        int valInicial = (variante.getHoraInicio()*60) + variante.getMinInicio();
        int valFinal = (variante.getHoraFin()*60) + variante.getMinFin();
        int dia = variante.getDia();
        for (int i = valInicial-1 ; i< valFinal-1 ; i++){
            this.horariosOcupados[dia][i] = 1;
        }
    }

    private void quitHorarioOcupado(VarianteInterfaz variante){
        int valInicial = (variante.getHoraInicio()*60) + variante.getMinInicio();
        int valFinal = (variante.getHoraFin()*60) + variante.getMinFin();
        int dia = variante.getDia();
        for (int i = valInicial-1 ; i< valFinal-1 ; i++){
            this.horariosOcupados[dia][i] = 0;
        }
    }
}
