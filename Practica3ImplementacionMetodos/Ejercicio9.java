public class Ejercicio9
{
    public void usuariosAd (int seguidores, int siguiendo){
        if (seguidores >= 0 && siguiendo >= 0){
            int usuariosSeguir = (seguidores * 3) - siguiendo; 
            System.out.println ("Ahora puedes seguir a " + usuariosSeguir + " Usuarios adicionales");
        }else {
         System.out.println ("Numero no valido de seguidores o usuarios seguidos");
        }
    }
}
