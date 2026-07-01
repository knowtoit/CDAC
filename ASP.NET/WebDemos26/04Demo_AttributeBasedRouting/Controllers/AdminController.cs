using Microsoft.AspNetCore.Mvc;

namespace _04Demo_AttributeBasedRouting.Controllers
{
    [Route("BVS")]
    public class AdminController : Controller
    {
        [Route("Dashboard")] // "/BVS/Dashboard"
        public IActionResult Index()
        {
            return View();
        }

        [Route("Demo/{id?}")]  // "/BVS/Demo"
        public IActionResult GetData(int? id)
        {
            return View("Data");
        }

        [Route("Test")] // "BVS/Test"
        public IActionResult GetInfo()
        {
            return RedirectToAction("Index");
        }
    }
}
