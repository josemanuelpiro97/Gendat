package BaseDeDatos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void addEvento() {
        Usuario usuario = new Usuario("jose manuel");

        //creo materia con su comision
        Comision nuevaComision = new Comision();
        nuevaComision.setHoraInicio(7);
        nuevaComision.setMinInicio(15);
        nuevaComision.setHoraFin(9);
        nuevaComision.setMinFin(25);
        nuevaComision.setIdentificador(1);
        nuevaComision.setNumAula(112);
        nuevaComision.setProfesor("Silvestre");
        nuevaComision.setPrioridad(true);

        Materia nuevoEvento = new Materia();
        nuevoEvento.setNombre("Algebra");
        nuevoEvento.setObligatoriedad(true);
        nuevoEvento.setAnio(2021);
        nuevoEvento.setSemestre(false);
        nuevoEvento.setVariante(nuevaComision);

        assertEquals("Evento agregado",usuario.addEvento(nuevoEvento));
        assertEquals("Evento duplicado",usuario.addEvento(nuevoEvento));

    }

    @Test
    void addVariante() {
        Usuario usuario = new Usuario("jose manuel");

        //creo materia con su comision
        //comision 1
        Comision nuevaComision = new Comision();
        nuevaComision.setHoraInicio(7);
        nuevaComision.setMinInicio(15);
        nuevaComision.setHoraFin(9);
        nuevaComision.setMinFin(25);
        nuevaComision.setIdentificador(1);
        nuevaComision.setNumAula(112);
        nuevaComision.setProfesor("Silvestre");
        nuevaComision.setPrioridad(true);
        nuevaComision.setDia(0);
        //comision 2
        Comision nuevaComision2 = new Comision();
        nuevaComision2.setHoraInicio(10);
        nuevaComision2.setMinInicio(15);
        nuevaComision2.setHoraFin(12);
        nuevaComision2.setMinFin(25);
        nuevaComision2.setIdentificador(2);
        nuevaComision2.setNumAula(112);
        nuevaComision2.setProfesor("macheado");
        nuevaComision2.setPrioridad(true);
        nuevaComision2.setDia(0);
        //comision 3
        Comision nuevaComision3 = new Comision();
        nuevaComision3.setHoraInicio(9);
        nuevaComision3.setMinInicio(24);
        nuevaComision3.setHoraFin(9);
        nuevaComision3.setMinFin(26);
        nuevaComision3.setIdentificador(3);
        nuevaComision3.setNumAula(112);
        nuevaComision3.setProfesor("delgado");
        nuevaComision3.setPrioridad(true);
        nuevaComision3.setDia(0);
        //comision 4
        Comision nuevaComision4 = new Comision();
        nuevaComision4.setHoraInicio(25);
        nuevaComision4.setMinInicio(24);
        nuevaComision4.setHoraFin(9);
        nuevaComision4.setMinFin(26);
        nuevaComision4.setIdentificador(3);
        nuevaComision4.setNumAula(112);
        nuevaComision4.setProfesor("delgado");
        nuevaComision4.setPrioridad(true);
        nuevaComision4.setDia(0);


        //materia 1
        Materia nuevoEvento = new Materia();
        nuevoEvento.setNombre("Algebra");
        nuevoEvento.setObligatoriedad(true);
        nuevoEvento.setAnio(2021);
        nuevoEvento.setSemestre(false);
        //materia 2
        Materia nuevoEvento2 = new Materia();
        nuevoEvento2.setNombre("concurrente");
        nuevoEvento2.setObligatoriedad(true);
        nuevoEvento2.setAnio(2021);
        nuevoEvento2.setSemestre(false);
        //materia 3
        Materia nuevoEvento3 = new Materia();
        nuevoEvento3.setNombre("fisica");
        nuevoEvento3.setObligatoriedad(false);
        nuevoEvento3.setAnio(2021);
        nuevoEvento3.setSemestre(false);


        //----------------------PRUEBAS---------------------------------------------------------------------------------
        //agrego una materia
        usuario.addEvento(nuevoEvento);
        //agrego comision a materia
        String resultado1 = usuario.addVariante(nuevaComision,nuevoEvento.getNombre());
        //pruebo agregar dos comisiones, siendo que es materia obligatoria
        String resultado2 = usuario.addVariante(nuevaComision2,nuevoEvento.getNombre());
        //pruebo agregar una variante en una materia que no existe
        String resultado3 = usuario.addVariante(nuevaComision,"nombreErroneo");
        //agrego una nueva materia
        usuario.addEvento(nuevoEvento2);
        //pruebo agregar una comision a la materia nueva, que tenga el mismo horario que la primera materia agregada
        String resultado4 = usuario.addVariante(nuevaComision3,nuevoEvento2.getNombre());
        //agrego una nueva materia
        usuario.addEvento(nuevoEvento3);
        //agrego una variante con error en los horarios
        String resultado5 = usuario.addVariante(nuevaComision4,nuevoEvento3.getNombre());

        assertEquals("Variante agregada",resultado1);
        assertEquals("Solo puede haber una variante por evento obligatorio",resultado2);
        assertEquals("Evento no encontrado",resultado3);
        assertEquals("Este evento ocupa una franja horaria que ya esta ocupada por una variante obligatoria",
                resultado4);
        assertEquals("Horario invalido",resultado5);
        //--------------------------------------------------------------------------------------------------------------
    }

    @Test
    void quitEvento() {
        Usuario usuario = new Usuario("jose manuel");

        //creo materia con su comision
        //comision 1
        Comision nuevaComision = new Comision();
        nuevaComision.setHoraInicio(7);
        nuevaComision.setMinInicio(15);
        nuevaComision.setHoraFin(9);
        nuevaComision.setMinFin(25);
        nuevaComision.setIdentificador(1);
        nuevaComision.setNumAula(112);
        nuevaComision.setProfesor("Silvestre");
        nuevaComision.setPrioridad(true);
        nuevaComision.setDia(0);
        //comision 2
        Comision nuevaComision2 = new Comision();
        nuevaComision2.setHoraInicio(10);
        nuevaComision2.setMinInicio(15);
        nuevaComision2.setHoraFin(12);
        nuevaComision2.setMinFin(25);
        nuevaComision2.setIdentificador(2);
        nuevaComision2.setNumAula(112);
        nuevaComision2.setProfesor("macheado");
        nuevaComision2.setPrioridad(true);
        nuevaComision2.setDia(0);

        //materia 1
        Materia nuevoEvento = new Materia();
        nuevoEvento.setNombre("Algebra");
        nuevoEvento.setObligatoriedad(true);
        nuevoEvento.setAnio(2021);
        nuevoEvento.setSemestre(false);
        nuevoEvento.setVariante(nuevaComision);
        //materia 2
        Materia nuevoEvento2 = new Materia();
        nuevoEvento2.setNombre("concurrente");
        nuevoEvento2.setObligatoriedad(false);
        nuevoEvento2.setAnio(2021);
        nuevoEvento2.setSemestre(false);
        nuevoEvento2.setVariante(nuevaComision2);

        //----------------------PRUEBAS---------------------------------------------------------------------------------
        //agrego una materia
        usuario.addEvento(nuevoEvento);
        usuario.addEvento(nuevoEvento2);

        //pruebo eliminar un evento
        assertEquals("Evento eliminado",usuario.quitEvento("Algebra"));
        //pruebo que no encuentre el evento
        assertEquals("Evento no encontrado", usuario.quitEvento("materiaError"));
    }

    @Test
    void quitVariante() {
        Usuario usuario = new Usuario("jose manuel");

        //creo materia con su comision
        //comision 1
        Comision nuevaComision = new Comision();
        nuevaComision.setHoraInicio(7);
        nuevaComision.setMinInicio(15);
        nuevaComision.setHoraFin(9);
        nuevaComision.setMinFin(25);
        nuevaComision.setIdentificador(1);
        nuevaComision.setNumAula(112);
        nuevaComision.setProfesor("Silvestre");
        nuevaComision.setPrioridad(true);
        nuevaComision.setDia(0);

        //comision 2
        Comision nuevaComision2 = new Comision();
        nuevaComision2.setHoraInicio(10);
        nuevaComision2.setMinInicio(15);
        nuevaComision2.setHoraFin(12);
        nuevaComision2.setMinFin(25);
        nuevaComision2.setIdentificador(2);
        nuevaComision2.setNumAula(112);
        nuevaComision2.setProfesor("macheado");
        nuevaComision2.setPrioridad(true);
        nuevaComision2.setDia(0);

        //materia 1
        Materia nuevoEvento = new Materia();
        nuevoEvento.setNombre("Algebra");
        nuevoEvento.setObligatoriedad(true);
        nuevoEvento.setAnio(2021);
        nuevoEvento.setSemestre(false);
        nuevoEvento.setVariante(nuevaComision);
        nuevoEvento.setVariante(nuevaComision2);

        //----------------------PRUEBAS---------------------------------------------------------------------------------
        //agrego una materia
        usuario.addEvento(nuevoEvento);

        //pruebo que no se encuentre el evento
        assertEquals("Evento no encontrado",
                usuario.quitVariante("eventoError",nuevaComision.getIdentificador()));
        // pruebo que no encuentre la variante
        assertEquals("Variante no encontrada", usuario.quitVariante("Algebra",5));
        //pruebo que se pueda eliminar bien la variante
        assertEquals("Variable eliminado",
                usuario.quitVariante("Algebra",nuevaComision.getIdentificador()));
    }

    @Test
    // a fin de este test se debera poner el campo horariosOcupados de la clase Usuario como publico
    void estaEnRango() {
        Usuario usuario = new Usuario("jose manuel");

        //para comi 1 y 2
        int HORA_INI_1=10;
        int HORA_FIN_1=12;
        int MIN_INI_1=15;
        int MIN_FIN_1=25;
        //para comi 3
        int HORA_INI_3=16;
        int HORA_FIN_3=12;
        int MIN_INI_3=18;
        int MIN_FIN_3=25;
        int DIA = 0;

        //comision 1
        Comision nuevaComision = new Comision();
        nuevaComision.setHoraInicio(HORA_INI_1);
        nuevaComision.setMinInicio(MIN_INI_1);
        nuevaComision.setHoraFin(HORA_FIN_1);
        nuevaComision.setMinFin(MIN_FIN_1);
        nuevaComision.setDia(0);
        //comision 2 (error)
        Comision nuevaComision2 = new Comision();
        nuevaComision2.setHoraInicio(HORA_INI_1);
        nuevaComision2.setMinInicio(MIN_INI_1);
        nuevaComision2.setHoraFin(HORA_FIN_1);
        nuevaComision2.setMinFin(MIN_FIN_1);
        nuevaComision2.setDia(0);
        //comision 3 (error)
        Comision nuevaComision3 = new Comision();
        nuevaComision3.setHoraInicio(HORA_INI_3);
        nuevaComision3.setMinInicio(MIN_INI_3);
        nuevaComision3.setHoraFin(HORA_FIN_3);
        nuevaComision3.setMinFin(MIN_FIN_3);
        nuevaComision3.setDia(0);

        //seteo los horarios de una comision
        usuario.setHorarioOcupado(nuevaComision);
        //reviso contra unos horarios iguales
        assertEquals(false,usuario.estaEnRango(nuevaComision2));
        //reviso contra unos horarios distintos
        assertEquals(true,usuario.estaEnRango(nuevaComision3));
    }

    @Test
    void setHorarioOcupado() {
        Usuario usuario = new Usuario("jose manuel");

        int HORA_INI=10;
        int HORA_FIN=12;
        int MIN_INI=15;
        int MIN_FIN=25;
        int DIA = 0;

        //comision 1
        Comision nuevaComision = new Comision();
        nuevaComision.setHoraInicio(HORA_INI);
        nuevaComision.setMinInicio(MIN_INI);
        nuevaComision.setHoraFin(HORA_FIN);
        nuevaComision.setMinFin(MIN_FIN);

        usuario.setHorarioOcupado(nuevaComision);

        for (int i=(HORA_INI*60+MIN_INI)-1 ; i < (HORA_FIN*60+MIN_FIN)-1 ; i++){
            assertEquals(1,usuario.horariosOcupados[DIA][i]);
        }
    }

    @Test
    void quitHorarioOcupado() {
        Usuario usuario = new Usuario("jose manuel");

        int HORA_INI=10;
        int HORA_FIN=12;
        int MIN_INI=15;
        int MIN_FIN=25;
        int DIA = 0;

        //comision 1
        Comision nuevaComision = new Comision();
        nuevaComision.setHoraInicio(HORA_INI);
        nuevaComision.setMinInicio(MIN_INI);
        nuevaComision.setHoraFin(HORA_FIN);
        nuevaComision.setMinFin(MIN_FIN);

        usuario.setHorarioOcupado(nuevaComision);
        usuario.quitHorarioOcupado(nuevaComision);

        for (int i=(HORA_INI*60+MIN_INI)-1 ; i < (HORA_FIN*60+MIN_FIN)-1 ; i++){
            assertEquals(0,usuario.horariosOcupados[DIA][i]);
        }
    }
}