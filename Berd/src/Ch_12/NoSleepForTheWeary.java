package Ch_12;

/*
 * This code does not compile.
 */

import static java.lang.System.out;

class NoSleepForTheWeary {

    public static void main(String args[]) {
        out.print("Excuse me while I nap ");
        out.println("for just five seconds...");

        takeANap();

        out.println("Ah, that was refreshing.");
    }

    static void takeANap() {
//        Thread.sleep(5000);
    }
}