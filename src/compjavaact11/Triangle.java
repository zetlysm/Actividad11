/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compjavaact11;

public class Triangle implements Shape {

    private double base;
    private double altura;
    private double lado;
    private double areaTriangulo;
    private double perimTriangulo;

    public Triangle(final double base, final double altura, final double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(final double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(final double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(final double lado) {
        this.lado = lado;
    }

    public double getareaTriangulo() {
        return this.areaTriangulo;
    }

    public double getperimTriangulo() {
        return this.perimTriangulo;
    }

    @Override
    public void getArea() {
        this.areaTriangulo = this.base * this.altura / 2.0;
    }

    @Override
    public void getPerimeter() {
        this.perimTriangulo = this.base + this.altura + this.lado;
    }
}
