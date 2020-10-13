package co.com.drey;

import java.util.Scanner;
import co.com.clases.*;

public class Main {

    public static void main(String[] args) {

        String continuar = "S", valorString;
        int validaOk;

        Scanner scan = new Scanner(System.in);
        CapacidadEndeudamiento endeuda = new CapacidadEndeudamiento();
        Mensajes mensajes = new Mensajes();

        while( continuar.equals("S")){
            validaOk = 1;
            while( validaOk <= 3 ) {
                System.out.println(mensajes.getMensaje(validaOk));
                valorString = scan.nextLine();
                if ( esNumerico(valorString) ) {
                    switch(validaOk) {
                        case 1:
                            endeuda.setIngresosTotales(Double.parseDouble(valorString));
                            validaOk++;
                            break;
                        case 2:
                            endeuda.setGastosFijos(Double.parseDouble(valorString));
                            validaOk++;
                            break;
                        case 3:
                            endeuda.setGastosVariables(Double.parseDouble(valorString));
                            validaOk++;
                            break;
                    }
                }
            }
            System.out.println("\n" + mensajes.getMensaje(4) + endeuda.getCapacidadEndeudamiento());
            System.out.println("\n" + mensajes.getMensaje(5));
            continuar = scan.nextLine();
        }
    }
    private static boolean esNumerico( String cadena )
    {
        try{
            Double.parseDouble(cadena);
            return true;
        } catch  (NumberFormatException excepcion) {
            return false;
        }
    }
}

