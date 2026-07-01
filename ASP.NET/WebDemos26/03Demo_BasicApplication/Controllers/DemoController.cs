using Microsoft.AspNetCore.Mvc;

namespace _03Demo_BasicApplication.Controllers
{
    //Demo/Index
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public string Data(string unm, string pwd)
        {
            return $"User Name: {unm}, Password: {pwd}";
        }

        //You have to use Query string format: ? then after "?" pass parameters in URL
        //"/Demo/Dashboard?id=5&nm=Tom Ellise"

        public string Dashboard (int ? id, string? nm)
        {
            return $"Id: {id}, name: {nm}";
        }
    }
}
