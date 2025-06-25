package org.example;

import java.util.Scanner;

public class App {
    // Apenas para o teste funcionar
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("\nChoose the desired option:");
            System.out.println("1 - " + "Fahrenheit to Celsius Conversion");
            System.out.println("2 - " + "Celsius to Fahrenheit Conversion");
            System.out.println("3 - Exit");
            System.out.println("Option:");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    double fahrenheit = teclado.nextDouble();
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.printf("\n" + "Temperature in Celsius: %.2f°C%n", celsius);
                    break;
                case 2:
                    System.out.print("Enter the temperature in Celsius: ");
                    double celsiusInput = teclado.nextDouble();
                    double fahrenheitOutput = (celsiusInput * 9 / 5) + 32;
                    System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheitOutput);
                    break;
                case 3:
                    System.out.println("\n" + "Leaving the program...");
                    teclado.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again..");
            }
        }
    }
}