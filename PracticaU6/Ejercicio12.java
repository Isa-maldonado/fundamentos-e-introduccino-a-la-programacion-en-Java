public class Ejercicio12
{
    public int division (int n, int m){
        int cant = 0;
        if (n >= 1 && m >=1){
            while (n >= m){
                n = n - m;
                cant ++;
            }
        }
        return cant;
    }
}
