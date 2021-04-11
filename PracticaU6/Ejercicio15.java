public class Ejercicio15{
    public String numeroUnicornio(int n){
        int corazonN= corazonNum(n);
        return corazonN%3==0? "Numero Unicornio":"Numero Normal";
    }
    
    public int corazonNum(int n){
        int res;
        if(n%2==0){
            int div= potencia(10,cantDig(n)/2-1);
            res=(n/div)%100;
        }else{
            int div= potencia(10,cantDig(n)/2);
            res=(n/div)%10;
        }
        return res;
    }
    
    private int potencia(int base, int exp){
        int res=1;
        for(int i=0;i<exp;i++){
            res*=base;
        }
        return res;
    }
    
    private int cantDig(int n){
        int cont=0;
        while(n>0){
            cont++;
            n/=10;
        }
        return cont;
    }
}