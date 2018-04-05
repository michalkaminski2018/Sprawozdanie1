package com.kaminski;

public class MainBasic {

    public static void main(String[] args) {

        Roller roller = new Roller(15, 10);
        Ball ball = new Ball(20, 25);
        Rod rod = new Rod(10, 5);

        calculateMomentsOfInertiaAndPrintObjectProperties(roller);
        calculateMomentsOfInertiaAndPrintObjectProperties(ball);
        calculateMomentsOfInertiaAndPrintObjectProperties(rod);

        MaterialPoint[] figures = new MaterialPoint[3];
        figures[0] = new Roller(5, 5);
        figures[1] = new Ball(2, 10);
        figures[2] = new Rod(10, 5);

        for (MaterialPoint figure : figures) {
            double mainMomentOfInertia = figure.calculateMainMomentOfInertia();
            System.out.println(figure.getInfo());
            System.out.println("MainBasic moment of inertia: " + mainMomentOfInertia);
            System.out.println();
        }

        for (MaterialPoint figure : figures) {
            double relativeMomentOfInertia = figure.calculateRelativeMomentOfInertia(10);
            System.out.println(figure.getInfo());
            System.out.println("Relative moment of inertia: " + relativeMomentOfInertia);
            System.out.println();
        }
    }


    private static void calculateMomentsOfInertiaAndPrintObjectProperties(MaterialPoint materialPoint) {

        double mainMomentOfInertia = materialPoint.calculateMainMomentOfInertia();
        double relativeMomentOfInertia = materialPoint.calculateRelativeMomentOfInertia(15);

        System.out.println(materialPoint.getInfo() +
                "\nMain moment of inertia: " + mainMomentOfInertia +
                "\nRelative moment of inertia: " + relativeMomentOfInertia +
                "\nDistance between main and relative axis: " + 15);
        System.out.println();
    }
}