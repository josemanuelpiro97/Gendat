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

        //chequeo duplicado
        for (Usuario usuarioActual:this.listaDeUsuarios){
            if(usuarioActual.getNombreDeUsuario().equals(nombreDeUsuario))
                return false;
        }

        this.listaDeUsuarios.add(new Usuario(nombreDeUsuario));
        return true;
    }

    /**
     * @brief remueve un usuario de la lista de usuarios
     * @param nombreDeUsuario nombre de usuario a eliminar
     */
    public void quitUsuario(String nombreDeUsuario){
        for (Usuario usuarioActual:this.listaDeUsuarios){
            if(usuarioActual.getNombreDeUsuario().equals(nombreDeUsuario)) {
                this.listaDeUsuarios.remove(usuarioActual);
                break;
            }
        }
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

    /**
     * @brief permite obtener el indice del usuario
     * @param nombreDeUsuario nombre de usuario del cual quiero saber el indice
     * @return indice de usuario
     */
    public int getIndex(String nombreDeUsuario){
        for (int i =0 ; i< this.listaDeUsuarios.size();i++){
            if(this.listaDeUsuarios.get(i).getNombreDeUsuario().equals(nombreDeUsuario))
                return i;
        }
        //retorno un valor erroneo conocido
        return 9999;
    }

    /**
     * @brief  imprime todos los nombres de los usuarios registrados
     */
    public void toPrint(){
        for (Usuario usuarioActual: this.listaDeUsuarios){
            System.out.println(usuarioActual.getNombreDeUsuario());
        }
    }

}
