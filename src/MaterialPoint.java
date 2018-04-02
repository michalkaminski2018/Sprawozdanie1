import java.util.Random;

/**
 * Klasa MaterialPoint przechowuje wartość masy punktu materialnego,
 * dostarcza metody do obliczenia głównego momentu bezwładności tego punktu,
 * oraz momentu bezwładności względem nowej osi.
 */
public class MaterialPoint {

    // prywatna zmienna mass przechowuje wartość masy punktu materialnego
    private int mass;

    /**
     * Konstruktor domyślny inicjujący zmienną mass wygenerowaną wartością pseudolosową
     */
    public MaterialPoint() {
        // stworzenie generatora liczb pseudolosowych
        Random random = new Random();

        // wygenerowanie pseudolosowej wartości masy punktu z zakresu 0-1000
        mass = random.nextInt(1000);
    }

    /**
     * Konstruktor inicjujący zmienną mass wartością przekazanego parametru.
     */
    public MaterialPoint(int mass) {
        this.mass = mass;
    }

    // metoda obliczająca główny moment bezwładności
    public long calculateMainMomentOfInertia() {
        return 0;
    }

    // metoda obliczająca moment bezwładności względem nowej osi
    public long calculateRelativeMomentOfInertia(int distanceBetweenAxises) {
        return calculateMainMomentOfInertia() + mass * distanceBetweenAxises * distanceBetweenAxises;
    }

    // metoda pozwalająca ustawić wartość zmiennej mass
    public void setMass(int mass) {
        // sprawdzenie poprawności przekazanego parametru
        if (mass >= 0) {
            this.mass = mass;
        } else {
            System.out.println("Mass must be positive or zero.");
        }
    }

    // metoda zwracająca wartość zmiennej mass
    public int getMass() {
        return mass;
    }

    // metoda zwracająca stały opis obiektu
    public String getInfo() {
        return "Material point";
    }
}
