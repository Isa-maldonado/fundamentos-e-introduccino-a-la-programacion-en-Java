public class FugacesRecuerdos
{
    private String tarea;
    private int registroTareas;
    private String estadoTarea; //"concluida" o "en proceso"

    public FugacesRecuerdos(String tarea){
        registroTareas = 0;
    }
    
    public String escribirNuevaTarea(String estado, String nuevaTarea){
        String res = "";
        if (estadoTarea == "concluida"){
            tarea = nuevaTarea;
            res = "Nueva tarea asignada";
        } else if (estadoTarea == "en proceso"){
            tarea = tarea;
            res = "La tarea en curso aun no ha sido concluida";
        }
        registroTareas++;
        return res;
    }
}
