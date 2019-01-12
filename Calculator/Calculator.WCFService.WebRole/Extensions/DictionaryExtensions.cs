using System.Collections.Generic;

namespace CloudComputing.Lab2.Calculator.WCFService.WebRole.Extensions
{
    public static class DictionaryExtensions
    {
        public static TValue GetValueOrDefault<TKey, TValue>(this IDictionary<TKey, TValue> dictionary, TKey key,
            TValue defaultValue = default(TValue))
            => dictionary.TryGetValue(key, out TValue value) ? value : defaultValue;
    }
}
