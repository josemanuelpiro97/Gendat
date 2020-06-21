package BaseDeDatos;

public class OpcionEP implements VarianteInterfaz {
    //-----------VARIABLES----------------------
    //******************************************
    //-----------Interface needed-------------
    int horaInicio;
    int horaFin;
    int minutoInicio;
    int minutoFin;
    int dia;
    boolean prioritario;
    int ID;
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
        if(hora < 0 || hora >24)
            return false;
        else{
            this.horaInicio = hora;
            return true;
        }
    }

    @Override
    public boolean setMinInicio(int minuto) {
        if(minuto < 0 || minuto > 60)
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
        if(minuto < 0 || minuto > 60)
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
            this.ID = iden;
            return true;
        }
    }


    @Override
    public void setPrioridad(boolean priori) {
        this.prioritario = priori;
    }
}
