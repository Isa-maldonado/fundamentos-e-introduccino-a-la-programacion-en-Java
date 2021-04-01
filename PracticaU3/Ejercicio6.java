public class Ejercicio6
{
    String nombreA; 
    int edadA;
    String nombreB;
    int edadB;
    String nombreC;
    int edadC;
    public void indicarHijos (String nombreA, int edadA, String nombreB, int edadB, String nombreC, int edadC){
        //if (edad > 0 && edad < 100){

    }

    public void hermanoMayor (){
        if (edadA > edadB && edadA > edadC){
            System.out.println ("El hermano mayor es: " + nombreA);
        }else if (edadB > edadA && edadB > edadC){
            System.out.println ("El hermano mayor es: " + nombreB);
        }else {
            System.out.println ("El hermano mayor es: " + nombreC);
        }
    }
    //}
    public void hermanoDelMedio (){
        if (edadA < edadB && edadA < edadC){
            System.out.println ("El hermano menor es: " + nombreA);
        }else if (edadB < edadA && edadB < edadC){
            System.out.println ("El hermano menor es: " + nombreB);
        }else {
            System.out.println ("El hermano menor es: " + nombreC);
        }    
    }

    public void hermanoMenor(){   
        if (edadA > edadB && edadA < edadC){
            System.out.println ("El hermano del medio es: " + nombreA);
        }else if (edadB > edadA && edadB < edadC){
            System.out.println ("El hermano del medio es: " + nombreB);
        }else {
            System.out.println ("El hermano del medio es: " + nombreC);
        }
    }
}