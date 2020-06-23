import BaseDeDatos.BaseDeDatos;
import IU.VistaIngresar;
import IU.VistaPrincipal;
<<<<<<< HEAD
import BaseDeDatos.BaseDeDatos;
=======
import BaseDeDatos.Usuario;

import java.util.ArrayList;
>>>>>>> 35f8f7cfe21e5f875c4333e1ce2fdea58dcbf37b

public class Gendat{

    public static void main(String[] arg){
        //base de dato de trabajo
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        //Creacion de vistas
        VistaPrincipal vistaPrincipal = new VistaPrincipal();




        /** 3)
         * la vista al recibir que se agregara un nuevo usuario, le pregunta a la base de datos si
         * tiene algun usurio con ese nombre, en caso de que no lo tenga agrega este nuevo usuario, en caso
         * contrario muestra un cartel que dice("usuario ya existente").
         */


        /** 4)
         * al crearse un nuevo usuario, lo primero que hago es registrar las vistas observadoras en este usuario
         * llamando al metodo registrar usuario del usuario.
         */

        /** 4)
         * ademas en nuestras vistas observadoras, agregamos el objeto usuario, para que estas puedan buscar la
         * informacion que necesiten en caso de que deban actualizarse
         */
    }

}
