/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compjavaact11;

import java.util.Scanner;

public class CompJavaAct11
{
    boolean exit;
    
    public static void main(final String[] args) {
        final CompJavaAct11 menu = new CompJavaAct11();
        menu.runMenu();
    }
    
    public void runMenu() {
        this.printHeader();
        while (!this.exit) {
            this.printMenu();
            final int choice = this.getInput();
            this.performAction(choice);
        }
    }
    
    private void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|           Actividad 11            |");
        System.out.println("|                                   |");
        System.out.println("+-----------------------------------+");
    }
    
    private void printMenu() {
        System.out.print("\nEnter your selection: \n");
        System.out.print("1) Area \n");
        System.out.print("2) Perimeter \n");
        System.out.print("0) Exit\n");
    }
    
    private void printMenu2() {
        System.out.print("\nEnter your selection: \n");
        System.out.print("1) Circle \n");
        System.out.print("2) Square \n");
        System.out.print("3) Triangle \n");
        System.out.print("0) Exit\n");
    }
    
    private int getInput() {
        final Scanner kb = new Scanner(System.in);
        int choice = -1;
        while (true) {
            if (choice >= 0) {
                if (choice <= 3) {
                    break;
                }
            }
            try {
                System.out.print("\nEnter your choice: ");
                choice = Integer.parseInt(kb.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.print("Invalid selection. Please try ");
            }
        }
        return choice;
    }
    
    private void performAction(final int choice) {
        switch (choice) {
            case 0: {
                this.exit = true;
                System.out.println("Exiting");
                break;
            }
            case 1: {
                System.out.println("Picked Area.");
                this.pickArea();
                break;
            }
            case 2: {
                System.out.println("Picked Perimeter.");
                this.pickPerimeter();
                break;
            }
            default: {
                System.out.println("Unknown, try again.");
                break;
            }
        }
    }
    
    private void pickArea() {
        this.printMenu2();
        final int choice = this.getInput();
        switch (choice) {
            case 0: {
                this.exit = true;
                System.out.println("Exiting");
                break;
            }
            case 1: {
                System.out.println("Picked Circle.");
                this.pickAreaCircle();
                break;
            }
            case 2: {
                System.out.println("Picked Square.");
                this.pickAreaSquare();
                break;
            }
            case 3: {
                System.out.println("Picked Triangle.");
                this.pickAreaTriangle();
                break;
            }
        }
    }
    
    private void pickPerimeter() {
        this.printMenu2();
        final int choice = this.getInput();
        switch (choice) {
            case 0: {
                this.exit = true;
                System.out.println("Exiting");
                break;
            }
            case 1: {
                System.out.println("Picked Circle.");
                this.pickPerimeterCircle();
                break;
            }
            case 2: {
                System.out.println("Picked Square.");
                this.pickPerimeterSquare();
                break;
            }
            case 3: {
                System.out.println("Picked Triangle.");
                this.pickPerimeterPerimeter();
                break;
            }
        }
    }
    
    private void pickAreaCircle() {
        final Scanner kb = new Scanner(System.in);
        System.out.println("Type the radius.");
        final int num = Integer.parseInt(kb.nextLine());
        final Circle circle = new Circle((double)num);
        circle.getArea();
        System.out.println("Area of circle with the radius of " + num + " = " + circle.getAreaRadio());
    }
    
    private void pickAreaSquare() {
        final Scanner kb = new Scanner(System.in);
        System.out.println("Type one digit for the area.");
        final int num = Integer.parseInt(kb.nextLine());
        final Square square = new Square((double)num);
        square.getArea();
        System.out.println("Area of a square with the Area of " + num + " = " + square.getareaCuadrado());
    }
    
    private void pickAreaTriangle() {
        final Scanner kb = new Scanner(System.in);
        System.out.println("Type the base of the triangle.");
        final int num = Integer.parseInt(kb.nextLine());
        System.out.println("Type the height of the triangle.");
        final int num2 = Integer.parseInt(kb.nextLine());
        final Triangle triangle = new Triangle((double)num, (double)num2, -1.0);
        triangle.getArea();
        System.out.println("Area of a square with the base of " + num + " and the height of " + num2 + " = " + triangle.getareaTriangulo());
    }
    
    private void pickPerimeterCircle() {
        final Scanner kb = new Scanner(System.in);
        System.out.println("Type the radius.");
        final int num = Integer.parseInt(kb.nextLine());
        final Circle circle = new Circle((double)num);
        circle.getPerimeter();
        System.out.println("Circumference of circle with the radius of " + num + " = " + circle.getCircumPerim());
    }
    
    private void pickPerimeterSquare() {
        final Scanner kb = new Scanner(System.in);
        System.out.println("Type the side.");
        final int num = Integer.parseInt(kb.nextLine());
        final Square square = new Square((double)num);
        square.getPerimeter();
        System.out.println("Perimeter of a square with the side of " + num + " = " + square.getperimCuadrado());
    }
    
    private void pickPerimeterPerimeter() {
        final Scanner kb = new Scanner(System.in);
        System.out.println("Type side a.");
        final int num = Integer.parseInt(kb.nextLine());
        System.out.println("Type side b.");
        final int num2 = Integer.parseInt(kb.nextLine());
        System.out.println("Type side c.");
        final int num3 = Integer.parseInt(kb.nextLine());
        final Triangle triangle = new Triangle((double)num, (double)num2, (double)num3);
        triangle.getPerimeter();
        System.out.println("Perimeter of a triangle with a side A of: " + num + ". side B of: " + num2 + ". and side c of: " + num3 + ". = " + triangle.getperimTriangulo());
    }
}
