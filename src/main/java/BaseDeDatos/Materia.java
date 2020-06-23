package BaseDeDatos;

import java.util.ArrayList;

public class Materia implements EventoInterfaz {
    //-----------VARIABLES----------------------
    //******************************************

    //-----------requerido por interfaz--------
    /**
     * nombre de la materia
     */
    private String nombre;
    /**
     * flag de obligatoriedad de la materia
     */
    private boolean obligatoriedad;
    /**
     * lista de comisiones para esta materia
     */
    private ArrayList<VarianteInterfaz> comisiones;
    //------------requerido por materia---------
    /**
     * anio de cursado de la materia
     */
    private int anio;
    /**
     * semestre de cursado de la materia
     */
    private boolean semestre; //--> 0 en caso de primer semestre, 1 en caso de segundo semestre


    //-------------CONSTRUCTOR------------------
    //******************************************
    /**
     * constructor vacio
     */
    public Materia() {
        this.comisiones = new ArrayList<VarianteInterfaz>();
    }

    //-------------GETTERS----------------------
    //******************************************

    /**
     * @brief getter del nombre de la materia
     * @return nombre de la materia
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @brief indica si la materia es obligatoria o no para la generacion de agendas
     * @return flag de obligatoriedad
     */
    public boolean isObligatoria() {
        return this.obligatoriedad;
    }

    /**
     * @brief obtiene una comision en particular de la materia
     * @param indice indice en el arreglo de comisiones, este no puede ser mayor al
     *               numero total de comisiones ni menor a 0
     * @return variante requerida
     */
    public VarianteInterfaz getVariante(int indice) {
        //security check
        if (indice > this.comisiones.size() || indice < 0)
            throw new IllegalArgumentException("indice fuera de rango");

        return this.comisiones.get(indice);
    }

    /**
     * @brief obtiene toda las comisiones de la materia
     * @return lista de comisiones
     */
    public ArrayList<VarianteInterfaz> getListaVariantes() {return this.comisiones;}

    /**
     * @brief getter del anio de la materia
     * @return anio de la materia
     */
    public int getAnio() {
        return this.anio;
    }

    /**
     * @brief getter del numero de semestre de la materia.
     * @return numero de semestre
     */
    public boolean getSemestre() {
        return this.semestre;
    }


    //-------------SETTERS----------------------
    //******************************************

    /**
     * @brief establece el nombre de la materia
     * @param nombre nombre de la materia, este no podra ser un espacio ni una cadena
     *               vacia
     * @return true en caso de que el nombre cumpla con las resticciones y sea seteado
     *         correctamente, falso en otro caso
     */
    public boolean setNombre(String nombre) {
        if (nombre.equals(" ") || nombre.length() == 0)
            return false;

        this.nombre = nombre;
        return true;
    }

    /**
     * @brief establece si la materia es obligatoria para la generacion de agendas
     *        o no
     * @param obli variable booleana de obligatoriedad
     */
    public void setObligatoriedad(boolean obli) {
        this.obligatoriedad = obli;
    }

    /**
     * @brief agrega una comision a la lista de comisiones
     * @param comision comision a agregar
     */
    public void setVariante(VarianteInterfaz comision) {
        this.comisiones.add(comision);
    }

    /**
     * @brief establece el anio de plan estudiantil al que pertenece la materia
     * @param anio anio a establecer, este no puede ser negativo
     * @return true en caso de que el parametro sea corecto, falso en caso contrario
     */
    public boolean setAnio(int anio) {
        if (anio < 1) {
            return false;
        }
        this.anio = anio;
        return true;
    }

    /**
     * @brief establece el semestre en que se cursara la materia
     * @param sem semestre de cursado de la materia, no puede ser menor a 0
     * @return true en caso de que el parametro sea correcto, falso en caso contrario
     */
    public void setSemestre(boolean sem) {this.semestre = sem; }

}
