
package operacion;

public class Operacion {

    public Operacion(){
    
    }

public double resoper (double x1, double x2, double y1, double y2){
    double Distancia= Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1), 2)));
    return Distancia;
}
    
}
