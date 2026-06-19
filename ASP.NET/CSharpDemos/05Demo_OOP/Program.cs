namespace _05Demo_OOP
{
    //SRP : Single responsibility Principle
    //DRY : Do Not Repeat Yourself
    internal class Program
    {
        //UI generation : Business Presentation
        static void Main(string[] args)
        {
            while (true) 
            {
                Console.WriteLine("Enter your Database choice: 1.MySql 2.Oracle 3. SqlServer");
                int dbChoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();
                IDatabase dbObj = factory.GetSomeDataBase(dbChoice);
                if (dbObj != null) 
                {
                    Console.WriteLine("Enter your DB operation choice: 1.Insert 2.Update 3.Delete");
                    int opChoice = Convert.ToInt32(Console.ReadLine());
                    switch (opChoice) 
                    {
                        case 1:
                            dbObj.Insert();
                            break;
                        case 2:
                            dbObj.Update();
                            break;
                        case 3:
                            dbObj.Delete();
                            break;
                        default:
                            Console.WriteLine("Invalid db operation");
                            break;                            
                    }
                }

                Console.WriteLine("Do you want to continue? y/n");
                string ynChoice = Console.ReadLine().ToLower(); //y,n
                if(ynChoice == "n")
                {
                    break;
                }
            }
        }
    }


    //Why Interface??
    //Template
    //Forceful implementation of logic
    //Public contract

    public interface IDatabase
    {
        void Insert();
        void Update();
        void Delete();

    }


    public class DataBaseFactory  //Factory Design Pattern
    {
        public IDatabase GetSomeDataBase(int dbChoice)  //Factory method
        {
            IDatabase obj = null;
            
            switch (dbChoice)
            {
                case 1:
                    obj=new MySqlServer();
                    break;
                case 2: 
                    obj = new OracleServer();
                    break;
                case 3: 
                    obj = new SqlServer();
                    break;
                default:
                    obj = null;
                    break;
            }
            return obj;
        }
    }


    //S.O.L.I.D Principles
    //Rule : Single Responsibility Peinciple (SRP)

    public class MySqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Insert operation done for MySql DB");
        }
        public void Update()
        {
            Console.WriteLine("Update operation done for MySql DB");
        }
        public void Delete()
        {
            Console.WriteLine("Delete operation doe for MySql DB");
        }
    }

    public class OracleServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Insert operation done for OracleServer DB");
        }
        public void Update()
        {
            Console.WriteLine("Update operation done for OracleServer DB");
        }
        public void Delete()
        {
            Console.WriteLine("Delete operation doe for OracleServer DB");
        }
    }

    public class SqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Insert operation done for SqlServer DB");
        }
        public void Update()
        {
            Console.WriteLine("Update operation done for SqlServer DB");
        }
        public void Delete()
        {
            Console.WriteLine("Delete operation doe for SqlServer DB");
        }
    }
}
