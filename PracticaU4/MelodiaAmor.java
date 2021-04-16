public class MelodiaAmor
{
    private String cancion1, cancion2, cancion3;
    private String estado;

    public MelodiaAmor (String cancion1, String cancion2, String cancion3){
        estado = "Pausa";
        
    }
    
    public void reproducirCancion (){
        if (estado == "Pausa"){
            System.out.println ("La cancion ha empezado a sonar");
            estado = "Reproduciendo Musica";
        }else {
            System.out.println ("Ya esta sonando un a cancion");
        }
    }
    
    public void pausarCancion (){
        if (estado == "Reproduciendo Musica"){
            System.out.println ("La cancion ha sido pausada");
        }else {
            System.out.println ("La cancion ya se encuentra en pausa");
        }
    }
    
    public void cambiarCancion (){
        // No se como interpretar el cambio de cancion en codigo :(
    }
}
