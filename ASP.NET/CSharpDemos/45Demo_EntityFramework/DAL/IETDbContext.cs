
using _45Demo_EntityFramework.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;

namespace _45Demo_EntityFramework.DAL
{
    //DbContext: EF mapper class, mapping object with database
    public class IETDbContext : DbContext
    {
        //Middle Layer - .NET application with Entity Framework and EF with .NET Application
        
        public DbSet<Emp1> emps { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            //Service to read config file
            //A service to read appsettings.json file
            var builder = new ConfigurationBuilder();

        //Path:
            builder.SetBasePath(Directory.GetCurrentDirectory());

            builder.AddJsonFile("appsettings.json");

            IConfiguration config = builder.Build();

            optionsBuilder.UseSqlServer(config.GetConnectionString("conStr"));
        }
    }
}
