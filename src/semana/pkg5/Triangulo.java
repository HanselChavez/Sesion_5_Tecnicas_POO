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
public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }    
    @Override
    public double calcularPerimetro() {
        return ladoA+ladoB+ladoC;
    }

    @Override
    public double calcularArea() {
        return Math.round((base*altura)/2);
    }
    
}
