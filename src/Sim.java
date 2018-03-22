/*
 * Created by Zeyu Chen 03/10/2018
 *
 * Main class
 */



public class Sim {
    public static void main(String[] args) {

        // Initialize
        MainProc mp = new MainProc(0, 85, 100, 1000);
        KillerWhales kw = new KillerWhales(1000, 200, 0.3, 0.2);
        SpermWhales sw = new SpermWhales(1000, 200, 0.2, 0.1);
        MarineMammals mm = new MarineMammals(2000, 200, 0.4, 0.1);



        MainProcThread mpthr = new MainProcThread("Main Process Thread") {
            @Override public void run() {
                System.out.println("Thread:" + threadName + " ID: " + Thread.currentThread().getId() + " starts.");
            }
        };

        KillerWhalesThread kwthr = new KillerWhalesThread("Killer Whales Thread") {
            @Override public void run() {
                System.out.println("Thread:" + threadName + " ID: " + Thread.currentThread().getId() + " starts.");
            }
        };
        // EXAMPLE HERE
        MarineMammalThread mmthr = new MarineMammalThread("Marine Mammals Thread") {
            @Override public void run() {
                System.out.println("Thread:" + threadName + " ID: " + Thread.currentThread().getId() + " starts.");

                // Food resource consume
                mp.consumeFood(mm);

            }
        };

        SpermWhalesThread swthr = new SpermWhalesThread("Sperm Whales Thread") {
            @Override public void run() {
                System.out.println("Thread:" + threadName + " ID: " + Thread.currentThread().getId() + " starts.");
                mp.consumeFood(sw);

            }
        };

        mpthr.start();
        kwthr.start();
        mmthr.start();
        swthr.start();


    }
}


// Thread
class MainProcThread extends Thread{
    String threadName;

    public MainProcThread(String name) {
        threadName = name;
    }
}

class KillerWhalesThread extends Thread{
    String threadName;

    public KillerWhalesThread(String name) {
        threadName = name;
    }
}

class SpermWhalesThread extends Thread{
    String threadName;

    public SpermWhalesThread(String name) {
        threadName = name;
    }
}

class MarineMammalThread extends Thread{
    String threadName;

    public MarineMammalThread(String name) {
        threadName = name;
    }
}



