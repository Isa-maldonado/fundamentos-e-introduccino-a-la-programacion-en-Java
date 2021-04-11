public class Ejercicio5
{
    public int cantAcarreos (int a, int b){
        int cant = 0;
        int acarreo = 0;
        while (a > 0 || b > 0){
            acarreo = (a%10 + b%10 + acarreo) /10;
            if (acarreo > 0){
                cant ++;
            }
            a = a /10;
            b = b /10;
        }
        return cant;
    }
}