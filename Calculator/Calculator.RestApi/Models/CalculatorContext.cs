using Microsoft.EntityFrameworkCore;

namespace CloudComputing.Lab2.Calculator.RestApi.Models
{
    public class CalculatorContext : DbContext
    {
        public CalculatorContext(DbContextOptions<CalculatorContext> options)
            : base(options)
        {
        }

        public DbSet<CalculatorMemory> Value { get; set; }
    }
}
