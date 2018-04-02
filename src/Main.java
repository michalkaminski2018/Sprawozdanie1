import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // wygenerowanie pierwszego obiektu klasy MeterialPoint z użyciem konstruktora domyślnego
        MaterialPoint firstMaterialPoint = new MaterialPoint();
        calculateAndPrintMomentOfInertia(firstMaterialPoint, 10);

        // wygenerowanie drugiego obiektu klasy MeterialPoint z użyciem konstruktora jednoargumentowego
        MaterialPoint secondMaterialPoint = new MaterialPoint(25);
        calculateAndPrintMomentOfInertia(secondMaterialPoint, 5);

        // zmiana wartości masy pierwszego punktu
        firstMaterialPoint.setMass(10);
        calculateAndPrintMomentOfInertia(firstMaterialPoint, 3);

        // utworzenie tablicy punktów
        MaterialPoint[] materialPoints = new MaterialPoint[10];
        // stworzenie generatora liczb pseudolosowych
        Random random = new Random();
        // wypełnienie tablicy punktami materialnymi
        for (int i = 0; i < materialPoints.length; i++) {
            int randomMass = random.nextInt(1000);
            materialPoints[i] = new MaterialPoint(randomMass);
        }

        // obliczenie i wypisanie momentów bezwladności dla tablicy punktów
        for (MaterialPoint materialPoint : materialPoints) {
            calculateAndPrintMomentOfInertia(materialPoint, 15);
        }
    }

    // metoda pomocnicza obliczająca główny moment bezwładności, moment bezwładności względem wskazanej osi, oraz wypisująca wyniki obliczeń i opis obiektu
    private static void calculateAndPrintMomentOfInertia(MaterialPoint materialPoint, int distanceBetweenAxises) {
        long mainMomentOfInertia = materialPoint.calculateMainMomentOfInertia();
        long relativeMomentOfInertia = materialPoint.calculateRelativeMomentOfInertia(distanceBetweenAxises);
        System.out.println(materialPoint.getInfo() +
                "\nMass: " + materialPoint.getMass() +
                "\nMain moment of inertia: " + mainMomentOfInertia +
                "\nRelative moment of inertia: " + relativeMomentOfInertia +
                "\nDistance between main and relative axis: " + distanceBetweenAxises);
        System.out.println();
    }
}
