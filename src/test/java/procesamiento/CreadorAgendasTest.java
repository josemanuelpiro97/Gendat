package procesamiento;

import BaseDeDatos.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CreadorAgendasTest {


    @Test
    void agregadorDeObligatorias() {
        //creo materias y eventos
        Materia materia = new Materia();
        materia.setNombre("fisica");
        materia.setSemestre(false);
        materia.setAnio(2020);
        materia.setObligatoriedad(true);

        Materia materia2 = new Materia();
        materia2.setNombre("Algebra");
        materia2.setSemestre(false);
        materia2.setAnio(2020);
        materia2.setObligatoriedad(true);

        EventoParticular eventoParticular = new EventoParticular();
        eventoParticular.setRubro("ocio");
        eventoParticular.setObligatoriedad(true);
        eventoParticular.setNombre("lectura de interes");

        EventoParticular eventoParticular2 = new EventoParticular();
        eventoParticular2.setRubro("deporte");
        eventoParticular2.setObligatoriedad(true);
        eventoParticular2.setNombre("gym");

        //creo la variantes
        Comision comision1 = new Comision();
        Comision comision2 = new Comision();

        comision1.setProfesor("carlos");
        comision2.setProfesor("juan");
        comision1.setDia(0);
        comision2.setDia(2);
        comision1.setPrioridad(false);
        comision2.setPrioridad(true);
        comision1.setNumAula(210);
        comision2.setNumAula(310);
        comision1.setIdentificador(1);
        comision2.setIdentificador(2);
        comision1.setHoraInicio(12);
        comision2.setHoraInicio(14);;
        comision1.setMinInicio(10);
        comision2.setMinInicio(10);
        comision1.setHoraFin(13);
        comision2.setHoraFin(14);
        comision1.setMinFin(10);
        comision2.setMinFin(10);

        OpcionEP opcionEP1 = new OpcionEP();
        OpcionEP opcionEP2 = new OpcionEP();


        opcionEP1.setDia(0);
        opcionEP2.setDia(2);
        opcionEP1.setPrioridad(false);
        opcionEP2.setPrioridad(true);
        opcionEP1.setIdentificador(1);
        opcionEP2.setIdentificador(2);
        opcionEP1.setHoraInicio(12);
        opcionEP2.setHoraInicio(14);;
        opcionEP1.setMinInicio(10);
        opcionEP2.setMinInicio(10);
        opcionEP1.setHoraFin(13);
        opcionEP2.setHoraFin(14);
        opcionEP1.setMinFin(10);
        opcionEP2.setMinFin(10);
        opcionEP1.setLugar("mi casa");
        opcionEP2.setLugar("Maipu 500");

        //asigno variantes a materias y eventos particulares
        materia.setVariante(comision1);
        materia2.setVariante(comision2);
        eventoParticular.setVariante(opcionEP1);
        eventoParticular2.setVariante(opcionEP2);

        //creo mi arreglo de evntos
        ArrayList<EventoInterfaz> eventos = new ArrayList<EventoInterfaz>();
        eventos.add(materia);
        eventos.add(materia2);
        eventos.add(eventoParticular);
        eventos.add(eventoParticular2);

        //creo mi Creador de agenda con estos cuatro eventos
        CreadorAgendas nuevoCreador = new CreadorAgendas(eventos);

        //testeo
        Agenda nuevaAgenda = new Agenda();
        nuevoCreador.agregadorDeObligatorias(nuevaAgenda);

        //reviso si hay dos eventos particulares
        assertEquals(2,nuevaAgenda.getListaEventos().size());
        //reviso si hay dos materias
        assertEquals(2,nuevaAgenda.getListaMaterias().size());



    }



    @Test
    void generadorColumnasOrden() {
        CreadorAgendas creadorAgendas = new CreadorAgendas();

        //creo comisiones
        Comision comision1 = new Comision();
        Comision comision2 = new Comision();
        Comision comision3 = new Comision();

        //cargo datos en comisiones
        comision1.setProfesor("carlos");
        comision2.setProfesor("juan");
        comision3.setProfesor("margarita");
        comision1.setDia(0);
        comision2.setDia(2);
        comision3.setDia(4);
        comision1.setPrioridad(false);
        comision2.setPrioridad(true);
        comision3.setPrioridad(true);
        comision1.setNumAula(210);
        comision2.setNumAula(310);
        comision3.setNumAula(512);
        comision1.setIdentificador(1);
        comision2.setIdentificador(2);
        comision3.setIdentificador(3);
        comision1.setHoraInicio(12);
        comision2.setHoraInicio(14);
        comision3.setHoraInicio(16);
        comision1.setMinInicio(10);
        comision2.setMinInicio(10);
        comision3.setMinInicio(10);
        comision1.setHoraFin(13);
        comision2.setHoraFin(14);
        comision3.setHoraFin(15);
        comision1.setMinFin(10);
        comision2.setMinFin(10);
        comision3.setMinFin(10);

        //creo materia
        Materia materia = new Materia();
        materia.setNombre("fisica");
        materia.setSemestre(false);
        materia.setAnio(2020);
        materia.setObligatoriedad(false);

        Materia materia2 = new Materia();
        materia2.setNombre("Algebra");
        materia2.setSemestre(false);
        materia2.setAnio(2020);
        materia2.setObligatoriedad(false);

        Materia materia3 = new Materia();
        materia3.setNombre("Matematicas");
        materia3.setSemestre(false);
        materia3.setAnio(2020);
        materia3.setObligatoriedad(false);

        //agrego comisiones a materia
        materia.setVariante(comision1);

        materia2.setVariante(comision1);

        materia3.setVariante(comision1);
        materia3.setVariante(comision2);
        materia3.setVariante(comision3);

        //creo mi lista de eventos con sus opciones
        ArrayList<EventoInterfaz> listaParaOrdenar = new ArrayList<EventoInterfaz>();
        listaParaOrdenar.add(materia);
        listaParaOrdenar.add(materia2);
        listaParaOrdenar.add(materia3);

        //ordeno por columna
        ArrayList<EventoInterfaz> listaOrdenada = creadorAgendas.generadorColumnasOrden(listaParaOrdenar);

        //teste si el primer evento (el cual es el unico sin variantes prioritarias), queda a lo ultimo
        assertEquals("fisica",listaOrdenada.get(1).getNombre());
        assertEquals("Algebra",listaOrdenada.get(2).getNombre());
    }

    @Test
    void generadorFilasOrden() {
        CreadorAgendas creadorAgendas = new CreadorAgendas();

        //creo comisiones
        Comision comision1 = new Comision();
        Comision comision2 = new Comision();
        Comision comision3 = new Comision();

        //cargo datos en comisiones
        comision1.setProfesor("carlos");
        comision2.setProfesor("juan");
        comision3.setProfesor("margarita");
        comision1.setDia(0);
        comision2.setDia(2);
        comision3.setDia(4);
        comision1.setPrioridad(false);
        comision2.setPrioridad(true);
        comision3.setPrioridad(true);
        comision1.setNumAula(210);
        comision2.setNumAula(310);
        comision3.setNumAula(512);
        comision1.setIdentificador(1);
        comision2.setIdentificador(2);
        comision3.setIdentificador(3);
        comision1.setHoraInicio(12);
        comision2.setHoraInicio(14);
        comision3.setHoraInicio(16);
        comision1.setMinInicio(10);
        comision2.setMinInicio(10);
        comision3.setMinInicio(10);
        comision1.setHoraFin(13);
        comision2.setHoraFin(14);
        comision3.setHoraFin(15);
        comision1.setMinFin(10);
        comision2.setMinFin(10);
        comision3.setMinFin(10);

        //creo materia
        Materia materia = new Materia();
        materia.setNombre("fisica");
        materia.setSemestre(false);
        materia.setAnio(2020);
        materia.setObligatoriedad(false);

        Materia materia2 = new Materia();
        materia2.setNombre("Algebra");
        materia2.setSemestre(false);
        materia2.setAnio(2020);
        materia2.setObligatoriedad(false);

        Materia materia3 = new Materia();
        materia3.setNombre("Matematicas");
        materia3.setSemestre(false);
        materia3.setAnio(2020);
        materia3.setObligatoriedad(false);

        //agrego comisiones a materia
        materia.setVariante(comision1);

        materia2.setVariante(comision1);
        materia2.setVariante(comision2);
        materia2.setVariante(comision3);

        materia3.setVariante(comision1);
        materia3.setVariante(comision2);
        materia3.setVariante(comision3);

        //creo mi lista de eventos con sus opciones
        ArrayList<EventoInterfaz> listaParaOrdenar = new ArrayList<EventoInterfaz>();
        listaParaOrdenar.add(materia);
        listaParaOrdenar.add(materia2);
        listaParaOrdenar.add(materia3);

        //oredeno, y luego materia1 deberia quedar al ultimo
         ArrayList<EventoInterfaz> eventosOrdenados = creadorAgendas.generadorFilasOrden(listaParaOrdenar);

         //testeo
        //para el primer evento
        assertEquals(false,eventosOrdenados.get(0).getListaVariantes().get(0).getPrioridad());
        //para el segundo evento
        assertEquals(true,eventosOrdenados.get(1).getListaVariantes().get(0).getPrioridad());
        assertEquals(true,eventosOrdenados.get(1).getListaVariantes().get(1).getPrioridad());
        assertEquals(false,eventosOrdenados.get(1).getListaVariantes().get(2).getPrioridad());
        // para el tercer evento
        assertEquals(true,eventosOrdenados.get(2).getListaVariantes().get(0).getPrioridad());
        assertEquals(true,eventosOrdenados.get(2).getListaVariantes().get(1).getPrioridad());
        assertEquals(false,eventosOrdenados.get(2).getListaVariantes().get(2).getPrioridad());


    }

    @Test
    void tieneUnPriori() {
        CreadorAgendas creadorAgendas = new CreadorAgendas();

        //creo comisiones
        Comision comision1 = new Comision();
        Comision comision2 = new Comision();
        Comision comision3 = new Comision();

        //cargo datos en comisiones
        comision1.setProfesor("carlos");
        comision2.setProfesor("juan");
        comision3.setProfesor("margarita");
        comision1.setDia(0);
        comision2.setDia(2);
        comision3.setDia(4);
        comision1.setPrioridad(false);
        comision2.setPrioridad(true);
        comision3.setPrioridad(false);
        comision1.setNumAula(210);
        comision2.setNumAula(310);
        comision3.setNumAula(512);
        comision1.setIdentificador(1);
        comision2.setIdentificador(2);
        comision3.setIdentificador(3);
        comision1.setHoraInicio(12);
        comision2.setHoraInicio(14);
        comision3.setHoraInicio(16);
        comision1.setMinInicio(10);
        comision2.setMinInicio(10);
        comision3.setMinInicio(10);
        comision1.setHoraFin(13);
        comision2.setHoraFin(14);
        comision3.setHoraFin(15);
        comision1.setMinFin(10);
        comision2.setMinFin(10);
        comision3.setMinFin(10);

        //creo materia
        Materia materia = new Materia();
        materia.setNombre("fisica");
        materia.setSemestre(false);
        materia.setAnio(2020);
        materia.setObligatoriedad(false);

        Materia materia2 = new Materia();
        materia.setNombre("Algebra");
        materia.setSemestre(false);
        materia.setAnio(2020);
        materia.setObligatoriedad(false);

        //agrego comisiones a materia
        materia.setVariante(comision1);
        materia.setVariante(comision2);
        materia.setVariante(comision3);

        materia2.setVariante(comision1);

        //test correcto
        assertEquals(true,creadorAgendas.tieneUnPriori(materia));

        //test error
        assertEquals(false,creadorAgendas.tieneUnPriori(materia2));
    }

    @Test
    void contructorMateriaSimple() {
        CreadorAgendas creadorAgendas = new CreadorAgendas();

        //creo comisiones
        Comision comision1 = new Comision();
        Comision comision2 = new Comision();
        Comision comision3 = new Comision();

        //cargo datos en comisiones
        comision1.setProfesor("carlos");
        comision2.setProfesor("juan");
        comision3.setProfesor("margarita");
        comision1.setDia(0);
        comision2.setDia(2);
        comision3.setDia(4);
        comision1.setPrioridad(true);
        comision2.setPrioridad(false);
        comision3.setPrioridad(true);
        comision1.setNumAula(210);
        comision2.setNumAula(310);
        comision3.setNumAula(512);
        comision1.setIdentificador(1);
        comision2.setIdentificador(2);
        comision3.setIdentificador(3);
        comision1.setHoraInicio(12);
        comision2.setHoraInicio(14);
        comision3.setHoraInicio(16);
        comision1.setMinInicio(10);
        comision2.setMinInicio(10);
        comision3.setMinInicio(10);
        comision1.setHoraFin(13);
        comision2.setHoraFin(14);
        comision3.setHoraFin(15);
        comision1.setMinFin(10);
        comision2.setMinFin(10);
        comision3.setMinFin(10);

        //creo materia
        Materia materia = new Materia();
        materia.setNombre("fisica");
        materia.setSemestre(false);
        materia.setAnio(2020);
        materia.setObligatoriedad(false);

        //agrego comisiones a materia
        materia.setVariante(comision1);
        materia.setVariante(comision2);
        materia.setVariante(comision3);

        Materia materiaParaTest = creadorAgendas.contructorMateriaSimple(materia,comision2);
        assertEquals(2,materiaParaTest.getVariante(0).getIdentificador());
    }

    @Test
    void contructorEventoSimple() {
        CreadorAgendas creadorAgendas = new CreadorAgendas();

        //creo comisiones
        OpcionEP Opcion1 = new OpcionEP();
        OpcionEP Opcion2 = new OpcionEP();
        OpcionEP Opcion3 = new OpcionEP();

        //cargo datos en comisiones
        Opcion1.setLugar("cordoba");
        Opcion1.setLugar("cordoba");
        Opcion1.setLugar("cordoba");
        Opcion1.setDia(0);
        Opcion2.setDia(2);
        Opcion3.setDia(4);
        Opcion1.setPrioridad(true);
        Opcion2.setPrioridad(false);
        Opcion3.setPrioridad(true);
        Opcion1.setIdentificador(1);
        Opcion2.setIdentificador(2);
        Opcion3.setIdentificador(3);
        Opcion1.setHoraInicio(12);
        Opcion2.setHoraInicio(14);
        Opcion3.setHoraInicio(16);
        Opcion1.setMinInicio(10);
        Opcion2.setMinInicio(10);
        Opcion3.setMinInicio(10);
        Opcion1.setHoraFin(13);
        Opcion2.setHoraFin(14);
        Opcion3.setHoraFin(15);
        Opcion1.setMinFin(10);
        Opcion2.setMinFin(10);
        Opcion3.setMinFin(10);

        //creo materia
        Materia materia = new Materia();
        materia.setNombre("fisica");
        materia.setSemestre(false);
        materia.setAnio(2020);
        materia.setObligatoriedad(false);

        //agrego comisiones a materia
        materia.setVariante(Opcion1);
        materia.setVariante(Opcion2);
        materia.setVariante(Opcion3);

        Materia materiaParaTest = creadorAgendas.contructorMateriaSimple(materia,Opcion2);
        assertEquals(2,materiaParaTest.getVariante(0).getIdentificador());
    }
}