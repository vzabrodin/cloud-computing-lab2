using System.ServiceModel;

namespace CloudComputing.Lab2.Calculator.WCFService.WebRole
{
    [ServiceContract]
    public interface ICalculator
    {
        [OperationContract]
        void Ping();

        [OperationContract]
        double Add(double number, double number2);

        [OperationContract]
        double Substract(double number1, double number2);

        [OperationContract]
        double Multiply(double number1, double number2);

        [OperationContract]
        double Divide(double number1, double number2);

        [OperationContract]
        double Power(double number1);
    }
}
