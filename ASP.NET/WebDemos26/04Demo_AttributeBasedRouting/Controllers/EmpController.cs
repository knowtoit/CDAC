using Microsoft.AspNetCore.Mvc;

namespace _04Demo_AttributeBasedRouting.Controllers
{
    //Token based routing
    [Route("{controller}")]  
    public class EmpController : Controller
    {
        [Route("{action}")]   //"/Emp/index"
        public IActionResult Index()
        {
            return View();
        }

        [Route("{action}/{unm}/{pwd?}")]   // "/Emp/About/unm/pwd"
        public IActionResult About(string? unm, string? pwd)
        {
            return View();
        }
    }
}
