import java.util.Arrays;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 10);
        tda.insertValueInTheArray(0, 1, 20);
        tda.insertValueInTheArray(1, 0, 30);
        tda.insertValueInTheArray(2, 0, 40);
        // tda.insertValueInTheArray(0, 0, 40);
        System.out.print(Arrays.deepToString(tda.arr));
        // tda.accessCell(0, 2);
        // tda.traverse2DArray();
        // tda.search(20);
        tda.delete(0, 0);
        System.out.print(Arrays.deepToString(tda.arr));
    }
}