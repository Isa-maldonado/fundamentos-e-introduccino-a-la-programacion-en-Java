public class Ejercicio5
{
    public void numParientes (int a, int b){
        if (a > 0 && b < 2147483647){
            if (a % b == 0 || b % a == 0){
                System.out.println ("Son parientes");
            }else {
                System.out.println ("No son parientes");
            }
        }
    }
}
