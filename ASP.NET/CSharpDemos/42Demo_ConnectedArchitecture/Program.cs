using _42Demo_ConnectedArchitecture.DataAccessLayer_DAL_;
using _42Demo_ConnectedArchitecture.Models;

namespace _42Demo_ConnectedArchitecture
{
    public class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Enter your DB operation Choice: 1.Select All 2. Select By Id 3.Insert 4.Update 5.Delete");
                int opchoice = Convert.ToInt32(Console.ReadLine());

                IETDbContext _dbContext = new IETDbContext();
                int rowsAffected = 0;

                switch (opchoice) 
                {
                    case 1:
                        List<Emp> emps = _dbContext.SelectRecords();
                        //var result = (from emp in emps 
                        //              where emp.Address.StartsWith("p")
                        //              select emp.Name);
                        foreach (var em in emps)
                        {
                            em.GetEmpData();
                        }
                        break;
                    case 2:
                        Console.WriteLine("Enter emp id to search");
                        int idToBeSearched = Convert.ToInt32(Console.ReadLine());

                        Emp emp = _dbContext.SelectEmpById(idToBeSearched);
                        if(emp != null)
                        {
                            emp.GetEmpData();
                        }
                        break;
                    case 3:
                        Emp empToBeInserted = new Emp();

                        Console.WriteLine("Enter Emp Id ");
                        empToBeInserted.Id = Convert.ToInt32(Console.ReadLine());

                        Console.WriteLine("Enter Emp name");
                        empToBeInserted.Name = Console.ReadLine();

                        Console.WriteLine("Enter Emp Address");
                        empToBeInserted.Address = Console.ReadLine();

                        rowsAffected = _dbContext.InsertRecord(empToBeInserted);
                        if(rowsAffected > 0)
                        {
                            Console.WriteLine("Record inserted in database successfully!");
                        }
                        break;
                    case 4:
                        Emp empToBeUpdated = new Emp();

                        Console.WriteLine("Enter Emp Id that to be updated");
                        empToBeUpdated.Id = Convert.ToInt32(Console.ReadLine());

                        Console.WriteLine("Enter Emp name that to be updated");
                        empToBeUpdated.Name = Console.ReadLine();

                        Console.WriteLine("Enter Emp Address that to be updated");
                        empToBeUpdated.Address = Console.ReadLine();

                        rowsAffected = _dbContext.UpdateRecord(empToBeUpdated.Id,empToBeUpdated);
                        if (rowsAffected > 0)
                        {
                            Console.WriteLine("Record updated in database successfully!");
                        }
                        break;
                    case 5:
                        Console.WriteLine("Enter Emp id to be Deleted");
                        int empIdToBeDeleted = Convert.ToInt32(Console.ReadLine()); 

                        rowsAffected = _dbContext.DeleteRecord(empIdToBeDeleted);
                        if (rowsAffected > 0)
                        {
                            Console.WriteLine("Record deleted Successfully!");
                        }
                        break;
                    default:
                        Console.WriteLine("Invalid DB operation Choice!");
                        break;
                }

                Console.WriteLine("Do you want to continue? y/n");
                string ynChoice = Console.ReadLine().ToLower();
                if(ynChoice == "n")
                {
                    break;
                }
            }
        }
    }
}
