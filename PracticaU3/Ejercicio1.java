public class Ejercicio1
{
    public void introducirNum (int num){
        if (num > 100 && num <= 999){
            int c = num % 10;
            int aux = num / 10;
            int b = aux % 10;
            int a = aux / 10;
            if (c == a){
                System.out.println ("El numero es capicua");
            }else {
                System.out.println ("El numero no es capicua");
            }
        }else {}
    }
}
