using System;
using System.Collections.Generic;
using System.Linq;

namespace CloudComputing.Lab2.UnitsConverter.Model
{
    public sealed class UnitsConverter
    {
        private readonly UnitsDictionary unitsDictionary;

        public UnitsConverter()
        {
            unitsDictionary = new UnitsDictionary();
        }

        public IEnumerable<UnitType> GetSupportedTypes()
            => Enum.GetValues(typeof(UnitType)).Cast<UnitType>();

        public IDictionary<UnitType, IEnumerable<string>> GetSupportedUnits()
            => unitsDictionary.Values
                .GroupBy(u => u.Type)
                .ToDictionary(g => g.Key, g => g.Select(u => u.Code));

        public IEnumerable<string> GetSupportedUnits(UnitType type)
            => unitsDictionary.Values
                .Where(u => u.Type == type)
                .Select(u => u.Code);

        public bool IsUnitSupported(string code) => unitsDictionary.ContainsKey(code);

        public bool IsUnitSupported(UnitType type) => unitsDictionary.Values.Any(u => u.Type == type);

        public double Convert(string from, string to, double value)
        {
            if (!unitsDictionary.TryGetValue(from, out IUnit fromUnit)
             || !unitsDictionary.TryGetValue(to, out IUnit toUnit))
                throw new ArgumentException("Unit with this name does not exists or does not supported");

            if (fromUnit.Type != toUnit.Type)
                throw new ArgumentException("Cannot convert between diffetent unit types");

            IUnit baseUnit = unitsDictionary.BaseUnits[fromUnit.Type];

            return value * toUnit.Coefficient / fromUnit.Coefficient / baseUnit.Coefficient;
        }
    }
}
