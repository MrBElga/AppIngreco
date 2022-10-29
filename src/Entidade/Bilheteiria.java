package Entidade;

import java.util.ArrayList;
import java.util.List;


public class Bilheteiria {
    
  private  List<Ingresso> Ingressos = new ArrayList<>();
    
    
    public void Add(Ingresso ingressos)
    {
        this.Ingressos.add(ingressos);
    }
    
    public double total()
    {
        double tot = 0;
        for(Ingresso in : Ingressos)
        {
            tot += in.getValR();
        }
        
        return tot;
    }
    
}
