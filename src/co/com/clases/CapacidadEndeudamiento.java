package co.com.clases;

public class CapacidadEndeudamiento {
    private double ingresosTotales, gastosFijos, gastosVariables;
    private double capacidadEndeudamiento;
    private final double factor =  0.35;

    public CapacidadEndeudamiento(){
    }
    public CapacidadEndeudamiento( double ingresosTotales, double gastosFijos, double gastosVariable){
        this.ingresosTotales = ingresosTotales;
        this.gastosFijos = gastosFijos;
        this.gastosVariables = gastosVariable;
        this.capacidadEndeudamiento = 0;
    }

    public void setIngresosTotales (double ingresosTotales){
        this.ingresosTotales = ingresosTotales;
    }
    public void setGastosFijos (double gastosFijos){
        this.gastosFijos = gastosFijos;
    }
    public void setGastosVariables(double gastosVariables) {
        this.gastosVariables = gastosVariables;
    }
    public double getGastosFijos() {
        return gastosFijos;
    }
    public double getGastosVariables() {
        return gastosVariables;
    }
    public double getIngresosTotales() {
        return ingresosTotales;
    }
    public double getCapacidadEndeudamiento() {
        capacidadEndeudamiento = ( this.ingresosTotales - (
                this.gastosFijos + this.gastosVariables)) * this.factor;
        return capacidadEndeudamiento;
    }

    @Override
    public String toString() {
        return "Capacidad2{" +
                "ingresosTotales=" + ingresosTotales +
                ", gastosFijos=" + gastosFijos +
                ", gastosVariables=" + gastosVariables +
                ", capacidadEndeudamiento=" + capacidadEndeudamiento +
                '}';
    }
}
