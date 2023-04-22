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
public class Cuadrado extends FiguraGeometrica{
    private double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    public double calcularCirculoInscrito(){
        return Math.PI*lado;
    }    
    @Override
    public double calcularPerimetro() {
        return Math.round(lado*4);
    }
    
    @Override
    public double calcularArea() {
        return Math.round(Math.pow(lado,2));
    }
    
}
