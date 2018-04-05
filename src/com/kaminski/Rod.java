package com.kaminski;

import java.util.Random;

public class Rod extends MaterialPoint {

    private int length;

    public Rod() {
        super();
        Random random = new Random(System.currentTimeMillis());
        this.length = random.nextInt(1000);
    }

    public Rod(int mass, int length) {
        super(mass);
        this.length = length;
    }

    @Override
    public double calculateMainMomentOfInertia() {
        return (1.0 / 12) * mass * Math.pow(length, 2);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive or zero.");
        }
    }

    @Override
    public String getInfo() {
        return "Rod\nLength:\t" + length + "\nMass:\t" + super.mass;
    }
}