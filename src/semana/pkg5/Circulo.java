/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg5;

/**
 *
 * @author Hansel
 */
public class Circulo extends FiguraGeometrica{
    private final double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularPerimetro() {
        return Math.round((radio*radio)*Math.PI);
    }
    public double calcularDiametro(){
        return radio*2;
    }

    @Override
    public double calcularArea() {
        return Math.round(Math.PI*radio*radio);
    }
    
}
