package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {
    private final Scanner scanner;
    public Validation (Scanner scanner) {
        this.scanner = scanner;
    }
        public int validate() {
            int input;
            while (true) {
                try {
                    input = scanner.nextInt();
                    if (input < 1 || input > 3) {
                        System.out.println("No such option :(");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number");
                    scanner.nextLine();
                }
            }
            return input;
        }
    }