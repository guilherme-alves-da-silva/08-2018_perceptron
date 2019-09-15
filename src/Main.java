
/**
 * training being repeated for all the input pairs, until all the ys are the expected ones.
 */
public class Main {

    public static void main(String[] args) {
        Network n = new Network();

        Double[][] data = {
            {1.0, 1.0, -1.0},
            {1.0, 0.0, -1.0},
            {0.0, 1.0, -1.0},
            {0.0, 0.0, 1.0}
        };

        n.train(data);

        n.getOutput(data);
    }
}
