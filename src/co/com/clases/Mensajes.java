package co.com.clases;

public class Mensajes {
    private final String mensaje1 = "Digte los ingresos totales: ";
    private final String mensaje2 = "Digte los gastos fijos: ";
    private final String mensaje3 = "Digte los gasos variables ";
    private final String mensaje4 = "La capacidad de endeudamiento es: ";
    private final String mensaje5 = "Desea continuar?. S/N : ";
    public Mensajes(){
    }
    public String getMensaje(int opcion){
        String mensaje = null;
        switch(opcion) {
            case 1:
                mensaje = mensaje1;
                break;
            case 2:
                mensaje = mensaje2;
                break;
            case 3:
                mensaje = mensaje3;
                break;
            case 4:
                mensaje = mensaje4;
                break;
            case 5:
                mensaje = mensaje5;
                break;
            default:
                mensaje = "";
                break;
        }
        return mensaje;
    }

}
