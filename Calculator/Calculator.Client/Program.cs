using System;
using System.Linq;
using CloudComputing.Lab2.Calculator.Client.CalculatorServiceReference;

namespace CloudComputing.Lab2.Calculator.Client
{
    internal class Program
    {
        private static void Main()
        {
            using (CalculatorClient client = new CalculatorClient())
            {
                try
                {
                    while (true)
                    {
                        Console.Write("> ");

                        string command = Console.ReadLine();

                        string[] args = command
                            ?.Split(' ')
                            .ToArray();

                        if (args?.Any() != true)
                        {
                            Console.WriteLine("Unsupported arguments. Please try again");
                            continue;
                        }

                        switch (args[0].ToLowerInvariant())
                        {
                            case "exit":
                                return;
                            case "":
                                break;
                            case "add":
                                if (args.Length != 3
                                 || !Double.TryParse(args[1], out double number1)
                                 || !Double.TryParse(args[2], out double number2))
                                {
                                    PrintUnsupportedArguments();
                                    break;
                                }

                                Console.WriteLine(client.Add(number1, number2));

                                break;
                            case "sub":
                                if (args.Length != 3
                                 || !Double.TryParse(args[1], out number1)
                                 || !Double.TryParse(args[2], out number2))
                                {
                                    PrintUnsupportedArguments();
                                    break;
                                }

                                Console.WriteLine(client.Substract(number1, number2));

                                break;
                            case "mul":
                                if (args.Length != 3
                                 || !Double.TryParse(args[1], out number1)
                                 || !Double.TryParse(args[2], out number2))
                                {
                                    PrintUnsupportedArguments();
                                    break;
                                }

                                Console.WriteLine(client.Multiply(number1, number2));

                                break;
                            case "div":
                                if (args.Length != 3
                                 || !Double.TryParse(args[1], out number1)
                                 || !Double.TryParse(args[2], out number2))
                                {
                                    PrintUnsupportedArguments();
                                    break;
                                }

                                Console.WriteLine(client.Divide(number1, number2));

                                break;
                            case "pow":
                                if (args.Length != 2 || !Double.TryParse(args[1], out number1))
                                {
                                    PrintUnsupportedArguments();
                                    break;
                                }

                                Console.WriteLine(client.Power(number1));

                                break;
                            default:
                                PrintUnsupportedArguments();
                                break;
                        }
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.InnerException?.Message ?? e.Message);
                }
            }
        }

        private static void PrintUnsupportedArguments()
        {
            Console.WriteLine("Unsupported arguments. Please try again");
        }
    }
}
