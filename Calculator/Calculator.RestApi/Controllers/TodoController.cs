using System.Collections.Generic;
using System.Linq;
using CloudComputing.Lab2.Calculator.RestApi.Models;
using Microsoft.AspNetCore.Mvc;

namespace CloudComputing.Lab2.Calculator.RestApi.Controllers
{
    [Route("api/[controller]")]
    public class TodoController : Controller
    {
        private readonly TodoContext context;

        public TodoController(TodoContext context)
        {
            this.context = context;

            if (this.context.TodoItems.Any())
                return;

            this.context.TodoItems.Add(new TodoItem { Name = "Item1" });
            this.context.SaveChanges();
        }

        [HttpGet]
        public IEnumerable<TodoItem> GetAll() => context.TodoItems.ToList();

        [HttpGet("{id}", Name = "GetTodo")]
        public IActionResult GetById(long id)
        {
            var item = context.TodoItems.FirstOrDefault(t => t.Id == id);
            if (item == null)
            {
                return NotFound();
            }

            return new ObjectResult(item);
        }

        [HttpPost]
        public IActionResult Create([FromBody] TodoItem item)
        {
            if (item == null)
                return BadRequest();

            context.TodoItems.Add(item);
            context.SaveChanges();

            return CreatedAtRoute("GetTodo", new { id = item.Id }, item);
        }

        [HttpPut("{id}")]
        public IActionResult Update(long id, [FromBody] TodoItem item)
        {
            if (item == null || item.Id != id)
            {
                return BadRequest();
            }

            var todo = context.TodoItems.FirstOrDefault(t => t.Id == id);
            if (todo == null)
            {
                return NotFound();
            }

            todo.IsComplete = item.IsComplete;
            todo.Name = item.Name;

            context.TodoItems.Update(todo);
            context.SaveChanges();
            return new NoContentResult();
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(long id)
        {
            var todo = context.TodoItems.FirstOrDefault(t => t.Id == id);
            if (todo == null)
            {
                return NotFound();
            }

            context.TodoItems.Remove(todo);
            context.SaveChanges();
            return new NoContentResult();
        }
    }
}