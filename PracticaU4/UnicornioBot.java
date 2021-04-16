public class UnicornioBot
{
    private String nombreUsuario;
    
    public UnicornioBot (String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public String Saludar (){
        String res = ("Hola "+ nombreUsuario);
        return res;
    }
    
    public void setNombreUsuario(String nuevoUsuario){
       nombreUsuario = nuevoUsuario; 
    }
}
