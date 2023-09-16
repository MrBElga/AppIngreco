
package appingreco;

import Entidade.Bilheteiria;
import Entidade.VIP;
import Entidade.ingressoNormal;
import java.time.LocalDate;

public class AppIngreco {

    public static void main(String[] args) {
        LocalDate time = null;
        Bilheteiria b1 = new Bilheteiria();
        ingressoNormal s1 = new ingressoNormal("Guns n Roses",time,150.0);
        b1.Add(s1);
        ingressoNormal s3 = new ingressoNormal("Guns n Roses",time,150.0);
        b1.Add(s3);
        
        VIP s2 = new VIP("Guns n Roses",time,250.0,10);
        b1.Add(s2);
        VIP s4 = new VIP("Guns n Roses",time,250.0,10);
        b1.Add(s4);
        
        if(s2 instanceof VIP)
            System.out.println(b1.total()+s2.getAdicional());
        else
            System.out.println(b1.total());
        
    }
    
  
    
}
