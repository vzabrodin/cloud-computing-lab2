using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;

namespace CloudComputing.Lab2.CryptoCurrency.RestApi.Controllers
{
    [Produces("application/json")]
    [Route("api/[controller]")]
    public class CryptoCurrencyController : Controller
    {
        private readonly IDictionary<string, decimal> currencies = new Dictionary<string, decimal>
        {
            ["Bitcoin"] = 6594.27M,
            ["Ethereum"] = 224.67M,
            ["Monero"] = 114.31M,
            ["Zcash"] = 126.21M,
            ["Litecoin"] = 58.79M
        };

        [HttpGet("convert/{from}/{to}/{value}")]
        public decimal Convert(string from, string to, decimal value)
        {
            if (!currencies.TryGetValue(from, out decimal currencyFromValue)
             || !currencies.TryGetValue(to, out decimal currencyToValue))
                throw new ArgumentException("Currency with this name does not exists or does not supported");

            return value * currencyFromValue / currencyToValue;
        }
    }
}