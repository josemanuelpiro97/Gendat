package BaseDeDatos;

import java.util.ArrayList;

public class EventoParticular implements EventoInterfaz{
    //-----------VARIABLES----------------------
    //******************************************

    //-----------Interface needed-------------
    /**
     * nombre del evento extracurricular
     */
    private String nombre;
    /**
     * flag de obligatoriedad de la materia
     */
    private boolean obligatoriedad;
    /**
     * lista de variantes para esta actividad extracurricular
     */
    private ArrayList<VarianteInterfaz> variantes;

    //------------eventoParticular needed--------------
    /**
     * rubro de la actividad, Ej: deporte, trabajo, etc
     */
    private String rubro;

    //-------------CONSTRUCTOR------------------
    //******************************************
    /**
     *  constructor del evento
     */
    public EventoParticular(){
        this.variantes = new ArrayList<VarianteInterfaz>();
    }

    //-------------GETTERS----------------------
    //******************************************

    /**
     * @brief getter del nombre del evento
     * @return nombre del evento
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @brief consulta si el evento es obligatorio para construir las agendas o no
     * @return obligatoriedad del evento
     */
    public boolean isObligatoria() {
        return this.obligatoriedad;
    }

    /**
     * @brief obtiene una variante en particular de la lista de variantes
     * @param indice indice de la variante que busco
     * @return variante en particular requerida
     */
    public VarianteInterfaz getVariante(int indice) {
        if(indice > this.variantes.size() || indice < 0)
            throw new IllegalArgumentException("indice fuera de rango");

        return this.variantes.get(indice);
    }

    /**
     * @brief getter de la lista de variantes del evento
     * @return lista de variantes
     */
    public ArrayList<VarianteInterfaz> getListaVariantes() {
        return this.variantes;
    }

    /**
     * @brief getter del rubro del evento
     * @return rubro del evento
     */
    public String getRubro(){
        return this.rubro;
    }


    //-------------SETTERS----------------------
    //******************************************

    /**
     * @brief setter del nombre del evento
     * @param nombre nombre del evento, este no puede ser ni un espacio ni una
     *               cadena vacia
     * @return true en caso de que el parametro cumpla con las restricciones,
     *         falso en caso contrario
     */
    public boolean setNombre(String nombre) {
        if (nombre.equals(" ") || nombre.length() == 0)
            return false;

        this.nombre = nombre;
        return true;
    }

    /**
     * @brief establece si el evento es obligatorio para crear las agendas
     * @param obli flag de obligatoriedad
     */
    public void setObligatoriedad(boolean obli) {
        this.obligatoriedad = obli;
    }

    /**
     * @brief agrega una variante a la lista de variantes del evento
     * @param variante variante a agregar
     */
    public void setVariante(VarianteInterfaz variante) {
        this.variantes.add(variante);
    }

    /**
     * @brief setter del rubro del evento
     * @param rubro rubro del evento
     */
    public boolean setRubro(String rubro){
        if(rubro.equals(""))
            return false;

        this.rubro = rubro; return true;
    }
}
