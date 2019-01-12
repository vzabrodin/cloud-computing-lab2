using System.Collections.Generic;
using CloudComputing.Lab2.UnitsConverter.Model;

namespace CloudComputing.Lab2.UnitsConverter.WCFService.WebRole
{
    public class UnitsConverter : IUnitsConverter
    {
        private readonly Model.UnitsConverter controller = new Model.UnitsConverter();

        public IEnumerable<UnitType> GetSupportedTypes() => controller.GetSupportedTypes();

        public IDictionary<UnitType, IEnumerable<string>> GetSupportedUnits() => controller.GetSupportedUnits();

        public IEnumerable<string> GetSupportedUnits(UnitType type) => controller.GetSupportedUnits(type);

        public bool IsUnitSupported(string code) => controller.IsUnitSupported(code);

        public bool IsUnitSupported(UnitType type) => controller.IsUnitSupported(type);

        public double Convert(string from, string to, double value) => controller.Convert(from, to, value);
    }
}
