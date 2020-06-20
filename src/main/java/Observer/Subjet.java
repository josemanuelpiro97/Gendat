package Observer;

public interface Subjet {

    //Interfaz grafica dedicada a la unificacion de comportamiento de los sujetos
    public void registrarObservador();
    public void removerObservador();
    public void notificarObservador();
}
