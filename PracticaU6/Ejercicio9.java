public class Ejercicio9
{
    public int base2 (int numero){
        int res = 0;
        int multi = 1;
        while (numero > 0){
            int dig = numero % 2;
            res = dig * multi + res;
            multi = multi * 10;
            numero = numero / 2;
        }
        return res;
    }
}
