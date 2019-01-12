using System.ServiceModel;

namespace CloudComputing.Lab2.CryptoCurrency.WCFService.WebRole
{
    [ServiceContract]
    public interface ICryptoCurrency
    {
        [OperationContract]
        decimal Convert(string currencyCodeFrom, string currencyCodeTo, decimal value);
    }
}
