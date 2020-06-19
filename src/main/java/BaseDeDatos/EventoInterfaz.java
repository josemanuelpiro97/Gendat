package BaseDeDatos;

import java.util.ArrayList;

public interface EventoInterfaz {
    //-----------getters-------------
    public String getNombre();
    public boolean getObligatoriedad();
    public VarianteInterfaz getVariante (int indice);
    public ArrayList<VarianteInterfaz> getListaVariantes();

    //-----------setters-------------
    public boolean setNombre(String nombre);
    public boolean setObligatoriedad(boolean obli);
    public boolean setVariante(VarianteInterfaz variante);
}
