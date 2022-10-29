package Entidade;

import java.time.LocalDate;

abstract public class Ingresso {
    private String show;
    LocalDate data;
    private double ValR;

    public Ingresso() {
    }
    

    public Ingresso(String show, LocalDate data, double ValR) {
        this.show = show;
        this.data = data;
        this.ValR = ValR;
    }

   final public double getValR() {
        return ValR;
    }

   final public void setValR(double ValR) {
        this.ValR = ValR;
    }

   final public String getShow() {
        return show;
    }

   final public void setShow(String show) {
        this.show = show;
    }
    
   final public LocalDate getData() {
        return data;
    }
    
    
   final public void setData(LocalDate data) {
        this.data = data;
    }

   abstract public double getValor();
}
