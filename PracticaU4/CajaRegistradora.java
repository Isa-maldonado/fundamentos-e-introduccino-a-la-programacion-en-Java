public class CajaRegistradora
{
    private double precio;
    private int cantidad;
    private double suma;
    private double montoIndicado;
    private double montoPagar;
    private double cambio;
    
    public CajaRegistradora (){
        precio = 0;
        cantidad = 0;
    }
    
    public void sumaPrecioProductos (double precio, int cantidad){
        suma = precio * cantidad;
    }
    
    /*public void setSuma (double suma){
        suma = suma;
    }*/
    
    public void añadirProductos (double precio2, int cantidad2){
        double nuevoMonto = (precio2 * cantidad2) + suma;
    }
    
    public void sumarTodo (){
         double sumaTotal = sumaPrecioProductos() + añadirProductos();
    }
    
    public String registrarCompra (int pago){
        String res = "";
        if (pago < montoPagar){
            res = "Error: El dinero indicado no cubre la compra";
        }else {
            cambio = pago - montoPagar;
            res = "Cobro exitoso, el cambio a devolver es: " + cambio;
        }
        return res;
    }
    
    public void nuevaCompra (){
        precio = 0;
        cantidad= 0;
    }
}
