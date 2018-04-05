package com.kaminski;

import java.util.Random;

/**
 * Klasa Ball rozszerzająca klasę MaterialPoint
 */
public class Ball extends MaterialPoint {

    private int radius;

     //Konstruktor klasy ball bezargumentowy
    public Ball() {
        //wywołanie konstruktora bezargumentowego klasy nadrzędnej - MaterialPoint
        super();
        Random random = new Random(System.currentTimeMillis());
        this.radius = random.nextInt(1000);
    }
    //Konstruktor z paramertami
    public Ball(int mass, int radius) {
        super(mass);
        this.radius = radius;
    }
    //Nadpisana metoda klasy nadrzędnej
    @Override
    // Metoda zawierająca wzor na moment bezwladnosci dla kuli
    public double calculateMainMomentOfInertia() {
        return (2.0 / 5) * mass * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive or zero.");
        }
    }
    //Nadpisana metoda klasy nadrzednej
    @Override
    public String getInfo() {
        return "Ball\nRadius:\t" + radius + "\nMass:\t" + super.mass;
    }
}
