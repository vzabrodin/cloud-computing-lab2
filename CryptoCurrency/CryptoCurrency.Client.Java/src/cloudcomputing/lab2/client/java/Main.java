package cloudcomputing.lab2.client.java;

import org.tempuri.CryptoCurrency;
import org.tempuri.ICryptoCurrency;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CryptoCurrency service = new CryptoCurrency();
        ICryptoCurrency client = service.getBasicHttpBindingICryptoCurrency();

        try {
            boolean isExit = false;
            Scanner scanner = new Scanner(System.in);

            while (!isExit) {
                System.out.print("> ");

                String command = scanner.nextLine();
                String[] commandArgs = command.split(" ");

                if (commandArgs.length == 0) {
                    printUsage();
                    continue;
                }

                switch (commandArgs[0]) {
                    case "exit":
                        isExit = true;
                        break;
                    case "":
                        break;
                    case "convert":
                        if (commandArgs.length != 4) {
                            printUsage();
                            break;
                        }

                        BigDecimal value = BigDecimal.valueOf(Double.valueOf(commandArgs[3]));
                        BigDecimal result = client.convert(commandArgs[1], commandArgs[2], value);

                        System.out.println(value + " " + commandArgs[1] + " = " + result + " " + commandArgs[2]);

                        break;
                    default:
                        printUsage();
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private static void printUsage() {
        System.out.println("Wrong parameters");
    }
}