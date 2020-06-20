package procesamiento;

import BaseDeDatos.Agenda;
import BaseDeDatos.EventoInterfaz;

import java.util.ArrayList;

public class CreadorAgendas {
    //-----------VARIABLES----------------------
    //******************************************
    /**
     * variable que llevara la cuenta de cuantas veces si invoca a la creacion de agendas
     */
    private int numeroDeLLamados;
    private ArrayList<EventoInterfaz> listaDeEventos;
    private ArrayList<EventoInterfaz> eventosObligatorios;
    private ArrayList<EventoInterfaz> eventosPrioritarios;

    //-------------CONSTRUCTOR------------------
    //******************************************
    /**
     * @brief constructor de clase
     */
    public CreadorAgendas(){
        this.numeroDeLLamados = 0;
    }

    //-------------METODOS DE CALCULO-----------
    //******************************************
    public ArrayList<Agenda> generarAgendas(ArrayList<EventoInterfaz> eventos, String nombreDeUsuario){


    }

}
