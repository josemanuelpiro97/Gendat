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
     * lista de materias cargadas por este usuario
     */
    private ArrayList<EventoInterfaz> listaMaterias;
    /**
     * lista de eventos particulares cargados por este usuarios
     */
    private ArrayList<EventoInterfaz> listaEventos;
    /**
     * lista de agendas generadas por este usuario
     */
    private ArrayList<Agenda> agendas;

    //-------------CONSTRUCTOR------------------
    //******************************************

    /**
     * @brief constructor de la clase
     * @param nombreDeUsuario
     */
    public Usuario(String nombreDeUsuario){
        this.nombreDeUsusario = nombreDeUsuario;
    }

    //-------------GETTERS----------------------
    //******************************************
    public ArrayList<EventoInterfaz> getListaMaterias(){
        return this.listaMaterias;
    }

    public ArrayList<EventoInterfaz> getListaEventos(){
        return this.listaEventos;
    }

    public ArrayList<Agenda> getAgendas(){
        return this.agendas;
    }

    public EventoInterfaz getMateria(String nombre){
        for (int i = 0; i < this.listaMaterias.size(); i++) {

        }
    }

}
