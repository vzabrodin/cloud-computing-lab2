namespace CloudComputing.Lab2.UnitsConverter.Model
{
    public class Unit : IUnit
    {
        public Unit(string name, string code, UnitType type, double coefficient)
        {
            Name = name;
            Code = code;
            Type = type;
            Coefficient = coefficient;
        }

        public string Name { get; set; }

        public string Code { get; set; }

        public UnitType Type { get; set; }

        public double Coefficient { get; set; }
    }
}
