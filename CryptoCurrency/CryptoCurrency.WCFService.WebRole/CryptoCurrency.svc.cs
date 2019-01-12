using System;
using System.Collections.Generic;

namespace CloudComputing.Lab2.CryptoCurrency.WCFService.WebRole
{
    public class CryptoCurrency : ICryptoCurrency
    {
        private readonly IDictionary<string, decimal> currencies = new Dictionary<string, decimal>
        {
            ["Bitcoin"] = 6594.27M,
            ["Ethereum"] = 224.67M,
            ["Monero"] = 114.31M,
            ["Zcash"] = 126.21M,
            ["Litecoin"] = 58.79M
        };

        public decimal Convert(string currencyCodeFrom, string currencyCodeTo, decimal value)
        {
            if (!currencies.TryGetValue(currencyCodeFrom, out decimal currencyFromValue)
             || !currencies.TryGetValue(currencyCodeTo, out decimal currencyToValue))
                throw new ArgumentException("Currency with this name does not exists or does not supported");

            return value * currencyFromValue / currencyToValue;
        }
    }
}
