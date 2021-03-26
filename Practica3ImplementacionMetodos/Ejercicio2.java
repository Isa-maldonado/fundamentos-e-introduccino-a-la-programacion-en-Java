public class Ejercicio2
{
    public void areaDodecagono(int numeroRadio){
        if (numeroRadio >= 1 && numeroRadio <= 15445){
            int area = 3 * (numeroRadio * numeroRadio);
            System.out.println ("El area total del Dodecagono es de: " + area);
        }else{
            System.out.println ("El Area sobrepasa el limite requerido");
        }
    }
}