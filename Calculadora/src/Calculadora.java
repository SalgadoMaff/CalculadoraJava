
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ra164644
 */
public class Calculadora {
    
    private Double Valor1;
    private Double Valor2;
    
    
    public Double Soma(){
        return Valor1+Valor2;
    }
    public Double Subtração(){
        return Valor1-Valor2;
    }
    public Double Multiplicasaum(){
        return Valor1*Valor2;
    }
    public Double Divisaum(){
        return Valor1/Valor2;
    }
    public Double Exp(){
        return pow(Valor1,Valor2);
    }

    public Double getValor1() {
        return Valor1;
    }

    public void setValor1(Double Valor1) {
        this.Valor1 = Valor1;
    }

    public Double getValor2() {
        return Valor2;
    }

    public void setValor2(Double Valor2) {
        this.Valor2 = Valor2;
    }
    
    
}
