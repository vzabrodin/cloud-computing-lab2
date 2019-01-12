package cloudcomputing.lab2.client.java;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0;
import org.datacontract.schemas._2004._07.cloudcomputing_lab2_unitsconverter.UnitType;
import org.tempuri.IUnitsConverter;
import org.tempuri.UnitsConverter;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UnitsConverter service = new UnitsConverter();
        IUnitsConverter client = service.getBasicHttpBindingIUnitsConverter();

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
                    case "list":
                        if (commandArgs.length == 1) {
                            List<ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0.KeyValueOfUnitTypeArrayOfstrings3DCQ8F0> result
                                    = client.getSupportedUnits().getKeyValueOfUnitTypeArrayOfstrings3DCQ8F0();

                            System.out.print("Supported units:");
                            for (int i = 0; i < ((List) result).size(); i++) {
                                ArrayOfKeyValueOfUnitTypeArrayOfstrings3DCQ8F0.KeyValueOfUnitTypeArrayOfstrings3DCQ8F0 value = result.get(i);
                                System.out.println("  " + value.getKey().value());

                                for (String unit : value.getValue().getString()) {
                                    System.out.println("    " + unit);
                                }
                            }

                            break;
                        }

                        if (commandArgs.length == 2 && commandArgs[1].equals("types")) {
                            List<UnitType> unitTypes = client.getSupportedTypes().getUnitType();

                            System.out.print("Supported unit types:");
                            for (UnitType type : unitTypes) {
                                System.out.println("  " + type.value());
                            }

                            break;
                        }

                        if (commandArgs.length == 2)
                        {
                            UnitType type =  UnitType.fromValue(commandArgs[2]);
                            List<String> units = client.getSupportedUnitsByType(type).getString();

                            System.out.print("Supported units:");
                            for (String unit : units) {
                                System.out.println("  " + unit);
                            }

                            break;
                        }

                        printUsage();
                        break;
                    case "convert":
                        if (commandArgs.length != 4) {
                            printUsage();
                            break;
                        }

                        Double value = Double.valueOf(commandArgs[3]);
                        Double result = client.convert(commandArgs[1], commandArgs[2], value);

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