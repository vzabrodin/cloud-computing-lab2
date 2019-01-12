namespace CloudComputing.Lab2.Calculator.RestApi.Models
{
    public class CalculatorMemory
    {
        public CalculatorMemory()
        {
        }

        public CalculatorMemory(double value)
        {
            Id = 0;
            Value = value;
        }

        public long Id { get; set; }

        public double Value { get; set; }
    }
}
