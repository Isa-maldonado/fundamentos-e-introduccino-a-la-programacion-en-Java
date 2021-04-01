public class Ejercicio8
{
    public void fechaLiteral (int dia, int mes, int año){
        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (año >= 1)){
            if (mes == 1){
                System.out.println (dia + " de Enero de " + año); 
            }else if (mes == 2){
                System.out.println (dia + " de Febreo de " + año); 
            }else if (mes == 3){
                System.out.println (dia + " de Marzo de " + año); 
            }else if (mes == 4){
                System.out.println (dia + " de Abril de " + año); 
            }else if (mes == 5){
                System.out.println (dia + " de Mayo de " + año); 
            }else if (mes == 6){
                System.out.println (dia + " de Junio de " + año); 
            }else if (mes == 7){
                System.out.println (dia + " de Julio de " + año); 
            }else if (mes == 8){
                System.out.println (dia + " de Agosto de " + año); 
            }else if (mes == 9){
                System.out.println (dia + " de Septiembre de " + año); 
            }else if (mes == 10){
                System.out.println (dia + " de Octubre de " + año); 
            }else if (mes == 11){
                System.out.println (dia + " de Noviembre de " + año); 
            }else{
                System.out.println (dia + " de Diciembre de " + año); 
            }
        }
    }
}
