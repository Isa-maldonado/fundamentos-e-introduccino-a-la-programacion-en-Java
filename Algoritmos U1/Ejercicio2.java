
public class Ejercicio2
{
    //UNA INVERSIÓN INTELIGENTE
    double porcenGanancia = 5; //porciento
    double deposito = 300;
    double dineroTotal;

    public void calcularDineroCuenta (){
        double gananciaEnero = (porcenGanancia * deposito) / 100 + deposito; 
        System.out.println ("Cuenta en Enero : " + gananciaEnero + "Bs");
        
        double gananciaFebrero = (porcenGanancia * gananciaEnero) / 100 + gananciaEnero;
        System.out.println ("Cuenta en Febrero : " + gananciaFebrero + "Bs");
        
        double gananciaMarzo = (porcenGanancia * gananciaFebrero) / 100 + gananciaFebrero;
        System.out.println ("Cuenta en Marzo : " + gananciaMarzo + "Bs");
        
        double gananciaAbril = (porcenGanancia * gananciaMarzo) / 100 + gananciaMarzo;
        System.out.println ("Cuenta en Abril : " + gananciaAbril + "Bs");
        
        double gananciaMayo = (porcenGanancia * gananciaAbril) / 100 + gananciaAbril;
        System.out.println ("Cuenta en Mayo : " + gananciaMayo + "Bs");
        
        double gananciaJunio = (porcenGanancia * gananciaMayo) / 100 + gananciaMayo;
        System.out.println ("Cuenta en Junio : " + gananciaJunio + "Bs");
        
        double gananciaJulio = (porcenGanancia * gananciaJunio) / 100 + gananciaJunio;
        System.out.println ("Cuenta en Julio: " + gananciaJulio + "Bs");
        
        double gananciaAgosto = (porcenGanancia * gananciaJulio) / 100 + gananciaJulio;
        System.out.println ("Cuenta en Agosto : " + gananciaAgosto + "Bs");
        
        double gananciaSeptiembre = (porcenGanancia * gananciaAgosto) / 100 + gananciaAgosto;
        System.out.println ("Cuenta en Septiembre : " + gananciaSeptiembre + "Bs");
        
        double gananciaOctubre = (porcenGanancia * gananciaSeptiembre) / 100 + gananciaSeptiembre;
        System.out.println ("Cuenta en Octubre : " + gananciaOctubre + "Bs");
        
        double gananciaNoviembre = (porcenGanancia * gananciaOctubre) / 100 + gananciaOctubre;
        System.out.println ("Cuenta en Noviembre : " + gananciaNoviembre + "Bs");
        
        double gananciaDiciembre = (porcenGanancia * gananciaNoviembre) / 100 + gananciaNoviembre;
        System.out.println ("Cuenta en Diciembre : " + gananciaDiciembre + "Bs");
        System.out.println ("******************************************************************");
        System.out.println ("Al cabo de doce meses, Meredith tendra un total de " + gananciaDiciembre + "Bs");
    }
}
