namespace CloudComputing.Lab2.Calculator.WCFService.WebRole
{
    public class Calculator : ICalculator
    {
        public void Ping()
        {
        }

        public double Add(double number, double number2) => number + number2;

        public double Substract(double number1, double number2) => number1 - number2;

        public double Multiply(double number1, double number2) => number1 * number2;

        public double Divide(double number1, double number2) => number1 / number2;

        public double Power(double number1) => number1 * number1;
    }
}
