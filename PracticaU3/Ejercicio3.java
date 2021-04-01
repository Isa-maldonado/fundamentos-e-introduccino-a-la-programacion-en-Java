public class Ejercicio3
{
    public void dia (int num){
        if (num >= 1 && num <= 31){
            int b = num % 10;
            int a = num / 10;
            
            if ((a % 2 == 0) && (b % 2 == 1)){
                System.out.println ("Cruz de Dariel");
            }else {
                System.out.println ("Dia normal");
            }
        }
    }
}
