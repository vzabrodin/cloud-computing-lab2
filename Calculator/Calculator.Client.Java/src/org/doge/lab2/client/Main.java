package org.doge.lab2.client;

import org.doge.lab2.client.proxy.Calculator;
import org.doge.lab2.client.proxy.ICalculator;

public class Main {
    public static void main(String[] args) {
        Calculator service = new Calculator();
        ICalculator client = service.getBasicHttpBindingICalculator();

        if (args.length < 1) {
            printUsage();
            return;
        }

            switch (args[0]) {
                case "add":
                    if (args.length != 3) {
                        printUsage();
                        return;
                    }

                    System.out.println(args[0] + "(" + args[1] + ", " + args[2] + ") = "
                            + client.add(Double.valueOf(args[1]), Double.valueOf(args[2])));

                case "sub":
                    if (args.length != 3) {
                        printUsage();
                        return;
                    }

                    System.out.println(args[0] + "(" + args[1] + ", " + args[2] + ") = "
                            + client.substract(Double.valueOf(args[1]), Double.valueOf(args[2])));
                case "mul":
                    if (args.length != 3) {
                        printUsage();
                        return;
                    }

                    System.out.println(args[0] + "(" + args[1] + ", " + args[2] + ") = "
                            + client.multiply(Double.valueOf(args[1]), Double.valueOf(args[2])));
                case "div":
                    if (args.length != 3) {
                        printUsage();
                        return;
                    }

                    System.out.println(args[0] + "(" + args[1] + ", " + args[2] + ") = "
                            + client.divide(Double.valueOf(args[1]), Double.valueOf(args[2])));
                    break;
                case "pow":
                    if (args.length != 2) {
                        printUsage();
                        return;
                    }

                    System.out.println(args[0] + "(" + args[1] + ") = " + client.power(Double.valueOf(args[1])));
                    break;

                default:
                    printUsage();
                    break;
            }
    }

    private static void printUsage() {
        System.out.println("Wrong parameters");
    }
}