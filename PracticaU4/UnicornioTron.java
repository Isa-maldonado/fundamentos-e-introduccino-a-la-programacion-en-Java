public class UnicornioTron
{
    private int premio;
    private int intentos;
    private int fichas;
    private int numSecreto;
    
    public UnicornioTron (){
        numSecreto = (int)(Math.random()*11);
        premio = 1000;
    }
    
    public String Jugar(/*int fichas, */int numero){
        String res = "";
        //if (fichas > 0){
            if (numero == numSecreto){
                res = "Felicidades! Ganaste el premio de: " + premio + "Bs. en " + intentos+ " intentos";
            }else {
                res = "Fallaste, sigue intentando";
            }
        //}
        intentos ++;
        //fichas --;
        return res;
    }
    
    public void reiniciar (){
        numSecreto = (int)(Math.random()*11);
        premio = 1000;
        intentos = 0;
    }
}
