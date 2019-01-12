using System;
using System.Linq;
using CloudComputing.Lab2.CryptoCurrency.Client.CryptoCurrencyServiceReference;

namespace CloudComputing.Lab2.CryptoCurrency.Client
{
    internal class Program
    {
        private static void Main()
        {
            using (CryptoCurrencyClient client = new CryptoCurrencyClient())
            {
                try
                {
                    while (true)
                    {
                        Console.Write("> ");

                        string command = Console.ReadLine();

                        string[] args = command?
                            .Trim()
                            .Split(' ')
                            .Where(s => !String.IsNullOrWhiteSpace(s))
                            .Select(s => s.Trim())
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
                            case "convert":
                                if (args.Length != 4
                                 || !decimal.TryParse(args[3], out decimal value))
                                {
                                    PrintUnsupportedArguments();
                                    break;
                                }

                                try
                                {
                                    decimal result = client.Convert(args[1], args[2], value);
                                    Console.WriteLine($"{value} {args[1]} = {result} {args[2]}");
                                }
                                catch (Exception e)
                                {
                                    Console.WriteLine(e.Message);
                                }

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
