public class Ejercicio2
{
    public String tipoNum1 (int numero){
        String res = "";
        int divisor;
        int contador = 0;
        for (divisor=1; divisor <= numero; divisor ++){
            if (numero % divisor == 0){
                contador++;
                if (contador == 2){
                    res = "Es un numero primo";
                }else {
                    res = "Es un numero compuesto";
                }
            }
        }
        return res;
    }
}