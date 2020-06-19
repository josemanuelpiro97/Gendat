package BaseDeDatos;

import java.util.ArrayList;

public interface EventoInterfaz {
    //-----------getters-------------
    public String getNombre();
    public boolean isObligatoria();
    public VarianteInterfaz getVariante (int indice);
    public ArrayList<VarianteInterfaz> getListaVariantes();

    //-----------setters-------------
    public boolean setNombre(String nombre);
    public void setObligatoriedad(boolean obli);
    public void setVariante(VarianteInterfaz variante);
}
