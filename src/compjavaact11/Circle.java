/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compjavaact11;

public class Circle implements Shape
{
    private double radio;
    private double areaRadio;
    private double circumPerim;
    static final double pi = 3.1415;
    
    public Circle(final double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return this.radio;
    }
    
    public void setRadio(final double radio) {
        this.radio = radio;
    }
    
    public double getAreaRadio() {
        return this.areaRadio;
    }
    
    public double getCircumPerim() {
        return this.circumPerim;
    }
    
    public void getArea() {
        this.areaRadio = 3.1415 * this.radio * this.radio;
    }
    
    public void getPerimeter() {
        this.circumPerim = 6.283 * this.radio;
    }
}

