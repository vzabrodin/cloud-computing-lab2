using System;
using System.Collections.Generic;

namespace CloudComputing.Lab2.Calculator.WCFService.WebRole
{
    public class CryptoCurrency : ICryptoCurrency
    {
        private static readonly IDictionary<string, decimal> Currencies = new Dictionary<string, decimal>
        {
            ["Bitcoin"] = 6594.27M,
            ["Ethereum"] = 224.67M,
            ["Monero"] = 114.31M,
            ["Zcash"] = 126.21M,
            ["Litecoin"] = 58.79M
        };

        public IEnumerable<string> GetSupportedCurrencies() => Currencies.Keys;

        public bool IsCurrencySupported(string currencyCode) => Currencies.ContainsKey(currencyCode);

        public decimal Convert(string currencyCodeFrom, string currencyCodeTo, decimal value)
        {
            if (!Currencies.TryGetValue(currencyCodeFrom, out decimal currencyFromValue)
             || !Currencies.TryGetValue(currencyCodeTo, out decimal currencyToValue))
                throw new ArgumentException("Currency with this name does not exists or does not supported");

            return value * currencyFromValue / currencyToValue;
        }
    }
}
