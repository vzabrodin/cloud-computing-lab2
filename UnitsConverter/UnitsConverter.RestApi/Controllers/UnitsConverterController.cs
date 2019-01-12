using System.Collections.Generic;
using CloudComputing.Lab2.UnitsConverter.Model;
using Microsoft.AspNetCore.Mvc;

namespace CloudComputing.Lab2.UnitsConverter.RestApi.Controllers
{
    [Produces("application/json")]
    [Route("api/[controller]")]
    public class UnitsConverterController : Controller
    {
        private readonly Model.UnitsConverter controller = new Model.UnitsConverter();

        [HttpGet("types")]
        public IEnumerable<UnitType> GetSupportedTypes() => controller.GetSupportedTypes();

        [HttpGet("units")]
        public IDictionary<UnitType, IEnumerable<string>> GetSupportedUnits() => controller.GetSupportedUnits();

        [HttpGet("units/{type}")]
        public IEnumerable<string> GetSupportedUnits(UnitType type) => controller.GetSupportedUnits(type);

        [HttpGet("supported/{code}")]
        public bool IsUnitSupported(string code) => controller.IsUnitSupported(code);

        [HttpGet("supported/{type}")]
        public bool IsUnitSupported(UnitType type) => controller.IsUnitSupported(type);

        [HttpGet("convert/{from}/{to}/{value}")]
        public double Convert(string from, string to, double value) => controller.Convert(from, to, value);
    }
}