package BaseDeDatos;

import java.util.ArrayList;

public class Usuario {
    //-----------VARIABLES----------------------
    //******************************************
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

    //-------------CONSTRUCTOR------------------
    //******************************************

    /**
     * @param nombreDeUsuario
     * @brief constructor de la clase
     */
    public Usuario(String nombreDeUsuario) {
        this.nombreDeUsusario = nombreDeUsuario;
    }

    //-------------GETTERS----------------------
    //******************************************
    /**
     * @brief retorna la lista con todos los eventos de este usuario
     * @return lista de eventos
     */
    public ArrayList<EventoInterfaz> getListaEventosInterfaz() {
        return this.listaEventosInterfaz;
    }

    /**
     * @brief retorna la lista de agendas del usuario
     * @return lista de agendas
     */
    public ArrayList<Agenda> getAgendas(){
        return this.agendas;
    }

    /**
     * @brief retorna un evento  en particular
     * @param nombre nombre del evento buscado
     * @return evento buscado
     */
    public EventoInterfaz getEventoInterfaz(String nombre) {
        for (EventoInterfaz eventoInterfazActual : this.listaEventosInterfaz) {

            if (eventoInterfazActual.getNombre().equals(nombre))
                return eventoInterfazActual;
        }
        return null;
    }

    /**
     * @brief retorna una agenda en particular
     * @param ID id de la agenda buscada
     * @return agenda buscada
     */
    public Agenda getAgenda(int ID) {
        for (Agenda agendaActual : this.agendas) {
            if (agendaActual.getID() == ID)
                return agendaActual;
        }
        return null;
    }


    /**
     * @brief retorna la lista de variantes de un evento
     * @param evento nombre del evento del cual quiero obtener las variantes
     * @return retorna la lista de variantes del evento
     */
    public ArrayList<VarianteInterfaz> getListaVariantes(String evento){
        for (EventoInterfaz eventoInterfazActual : this.listaEventosInterfaz) {

            if (eventoInterfazActual.getNombre().equals(evento))
                return eventoInterfazActual.getListaVariantes();
        }
        return null;
    }



}
