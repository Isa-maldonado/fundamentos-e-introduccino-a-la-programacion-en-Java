
public class Ejercicio1
{
    //COPIA DE SEGURIDAD
    int MbCdsBlanco = 700;
    int GbMaquina = 5;
    int unGb= 1024;
    int restoTotal;

    public void CantidadCds (){
        int gbMb = GbMaquina * unGb;
        int cds = gbMb / MbCdsBlanco; //Cantidad de cds
        int resto = gbMb % MbCdsBlanco; //Resto de cds
        if (resto == 0){
            cds = cds;
        }else if (resto > 0){
            restoTotal = MbCdsBlanco - resto;
            cds = cds +1;
        }
        System.out.println ("Se necesitará un total de " + cds + " CDs y sobrarán " + restoTotal + "Mb de espacio libre.");
    }
}