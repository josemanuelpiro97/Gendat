package BaseDeDatos;

public class Comision implements VarianteInterfaz {
    //-----------VARIABLES----------------------
    //******************************************
    //-----------Interface needed-------------
    int horaInicio;
    int horaFin;
    int minutoInicio;
    int minutoFin;
    int dia;
    boolean prioritario;
    int numComision;
    //------------requerido por comision---------
    String profesor;
    int numAula;

    //-------------CONSTRUCTOR------------------
    //******************************************

    /**
     * constructor vacio
     */
    public Comision(){};

    //-------------GETTERS----------------------
    //******************************************
    /**
     * @brief getter del nombre del profesor
     * @return nombre del profesor
     */
    public String getProfesor(){
        return this.profesor;
    }

    /**
     * @brief getter del numero de aula
     * @return numero de aula
     */
    public int getNumAula(){
        return this.numAula;
    }

    @Override
    public int getHoraInicio() {
        return this.horaInicio;
    }

    @Override
    public int getMinInicio() {
        return this.minutoInicio;
    }

    @Override
    public int getHoraFin() {
        return this.horaFin;
    }

    @Override
    public int getMinFin() {
        return this.minutoFin;
    }

    @Override
    public boolean getPrioridad() {
        return this.prioritario;
    }

    @Override
    public int getIdentificador() {
        return this.numComision;
    }

    @Override
    public int getDia() {
        return this.dia;
    }

    //-------------SETTERS----------------------
    //******************************************
    /**
     * @brief setter de nombre de profesor
     * @param nombre nombre del profesor
     */
    public void setProfesor(String nombre){
        this.profesor = nombre;
    }

    /**
     * @brief setter de numero de aula
     * @param aula numero de aula
     * @return true en caso de que el numero de aula sea correcto, falso en caso contrario
     */
    public boolean setNumAula(int aula){
        if(aula < 0)
            return false;
        else {
            this.numAula = aula;
            return true;
        }
    }

    @Override
    public boolean setHoraInicio(int hora) {
        if(hora < 0 || hora >24)
            return false;
        else{
            this.horaInicio = hora;
            return true;
        }
    }

    @Override
    public boolean setMinInicio(int minuto) {
        if(minuto < 0 || minuto > 59)
            return false;
        else{
            this.minutoInicio = minuto;
            return true;
        }
    }

    @Override
    public boolean setHoraFin(int hora) {
        if(hora < 0 || hora > 24)
            return false;
        else{
            this.horaFin = hora;
            return true;
        }
    }

    @Override
    public boolean setMinFin(int minuto) {
        if(minuto < 0 || minuto > 59)
            return false;
        else{
            this.minutoFin = minuto;
            return true;
        }
    }

    @Override
    public boolean setIdentificador(int iden) {
        if(iden < 0)
            return false;
        else{
            this.numComision = iden;
            return true;
        }
    }

    @Override
    public void setPrioridad(boolean priori) {
        this.prioritario = priori;
    }

    @Override
    public boolean setDia(int dia) {
        if(dia < 0 || dia > 6)
            return false;
        else{
            this.dia = dia;
            return true;
        }
    }
}
