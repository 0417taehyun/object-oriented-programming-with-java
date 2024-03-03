package academy.pocu.randomnumber;

import java.util.Random;

public class RandomNumberPrinter {
    public static void main(String[] args) {
        Random read = new Random();
        System.out.printf("Random Number: %d %s", read.nextInt(50), System.lineSeparator());
    }
}
