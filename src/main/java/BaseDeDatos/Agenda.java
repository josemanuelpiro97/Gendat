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
     * @brief constructor de clase
     */
    public Agenda() {
        this.listaMaterias = new ArrayList<EventoInterfaz>();
        this.listaEventos = new ArrayList<EventoInterfaz>();

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

    //-------------SETTERS----------------------
    //******************************************
    /**
     * @brief agrega una materia a la liusta de materias
     * @param materia materia a agregar
     */
    public void setMateria(Materia materia){
        this.listaMaterias.add(materia);
    }

    /**
     * @brief agrega un evento a la lista de eventos
     * @param evento evento a agregar
     */
    public void setEvento(EventoParticular evento){
        this.listaEventos.add(evento);
    }

    //-------------TOOLS------------------------
    //******************************************
    public void resetCountID(){
        Agenda.idCount = 0;
    }

}
