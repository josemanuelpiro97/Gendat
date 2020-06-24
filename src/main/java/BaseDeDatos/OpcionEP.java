package BaseDeDatos;

public class OpcionEP implements VarianteInterfaz {
    //-----------VARIABLES----------------------
    //******************************************
    //-----------Interface needed-------------
    private int horaInicio;
    private int horaFin;
    private int minutoInicio;
    private int minutoFin;
    private int dia;
    private boolean prioritario;
    private int ID=0;
    private static int idCount = 1;
    //------------requerido por opcionEP---------
   String lugar;

    //-------------CONSTRUCTOR------------------
    //******************************************

    /**
     * constructor vacio
     */
    public OpcionEP(){};


    //-------------GETTERS----------------------
    //******************************************

    /**
     * @getter de lugar de la opcion del evento
     * @return
     */
    public String getLugar(){
        return this.lugar;
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
        return this.ID;
    }

    @Override
    public int getDia() {
        return this.dia;
    }

    //-------------SETTERS----------------------
    //******************************************
    public void setLugar(String lugar){
        this.lugar = lugar;
    }

    @Override
    public boolean setHoraInicio(int hora) {
        if(hora < 0 || hora >23)
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
        if(hora < 0 || hora > 23)
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
        return false;
    }

    public void setID() {
        this.ID = OpcionEP.idCount;
        OpcionEP.idCount++;
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
