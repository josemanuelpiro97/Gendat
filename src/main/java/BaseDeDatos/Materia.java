package BaseDeDatos;

import java.util.ArrayList;

public class Materia implements EventoInterfaz {
    //-----------VARIABLES----------------------
    //******************************************

    //-----------Interface needed-------------
    private String nombre;
    private boolean obligatoriedad;
    private ArrayList<VarianteInterfaz> variantes;
    //------------materia needed--------------
    private int anio;
    private int semestre;
    private boolean optativa;

    //-------------CONSTRUCTOR------------------
    //******************************************
    public void Materia(String nombre, boolean obligatoriedad, int anio, int semestre, boolean optativa) {
        this.nombre = nombre;
        this.obligatoriedad = obligatoriedad;
        this.anio = anio;
        this.semestre = semestre;
        this.optativa = optativa;
        this.variantes = new ArrayList<VarianteInterfaz>();
    }

    //-------------GETTERS----------------------
    //******************************************
    public String getNombre() {
        return this.nombre;
    }

    public boolean isObligatoria() {
        return this.obligatoriedad;
    }

    public VarianteInterfaz getVariante(int indice) {
        //security check
        if (indice > this.variantes.size() || indice < 0)
            throw new IllegalArgumentException("indice fuera de rango");

        return this.variantes.get(indice);
    }

    public ArrayList<VarianteInterfaz> getListaVariantes() {
        return this.variantes;
    }

    public int getAnio() {
        return this.anio;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public boolean isOptativa() {
        return this.optativa;
    }

    //-------------SETTERS----------------------
    //******************************************
    public boolean setNombre(String nombre) {
        if (nombre.equals(" ") || nombre.length() == 0)
            return false;

        this.nombre = nombre;
        return true;
    }

    public void setObligatoriedad(boolean obli) {
        this.obligatoriedad = obli;
    }

    public void setVariante(VarianteInterfaz variante) {
        this.variantes.add(variante);
    }

    public boolean setAnio(int anio) {
        if (anio < 0) {
            System.out.println("Anio invalido");
            return false;
        }
        this.anio = anio;
        return true;
    }

    public boolean setSemestre(int sem) {
        if (sem < 0) {
            System.out.println("Semestre invalido");
            return false;
        }
        this.semestre = sem;
        return true;
    }

    public void setOptativa(boolean opt) {
        this.optativa = opt;
    }
}
