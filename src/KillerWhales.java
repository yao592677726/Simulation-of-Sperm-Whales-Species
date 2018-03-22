/*
 * Created by Zeyu Chen 03/10/2018
 *
 * Zeyu Chen
 */

public class KillerWhales extends Mammals {
    double preySperm;  // prey rate on sperm whales
    double preyMarin;  // prey rate on other marine mammals


    KillerWhales(int num, int dem, double r, double d) {
        name = "Killer Whales";
        number = num;
        demand = dem;
        reprorate = r;
        deathrate = d;
    }
}
