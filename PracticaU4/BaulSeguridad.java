public class BaulSeguridad
{
    private int clave;
    private String estado;

    public BaulSeguridad (){
        clave = 1111;
        estado = "";
    }

    public void cambiarClave (String estado, int nuevaClave){
        if (estado == "Abierto"){
            if (nuevaClave >= 1111 & nuevaClave < 9999){
                clave = nuevaClave;
            } else{
                System.out.println ("No fue posible cambiar la clave");
            }
        } else {
            System.out.println ("No fue posible cambiar la clave");
        }
    }

    public String AbrirCerrarBaul (String estado, int clave){
        String res = "";
        if (estado == "Cerrado" && clave == clave){
            estado = "Abierto";
            res = "Clave correcta, se pudo abrir el Baul exitosamente";
        }else if (estado == "Cerrado" && clave != clave){
            estado = "Cerrado";
            res = "La clave ingresada es incorrecta";
        }else {
            res = "Baul cerrado";
        }
        return res;
    }
}