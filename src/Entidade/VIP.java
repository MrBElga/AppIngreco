
package Entidade;

import java.time.LocalDate;


public class VIP extends Ingresso{
    private double adicional;

    public VIP() {
    }
    
    
    public VIP(String show, LocalDate data, double ValR, double adicional) {
        super(show, data, ValR);
        this.adicional = adicional;
    }
   final public double getAdicional()  
    {
        return adicional;
    }
    @Override
    public double getValor()  
    {
        return super.getValR()+adicional;
 
    }
    
}
