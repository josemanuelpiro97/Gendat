package BaseDeDatos;

import java.util.ArrayList;

public class Agenda {
    //-----------VARIABLES----------------------
    //******************************************
    /**
     * id de la agenda
     */
    private int ID = 0;
    private static int idCount = 0;
    /**
     * lista de materias que pertenecen a esta agenda
     */
    private ArrayList<EventoInterfaz> listaMaterias;
    /**
     * lista de eventos particulares que pertenecen a esta agenda
     */
    private ArrayList<EventoInterfaz> listaEventos;

    //-------------CONSTRUCTOR------------------
    //******************************************

    /**
     * @param listaMaterias lista de materias contenidas en esta agenda
     * @param listaEventos  lista de eventos particulares ontenidos en esta agenda
     * @brief constructor de clase
     */
    public Agenda(ArrayList<EventoInterfaz> listaMaterias, ArrayList<EventoInterfaz> listaEventos) {
        this.listaMaterias = listaMaterias;
        this.listaEventos = listaEventos;

        //asigno ID luego incremento
        this.ID = Agenda.idCount;
        idCount++;
    }

    //-------------GETTERS----------------------
    //******************************************
    /**
     * @return lista de materias
     * @brief getter de lista de materias
     */
    public ArrayList<EventoInterfaz> getListaMaterias() {
        return this.listaMaterias;
    }

    /**
     * @return lista de eventos particulares
     * @brief getter de lista de eventos particulares
     */
    public ArrayList<EventoInterfaz> getListaEventos() {
        return this.listaEventos;
    }

    /**
     * @brief getter de id de agenda
     * @return id de agenda
     */
    public int getID(){
        return this.ID;
    }
}
