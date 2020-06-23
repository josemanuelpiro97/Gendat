package BaseDeDatos;

import java.util.ArrayList;

public class BaseDeDatos {
    /**
     * lista de usuarios
     */
    private ArrayList<Usuario> listaDeUsuarios;

    /**
     * @brief constructor de clase
     */
    public BaseDeDatos(){
        this.listaDeUsuarios = new ArrayList<Usuario>();
    }

    /**
     * @brief agrega un nuevo usuario en la base de datos
     * @param nombreDeUsuario nombre de usuario a agregar
     * @return true en caso de que el nombre sea correcto, falso en caso contrario
     */
    public boolean addUsuario(String nombreDeUsuario){
        if (nombreDeUsuario.equals(" ") || nombreDeUsuario.length() == 0)
            return false;

        this.listaDeUsuarios.add(new Usuario(nombreDeUsuario));
        return true;
    }

    /**
     * permite obtener un usuario de la lista de usuarios
     * @param nombreDeUsuario nombre del usuario buscado
     * @return usuario buscado, null en caso de que no se encuentre el usuario
     */
    public Usuario getUsuario(String nombreDeUsuario){
        for (Usuario usuarioActual:this.listaDeUsuarios){
            if(usuarioActual.getNombreDeUsuario().equals(nombreDeUsuario))
                return usuarioActual;
        }
        return null;
    }

}
