/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

/**
 *
 * @author Estudiante
 */
public class Cuadrado extends FiguraGeometrica{
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public Cuadrado(Double lado) {
        this.lado = lado;
    }
    
    public Double calcularElPerimetroCirculo(){
        return lado * Math.PI;
    }

    @Override //Siempre usar
    public Double calcularArea() {
        return lado * lado;
    }

    @Override //Siempre usar
    public Double calcularPerimetro() {
        return lado * 4;
    }
    
}
