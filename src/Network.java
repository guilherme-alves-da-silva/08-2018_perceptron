
public class Network {

    public static final Double BIAS = -1.0;
    public static final Double LEARNING_RATE = 0.01;
    private Neuron neuron_1_1; //_eachNeuron_layer
    public static int epochs;

    public Network() {
        neuron_1_1 = new Neuron();
        epochs = 0;
    }

    private boolean errorFound(Double[][] input, Double[] y) {
        for (int i = 0; i < y.length; i++) {
            if (!y[i].equals(input[i][input[0].length - 1])) {
                return true;
            }
        }

        return false;
    }

    public void train(Double[][] input) {
        Double[] y = new Double[input.length];

        do {
            for (int i = 0; i < input.length; i++) {
                System.out.println("epoch: " + epochs + " ; input[" + i + "]");
                y[i] = neuron_1_1.train(input[i]);
            }
            epochs++;
        } while (errorFound(input, y));
    }

    public Double[] getOutput(Double[][] input) {
        Double[] y = new Double[input.length];

        for (int i = 0; i < input.length; i++) {
            y[i] = neuron_1_1.getOutput(input[i]);
        }

        //just printing the ys
        System.out.println("\nresults:");
        for (int i = 0; i < input.length; i++) {
            System.out.println("input[" + i + "]");
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + "  ");
            }
            System.out.println("; y: " + y[i] + "\n");
        }

        return y;
    }
}
