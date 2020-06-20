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
    public boolean setHoraInicio();
    public boolean setMinInicio();
    public boolean setHoraFin();
    public boolean setMinFin();
    public boolean setPrioridad(boolean priori);
}
