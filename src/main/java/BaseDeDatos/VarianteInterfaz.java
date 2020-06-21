package BaseDeDatos;

public interface VarianteInterfaz {
    //-----------getters-------------
    public int getHoraInicio();
    public int getMinInicio();
    public int getHoraFin();
    public int getMinFin();
    public boolean getPrioridad();
    public int getIdentificador();
    public int getDia();

    //-----------setters-------------
    public boolean setHoraInicio(int hora);
    public boolean setMinInicio(int minuto);
    public boolean setHoraFin(int hora);
    public boolean setMinFin(int minuto);
    public boolean setIdentificador(int iden);
    public void setPrioridad(boolean priori);
    public boolean setDia(int dia);


}
