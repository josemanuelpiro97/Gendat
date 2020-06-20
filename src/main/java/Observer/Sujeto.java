package Observer;

public interface Sujeto {

    //Interfaz grafica dedicada a la unificacion de comportamiento de los sujetos

    /**
     * @brief registra un nuevo observador y retorna su ID
     * @param nuevoObservador observador a ser agregado
     * @return ID
     */
    public int registrarObservador(Observador nuevoObservador);

    /**
     * @brief elimina de la lista de observadores
     * @param observadorPorEliminar observador a eliminar
     */
    public void removerObservador(Observador observadorPorEliminar);

    /**
     * @brief notifica a los observadores que los datos se actualizaron
     */
    public void notificarObservador();
}
