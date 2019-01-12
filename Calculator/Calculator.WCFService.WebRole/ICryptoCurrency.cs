using System.Collections.Generic;
using System.ServiceModel;

namespace CloudComputing.Lab2.Calculator.WCFService.WebRole
{
    [ServiceContract]
    public interface ICryptoCurrency
    {
        [OperationContract]
        IEnumerable<string> GetSupportedCurrencies();

        [OperationContract]
        bool IsCurrencySupported(string currencyCode);

        [OperationContract]
        decimal Convert(string currencyCodeFrom, string currencyCodeTo, decimal value);
    }
}
