namespace CloudComputing.Lab2.UnitsConverter.Model
{
    public interface IUnit
    {
        string Name { get; }

        string Code { get; }

        UnitType Type { get; }

        double Coefficient { get; }
    }
}
