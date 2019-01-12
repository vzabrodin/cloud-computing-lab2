using System;
using System.Collections.Generic;
using System.Linq;
using CloudComputing.Lab2.UnitsConverter.Client.UnitsConverterReference;

namespace CloudComputing.Lab2.UnitsConverter.Client
{
    internal class Program
    {
        private static void Main()
        {
            using (UnitsConverterClient client = new UnitsConverterClient())
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
                            case "list":
                            {
                                if (args.Length == 1)
                                {
                                    Dictionary<UnitType, string[]> units = client.GetSupportedUnits();

                                    Console.WriteLine("Supported units:");
                                    foreach (UnitType type in units.Keys)
                                    {
                                        Console.WriteLine($"  {type.ToString()}:");

                                        foreach (string unit in units[type])
                                        {
                                            Console.WriteLine($"    {unit}");
                                        }
                                    }

                                    break;
                                }

                                if (args.Length == 2
                                    && String.Equals(args[1], "types", StringComparison.OrdinalIgnoreCase))
                                {
                                    UnitType[] units = client.GetSupportedTypes();

                                    Console.WriteLine("Supported types:");
                                    foreach (UnitType unit in units)
                                    {
                                        Console.WriteLine(unit);
                                    }

                                    break;
                                }

                                if (args.Length == 2)
                                {
                                    if (Enum.TryParse(args[1], out UnitType type))
                                    {
                                        string[] units = client.GetSupportedUnitsByType(type);

                                        Console.WriteLine("Supported units:");
                                        foreach (string unit in units)
                                        {
                                            Console.WriteLine($"  {unit}");
                                        }
                                    }

                                    break;
                                }

                                PrintUsage();

                                break;
                            }
                            case "support":
                            {
                                if (args.Length != 2)
                                {
                                    PrintUsage();
                                    break;
                                }

                                if (Enum.TryParse(args[1], out UnitType type))
                                {
                                    Console.WriteLine(client.IsUnitTypeSupported(type)
                                        ? $"Unit type {type} is supported"
                                        : $"Unit type {type} is not supported");

                                    break;
                                }

                                Console.WriteLine(client.IsUnitCodeSupported(args[1])
                                    ? $"Unit with code {args[1]} is supported"
                                    : $"Unit with code {args[1]} is not supported");

                                break;
                            }
                            case "convert":
                                if (args.Length != 4
                                    || !Double.TryParse(args[3], out double value))
                                {
                                    PrintUsage();
                                    break;
                                }

                                try
                                {
                                    double result = client.Convert(args[1], args[2], value);
                                    Console.WriteLine($"{value} {args[1]} = {result} {args[2]}");
                                }
                                catch (Exception e)
                                {
                                    Console.WriteLine(e.Message);
                                }

                                break;
                            default:
                                PrintUsage();
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

        private static void PrintUsage()
        {
            Console.WriteLine("Unsupported arguments. Please try again");
        }
    }
}
