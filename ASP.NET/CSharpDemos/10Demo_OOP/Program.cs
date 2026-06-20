namespace _10Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true) 
            {
                Console.WriteLine("Enter your Database choice: 1. MySql 2.Oracle 3.SQL Server");
                int dbChoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();
                Database dbObj = factory.GetSomeDatabase(dbChoice);
                if (dbObj != null) 
                {
                    Console.WriteLine("Enter your db operation choice : 1.Insert 2. Update 3. Delete");
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
                            Console.WriteLine("Invalid db operation choice");
                            break;
                        
                    }
                }

                Console.WriteLine("Do you wanna continue? y/n");
                string ynChoice=Console.ReadLine().ToLower();

                if (ynChoice == "n")
                {
                    break;
                }
            }
        }
    }


    public abstract class Database
    {
        protected Logger _logger = null;
        protected Database() 
        {
            _logger = Logger.GetLogger();
        }

        protected abstract void DoInsert();
        protected abstract void DoUpdate();
        protected abstract void DoDelete();
        protected abstract string GetDatabaseName();

        public void Insert()
        {
            DoInsert();
            _logger.Log($"Insert done in {GetDatabaseName()} DB");
        }

        public void Update()
        {
            DoUpdate();
            _logger.Log($"Update done in {GetDatabaseName()} DB");
        }

        public void Delete() 
        {
            DoDelete();
            _logger.Log($"Delete done in {GetDatabaseName()} DB");
        }
    }


    public class DataBaseFactory
    {
        public Database GetSomeDatabase(int dbChoice)
        {
            Database obj = null;
            switch (dbChoice) 
            {
                case 1:
                    obj = new MySqlServer();
                    break;
                case 2:
                    obj = new OracleServer();
                    break;
                case 3:
                    obj = new SqlServer();
                    break;
            }
            return obj;
        }
    }


    public class MySqlServer : Database
    {
        protected override string GetDatabaseName()
        {
            return "MySql Server";
        }

        protected override void DoInsert()
        {
            //Logic code..
            Console.WriteLine("Insert operation done for MySql DB");
            //_logger.Log("Insert done in mysql")
        }

        protected override void DoUpdate()
        {
            Console.WriteLine("Update operation done for MySql DB");
        }

        protected override void DoDelete()
        {
            Console.WriteLine("Delete operation done for MySql DB");
        }
    }

    public class OracleServer: Database
    {
        protected override string GetDatabaseName()
        {
            return "Oracle server";
        }

        protected override void DoInsert()
        {
            Console.WriteLine("Insert operation done for Oracle DB");
        }

        protected override void DoUpdate() 
        {
            Console.WriteLine("Update operation done for Oracle DB");
        }

        protected override void DoDelete() 
        {
            Console.WriteLine("Delete operation done for Oracle DB");
        }
    }

    public class SqlServer : Database
    {
        protected override string GetDatabaseName() 
        {
            return "SQL Server";
        }

        protected override void DoInsert() 
        {
            Console.WriteLine("Insert operation done for SQL DB");
        }

        protected override void DoUpdate()
        {
            Console.WriteLine("Update operation done for SQL DB");
        }

        protected override void DoDelete()
        {
            Console.WriteLine("Delete operation done for SQL DB");
        }
    }

    public class Logger
    {
        private static Logger _logger1 = new Logger();

        private Logger()
        {
            Console.WriteLine("Logger object gets created...");
        }
        public static Logger GetLogger()
        {
            return _logger1;
        }

        public void Log(string message)
        {
            Console.WriteLine($"-----Log : {message} at {DateTime.Now.ToString()}");
        }
    }
}
