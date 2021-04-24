public class SombraCipres{
    public int[] calcularSombra(int sombra, int hr){
        int[] res= new int[hr];
        res[0]= sombra;
        int x=1;
        for(int i=1; i<hr; i++){
            if(res[i-1]%2==0){
                res[i]= res[i-1]/2;
            }else{
                res[i]= res[i-1]+x;
                x++;
            }
        }
        return res;
    }
}