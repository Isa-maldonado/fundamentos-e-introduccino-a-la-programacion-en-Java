public class Ejercicio9
{
    //MAQUINA DE VERIFICACION
    int carnetIdentidad;
    public void Ejercicio9 (int carnetIdentidad){
        int verificacion = carnetIdentidad % 10;
        int diaPermitido = (int) Math.random()* 10; 
        if (verificacion == diaPermitido){
            System.out.println ("Bienvenido!! , puede ingresar al mercado.");
        }else {
            System.out.println ("Lo sentimos, debe esperar el dia permitido segun la terminacion de su carnet para poder ingresar");
        }
    }
}
