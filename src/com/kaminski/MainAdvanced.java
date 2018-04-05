package com.kaminski;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAdvanced {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            MaterialPoint figure;
            printMenu();
            String input = bufferedReader.readLine();
            switch (input) {
                case "1":
                    System.out.println("Please enter roller mass:");
                    String rollerMass = bufferedReader.readLine();
                    System.out.println("Please enter roller radius:");
                    String rollerRadius = bufferedReader.readLine();
                    figure = new Roller(Integer.parseInt(rollerMass), Integer.parseInt(rollerRadius));
                    break;
                case "2":
                    System.out.println("Please enter ball mass:");
                    String ballMass = bufferedReader.readLine();
                    System.out.println("Please enter ball radius:");
                    String ballRadius = bufferedReader.readLine();
                    figure = new Ball(Integer.parseInt(ballMass), Integer.parseInt(ballRadius));
                    break;
                case "3":
                    System.out.println("Please enter rod mass:");
                    String rodMass = bufferedReader.readLine();
                    System.out.println("Please enter rod length:");
                    String rodLength = bufferedReader.readLine();
                    figure = new Ball(Integer.parseInt(rodMass), Integer.parseInt(rodLength));
                    break;
                case "0":
                    System.out.println("Bye");
                    bufferedReader.close();
                    return;
                default:
                    System.out.println(input + " is not proper option. Please choose again.");
                    continue;
            }

            double mainMomentOfInertia = figure.calculateMainMomentOfInertia();
            System.out.println("Main moment of inertia: " + mainMomentOfInertia);

            System.out.println("Please enter distance between axises:");
            String distanceBetweenAxises = bufferedReader.readLine();
            double relativeMomentOfInertia = figure.calculateRelativeMomentOfInertia(Integer.parseInt(distanceBetweenAxises));
            System.out.println("Relative moment of inertia: " + relativeMomentOfInertia);
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("********************************************" +
                "\nPlease choose figure type:" +
                "\nRoller - 1" +
                "\nBall - 2" +
                "\nRod - 3" +
                "\nExit - 0");
    }
}