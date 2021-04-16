public class JuegoDracoCornio1{
    private int cX,cY,intentos;

    public JuegoDracoCornio1(){
        intentos=3;
        cX= (int)(Math.random()*11);
        cY= (int)(Math.random()*11);
    }
    // 7 , 7 --> 0
    public String jugar(int x, int y){
        String res="";
        int distX= Math.abs(cX-x);
        int distY= Math.abs(cY-y);
        if(intentos>0){
            if(distX==0 && distY==0){
                res="Ganaste papu!";
            }else{
                intentos--;
                if(distX>2){
                    res=res+"X esta lejos";
                }else{
                    res=res+"X esta cerca";
                }

                if(distY>2){
                    res=res+"Y esta lejos";
                }else{
                    res=res+"Y esta cerca";
                }
            }
        }else{
            res="Saludos a la familia del megalodon";
        }
        return res;
    }
    
    public void reiniciar(){
        intentos=3;
        cX= (int)(Math.random()*11);
        cY= (int)(Math.random()*11);
    }
    
}
