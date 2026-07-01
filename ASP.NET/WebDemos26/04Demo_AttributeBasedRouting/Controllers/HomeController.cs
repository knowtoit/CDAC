using Microsoft.AspNetCore.Mvc;

namespace _04Demo_AttributeBasedRouting.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
