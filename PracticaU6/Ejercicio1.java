public class Ejercicio1 {
    public String nDigitos(int num){
        int cant=0;
        String res="";
        if(num>=0){
            while(num>0){
                num= num/10;
                cant++;
            }
            res= "La cantidad de digitos es "+cant;
        }else{
            res = "Es un numero negativo";
        }
        return res;
    }
}