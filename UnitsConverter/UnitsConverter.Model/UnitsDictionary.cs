using System.Collections;
using System.Collections.Generic;
using CloudComputing.Lab2.UnitsConverter.Model.Extensions;

namespace CloudComputing.Lab2.UnitsConverter.Model
{
    public class UnitsDictionary : IReadOnlyDictionary<string, IUnit>
    {
        private readonly IDictionary<string, IUnit> units;

        public UnitsDictionary()
        {
            units = new Dictionary<string, IUnit>
            {
                ["meter"] = new Unit("Meter", "meter", UnitType.Length, 1),
                ["kilometer"] = new Unit("Kilometer", "kilometer", UnitType.Length, 0.001),
                ["inch"] = new Unit("Inch", "inch", UnitType.Length, 0.0254),
                ["foot"] = new Unit("Foot", "foot", UnitType.Length, 0.3048),
                ["mile"] = new Unit("Mile", "mile", UnitType.Length, 0.001610),

                ["gram"] = new Unit("gram", "gram", UnitType.Weight, 1),
                ["kilogram"] = new Unit("kilogram", "kilogram", UnitType.Weight, 0.001),
                ["pound"] = new Unit("pound", "pound", UnitType.Weight, 0.0022046226218488),
                ["ounce"] = new Unit("ounce", "ounce", UnitType.Weight, 0.03527396194958),
                ["carat"] = new Unit("carat", "carat", UnitType.Weight, 5),
                ["tonne"] = new Unit("tonne", "tonne", UnitType.Weight, 0.000001),
                ["grain"] = new Unit("grain", "grain", UnitType.Weight, 15.432358352941)
            };

            BaseUnits = new Dictionary<UnitType, IUnit>
            {
                [UnitType.Length] = this["meter"],
                [UnitType.Weight] = this["gram"]
            };
        }

        public IEnumerator<KeyValuePair<string, IUnit>> GetEnumerator() => units.GetEnumerator();

        IEnumerator IEnumerable.GetEnumerator() => GetEnumerator();

        public int Count => units.Count;

        public bool ContainsKey(string key) => units.ContainsKey(key);

        public bool TryGetValue(string key, out IUnit value) => units.TryGetValue(key, out value);

        public IUnit this[string key] => units.GetValueOrDefault(key);

        public IEnumerable<string> Keys => units.Keys;

        public IEnumerable<IUnit> Values => units.Values;

        public IDictionary<UnitType, IUnit> BaseUnits { get; }
    }
}
