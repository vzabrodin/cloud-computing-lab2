using System;

namespace CloudComputing.Lab2.Calculator.WCFService.WebRole
{
    public class RandomNumber : IRandomNumber
    {
        private static readonly Random Random = new Random();

        public int GetRandomNumber(int minValue, int maxValue) => Random.Next(minValue, maxValue);

        public string GetData(int value) => $"You entered: {value}";

        public CompositeType GetDataUsingDataContract(CompositeType composite)
        {
            if (composite == null)
                throw new ArgumentNullException(nameof(composite));

            if (composite.BoolValue)
                composite.StringValue += "Suffix";
            return composite;
        }
    }
}
