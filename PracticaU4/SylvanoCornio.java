public class SylvanoCornio
{
    private int savia;
    private int componente;
    private String estado;

    public SylvanoCornio (){
        savia = 0;
        componente = 0;
        estado = "Apagado";
    }

    public void crearComponente (int savia, String estado){
        if (estado == "Encendido"){
            if (savia >= 50){
                componente = savia / 50;
                //componente ++;
                System.out.println (componente);
            }
            componente ++;
        }
    }

    public String guardarComponentes (String estado){
        String res = "";
        if (estado == "Encendido"){
            if (componente <= 20){
                res ="La accion ha sido completada con exito";
            }else {
                res = "No se puede realizar esta accion, espacio insuficiente";
            }
        }
        return res;
    }

    public void retirarComponentes (){
        savia = 0;
        componente = 0;
        estado = "Apagado";
    }
}
