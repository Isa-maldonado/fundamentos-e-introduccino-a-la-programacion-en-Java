public class Ejercicio7
{
    public String TipoNum (int numero){
        String res = "";
        int suma = 0;
        if (numero > 0){
            while (numero > 0){
                int potencia = (int)(Math.pow((numero % 10),3));
                suma += potencia;
                numero = numero / 10;

                if (suma == numero){
                    res = "Narcisista";
                }else{
                    res = "Normal";
                }
            }
        }
        return res;
        //La logica esta bien pero al momento de comparar en la linea 12, toma en cuenta al numero como "1", no como el valor que obtenemos como input :(((
    }
}
