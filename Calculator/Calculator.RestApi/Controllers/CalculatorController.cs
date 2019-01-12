using System;
using System.Linq;
using CloudComputing.Lab2.Calculator.RestApi.Models;
using Microsoft.AspNetCore.Mvc;

namespace CloudComputing.Lab2.Calculator.RestApi.Controllers
{
    [Produces("application/json")]
    [Route("api/[controller]")]
    public class CalculatorController : Controller
    {
        private readonly CalculatorContext context;

        public CalculatorController(CalculatorContext context)
        {
            this.context = context;
        }

        [HttpGet]
        public IActionResult GetValue() => Json(context.Value.FirstOrDefault()?.Value ?? 0);

        [HttpGet("add/{number}")]
        public IActionResult Add(double number) => Json(Modify(m => m.Value += number).Value);

        [HttpGet("sub/{number}")]
        public IActionResult Substract(double number) => Json(Modify(m => m.Value -= number).Value);

        [HttpGet("mul/{number}")]
        public IActionResult Multiply(double number) => Json(Modify(m => m.Value *= number).Value);

        [HttpGet("div/{number}")]
        public IActionResult Divide(double number)
        {
            // check whether value is close to zero
            if (Math.Abs(number) < Double.Epsilon)
                return BadRequest(new { Error = "Cannot divide by zero" });

            return Json(Modify(m => m.Value /= number).Value);
        }

        [HttpGet("clear")]
        public IActionResult Clear() => Json(Modify(m => m.Value = 0));

        private CalculatorMemory Modify(Action<CalculatorMemory> action)
        {
            CalculatorMemory memory = context.Value.FirstOrDefault()
             ?? new CalculatorMemory();

            action(memory);

            context.Value.Update(memory);
            context.SaveChanges();

            return memory;
        }
    }
}