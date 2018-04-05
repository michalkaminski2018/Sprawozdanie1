package com.kaminski;

import java.util.Random;

public class Roller extends MaterialPoint {

    private int radius;

    public Roller() {
        super();
        Random random = new Random(System.currentTimeMillis());
        this.radius = random.nextInt(1000);
    }

    public Roller(int mass, int radius) {
        super(mass);
        this.radius = radius;
    }

    @Override
    public double calculateMainMomentOfInertia() {
        return (1.0 / 2) * mass * Math.pow(radius, 2);
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

    @Override
    public String getInfo() {
        return "Roller\nRadius:\t" + radius + "\nMass:\t" + super.mass;
    }
}
