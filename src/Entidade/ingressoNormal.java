package Entidade;

import java.time.LocalDate;


public class ingressoNormal extends Ingresso{

    public ingressoNormal() {
    }

    public ingressoNormal(String show, LocalDate data, double ValR) {
        super(show, data, ValR);
    }


        
    @Override
    public double getValor()
    {
 
        LocalDate hoje = LocalDate.now();
        int hj=hoje.getDayOfMonth();
        int dt=data.getDayOfMonth();
        
        if(dt-hj>=5) 
            return super.getValR();
        else
            return super.getValR()+(50*10/100);
    }
    
}