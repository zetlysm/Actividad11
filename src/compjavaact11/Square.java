/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compjavaact11;

public class Square implements Shape
{
    private double lado;
    private double areaCuadrado;
    private double perimCuadrado;
    
    public Square(final double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return this.lado;
    }
    
    public void setLado(final double lado) {
        this.lado = lado;
    }
    
    public double getareaCuadrado() {
        return this.areaCuadrado;
    }
    
    public double getperimCuadrado() {
        return this.perimCuadrado;
    }
    
    @Override
    public void getArea() {
        this.areaCuadrado = this.lado * this.lado;
    }
    
    @Override
    public void getPerimeter() {
        this.perimCuadrado = 4.0 * this.lado;
    }
}
