namespace _01Demo_MVCTemplate
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            //Services bind
            // Add services to the container.
            builder.Services.AddControllersWithViews();

            var app = builder.Build(); //Express()

            // Configure the HTTP request pipeline.
            if (!app.Environment.IsDevelopment())
            {
                app.UseExceptionHandler("/Home/Error");
            }
            app.UseStaticFiles();

            app.UseRouting();

            app.UseAuthorization();

            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Home}/{action=Index}/{id?}");



            //Application gets configured based on dependency services and middlewares,
            //host your application on IIS/kestrel web server and also it starts the web
            //application ..just like app.listen() from node application
            app.Run();
        }
    }
}
