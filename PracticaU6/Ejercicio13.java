public class Ejercicio13
{
    public String numerosAmigos(int n, int m){
        int sumaN= sumaNumPropios(n);
        int sumaM= sumaNumPropios(m);
        String res=""; 
        if(sumaN==m && sumaM==n){
            res="Son amigos";
        }else {
            res = "NO son amigos";
        }
        return res;
    }
    
    private int sumaNumPropios(int a){
        int sum=0;
        for(int posibleDiv=1; posibleDiv< a; posibleDiv++){
            if(a%posibleDiv==0){
                sum+=posibleDiv; 
            }
        }
        return sum;
    }
}
