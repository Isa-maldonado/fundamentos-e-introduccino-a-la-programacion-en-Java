public class Ejercicio4
{
    int nroHojas;
    public void cantidadHojas(int nroPaginas){
        if (nroPaginas >= 1){
            if(nroPaginas % 2 == 0){
                nroHojas = nroPaginas / 2;
                nroHojas = nroHojas;
            } else if(nroPaginas % 2 > 0){
                nroHojas = (nroPaginas / 2) + 1;
            }
        }else{}
        System.out.println ("Se necesitaran un total de " + nroHojas + " hoja (s)");
    }
}