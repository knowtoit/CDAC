namespace _02Demo_EmptyTemplate
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            //Services
            var app = builder.Build();

            //middlewares

            #region Map.Get,Post,Put,Delete 
            //app.MapGet("/", () => "Hello World!");
            //app.MapGet("/abc", ()=> "something ");
            //app.MapPost("/",()=>"Post: Hello World!");
            //app.MapPut("/", ()=> "PUT : Hello World!");
            //app.MapDelete("/",()=>"DELETE: Hello World!");
            //app.MapGet("/",()=>"<h1>GET: Hello World</h1>"); 
            #endregion

            app.Use(async (httpcontext, next) => {
                await httpcontext.Response.WriteAsync("Hello, Hugh Jackman!");
                await httpcontext.Response.WriteAsync("\n Welcome to Asp.Net MVC Core Web Application");
                next(httpcontext);
                await httpcontext.Response.WriteAsync("\n Still getting this output");
            });

            app.Use(async (httpcontext, next) =>
            {
                await httpcontext.Response.WriteAsync("\n ABCD");
                await httpcontext.Response.WriteAsync("\n 1234");
                next(httpcontext);
                await httpcontext.Response.WriteAsync("\n Tom Holand");
            } );


            app.Run(async (httpcontext) =>
            {
                await httpcontext.Response.WriteAsync("\n Please call JARVIS");
            });

            app.Run();
        }
    }
}
