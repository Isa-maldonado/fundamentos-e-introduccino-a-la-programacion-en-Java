public class Ejercicio6
{
    public String tipoNumero (int numero){
        String res = "";
        int suma = 0;
        for(int divisor=1; divisor <= (numero/2) ; divisor++){
            if(numero % divisor == 0){
                suma += divisor;
                if (suma == numero){
                    res = "Numero perfecto";
                }else if (suma > numero){
                    res = "Numero Abundante";
                }else {
                    res = "Numero defectivo";
                }
            }
        }
        return res;
    }
}
