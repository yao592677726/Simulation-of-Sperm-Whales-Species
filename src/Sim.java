/*
 * Created by Zeyu Chen 03/10/2018
 *
 * Main class
 */


public class Sim {
    public static void main(String[] args) {
        System.out.println("Test");
        SpermWhales sw1 = new SpermWhales(1000, 200, 0.2, 0.1);
        System.out.println("We are " + sw1.getName());
        System.out.println("Number: " + sw1.number);
        System.out.println("Food Demand: " + sw1.number);
        System.out.println("Reproduce Rate: " + sw1.reprorate);
        System.out.println("Death Rate: " + sw1.deathrate);

    }
}

