namespace _38Demo_CSharpFeatures
{
    public delegate bool MyDelegate(int x);
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Partial Class
            // //When same entity present in different "physical file locations", compiler will not allow you to write such code because of
            // //logical grouping under same namespace.We have to declare such entities partial to avoide this error and compile code to
            // //genereate single MSIL/ single application output.
            //CMath cmath = new CMath();
            // cmath.Add(2, 3);
            // cmath.Sub(14, 4); 
            #endregion

            #region Nullable Types
            //int x = 10;
            //Nullable operator : ?

            //int? x = null;
            //Nullable<int> x = null;

            //Nullable<double> salary = null;
            //double? salary = null;
            //if (salary.HasValue)
            //{
            //    Console.WriteLine($"Salary = {salary.Value}");
            //}
            //else
            //{
            //    Console.WriteLine("Salary yet to be initialized");
            //}

            //string? str = Console.ReadLine(); 
            #endregion

            #region Object Initializer
            ////Person p1= new Person();
            ////Person p2 = new Person(12, "Peter");
            ////Person p3 = new Person("Ron", "Pune", 20);
            ////Console.WriteLine(p1);
            ////Console.WriteLine(p2.PName);
            ////Console.WriteLine(p3.PName);

            ////Person p1 = new Person();
            ////Person p2 = new Person() { Id=2, PName="Peter"};
            ////Console.WriteLine(p1); 
            ////Console.WriteLine(p2.PName);

            ////Person p3 = new Person() { PName = "Ron", City="Rome", PAge=20};
            ////Console.WriteLine(p3.PAge);

            //Console.WriteLine("Enter age: ");
            //int ag = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter id: ");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter name: ");
            //string? nm = Console.ReadLine();
            //Console.WriteLine("Enter City: ");
            //string? ct = Console.ReadLine();
            ////Compiler generates overloaded constructor syntax at the backend/ in MSIL for you. based on how you have created
            ////object and at the same time , how you have initialized properties in {} syntax: on same declaration line..
            //Person p4 = new Person() { PAge= ag, City=ct, Id = id, PName = nm};
            //Console.WriteLine($"Id:{p4.Id}, Name:{p4.PName}, Age:{p4.PAge}, City:{p4.City}");

            #endregion

            #region Collection Initializer
            //int[] arr = new int[] {1,2,3,4};
            //arr[0] = 1;
            //arr[1] = 2;
            //arr[2] = 3;
            //arr[3] = 4;

            //List<int> lstArr = new List<int>() {1,2,3,4,5,6};
            //lstArr.Add(1);
            //lstArr.Add(2);
            //lstArr.Add(3);
            //lstArr.Add(4);
            //lstArr.Add(5);
            //lstArr.Add(6);

            ////Person p1 = new Person() { Id = 1, PName = "Tom", City = "Pune" };
            ////Person p2 = new Person() { Id = 2, PName = "Ron", City = "Patna" };
            ////List<Person> lst = new List<Person>() { p1, p2 };

            //List<Person> lst = new List<Person>()
            //{
            //    new Person(){Id=1, PName="Tom", City="Pune"},
            //    new Person(){Id = 2, PName="Ron" , City="NYC"},
            //    new Person(){Id=3, PName="Bob", City="LA" }
            //};

            //lst.Add(new Person() { Id = 10, PName = "Tim",City="New Jersey"});


            //foreach(Person person in lst)
            //{
            //    Console.WriteLine($"Id: {person.Id}, Name:{person.PName}, City:{person.City}");
            //} 
            #endregion

            #region Auto-Properties
            //List<Emp> emplst = new List<Emp>()
            //{
            //    new Emp(){Id=1, Address="Bhopal", Name = "Bob"},
            //    new Emp(){Id=2, Name = "Tom" , Address="Pune"},
            //    new Emp(){Id =3, Name="Ron", Address="Patana"}
            //};

            //foreach (Emp emp in emplst)
            //{
            //    Console.WriteLine($"Id: {emp.Id}, Name:{emp.Name}, Address:{emp.Address}");
            //} 
            #endregion

            #region Implicite Type
            ////Can be initialized at local level
            ////We can not only declare var type without initializing it. Because it gets definition at compile time.
            ////We can not declare var as a parameter type for a method
            ////var can not be return type of a method

            //var x = 10;
            //Console.WriteLine(x.GetType().ToString());

            //var y = 10.23;
            //Console.WriteLine(y.GetType().ToString());

            //var e1 = new Emp() { Id = 1, Name="Peter", Address="Pune" };
            //Console.WriteLine(e1.GetType().ToString());

            //var e2 = new Emp() { Id = 2, Name = "Ron", Address = "LA" };
            //Console.WriteLine(e2.GetType().ToString());

            //Demo(y);
            //List<Emp> emps = new List<Emp>() { e1, e2};

            //foreach (Emp emp in emps) 
            //{

            //} 
            #endregion

            #region Anonymous Types: a class without name
            ////Compiler generates class for you alomng with private members and getter and setter and parameterized constructor. 
            ////If sequence of parameters changes in constructor , compiler creates new class for this new combo.

            //var e1 = new Emp() {Id=1, Name = "Ron", Address="Rome"};
            //Console.WriteLine(e1.GetType().ToString());

            //var v1 = new { Id = 1, Name = "Ron", Address = "Rome" };
            //Console.WriteLine(v1.GetType().ToString());
            //Console.WriteLine(v1.Name);

            //var v2 = new { Id = 2, Name = "Bob", Address = "Russia" };
            //Console.WriteLine(v2.GetType().ToString());

            //var v3 = new { Id = 3, Address = "Rome", Name = "Ron" };
            //Console.WriteLine(v3.GetType().ToString());

            //var v4 = new { Id = 3, Address = "Italy", Name = "Rony" };
            //Console.WriteLine(v4.GetType().ToString()); 
            #endregion

            #region Extension Methods
            ////int[] numbers = new int[] {1,2,3,4,5 };
            //int[] numbers = {1,2,3,4,5};
            //List<int> nums = numbers.ConvertToList();
            //foreach (var item in nums) 
            //{
            //    Console.WriteLine(item);
            //}
            //numbers.ToList();

            ////int sum = MySum(numbers);
            ////MyClass.MySum(numbers);
            //int sum = numbers.MySum("PQR");
            //Console.WriteLine($"sum = {sum}");

            ////Sum(numbers);
            //int sm = numbers.Sum();
            //Console.WriteLine($"Sum = {sm}");

            //string email = "abc@gmail.com";
            //email.CheckForValidateEmail();

            //string nm = "abcd";
            //nm.CheckForValidateEmail(); 
            #endregion

            #region Anonymous Methods (Normal Function call)
            //if (Check(100))
            //{
            //    Console.WriteLine($"100 is greater than 10");
            //} 
            #endregion

            #region Lambda Function, => goes to operator
            //MyDelegate del = x => x > 10;

            //if (del(120))
            //{
            //    Console.WriteLine($"120 is greater than 10");
            //} 
            #endregion

            #region Predicate 
            //Predicate returns boolean value. This is buitl-in function in .NET
            //Predicate<int> predicate = x => x > 10;
            //if (predicate(130))
            //{
            //    Console.WriteLine($"130 is greater than 10");
            //} 
            #endregion

        }

        static void Demo(double y)
        {
            Console.WriteLine(y);
        }

        static bool Check(int x)
        {
            return x > 10;
        }
    }

    public static class MyClass
    {
        public static List<int> ConvertToList(this int[] array)
        {
            List<int> list = new List<int>();
            for(int i=0; i<array.Length; i++)
            {
                list.Add(array[i]);
            }
            return list;
        }

        public static int MySum(this int[] arr, string blahBlah)
        {
            int sum = 0;
            for(int i=0; i<arr.Length; i++)
            {
                sum += arr[i];
            }
            Console.WriteLine(blahBlah);
            return sum;
        }

        public static void CheckForValidateEmail(this string str)
        {
            if (str.Contains("@"))
                Console.WriteLine("Valid email");
            else
                Console.WriteLine("Invalid email");
        }
    }


    public class Emp
    {
        //In this property, compiler will be generating a private member at the backend using its own naming algorithm and
        //along with this, it will also generate getter and setter methods for us. we can see this member using ildasm command
        //You will use this feature when we have to write temporary holder classes to hold collection of database records.

        public int Id { get; set; }
        public string Name { get; set; }

        public string Address { get; set; }     

    }
    public class Person
    {
        private int _Id;
        private string? _PName;
        private int _PAge;
        private string _City;

        public string? City
        {
            get { return _City; }
            set { _City = value; }
        }

        public int PAge
        {
            get { return _PAge; }
            set { _PAge = value; }
        }

        public string? PName
        {
            get { return _PName; }  
            set { _PName = value; }
        }

        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }

    #region ctor overloading
    //public Person()
    //{

    //}
    //public Person(int id, string nm)
    //{
    //    _Id = id;
    //    _PName = nm;
    //}
    //public Person(string nm, string city, int ag)
    //{
    //    _PName = nm;
    //    _City = city;
    //    _PAge = ag;
    //}

    //public Person(string nm, int ag)
    //{
    //    _PName = nm;
    //    _PAge = ag;
    //}
    #endregion
     }

    
    public partial class CMath
    {
        //private Nullable<int> _Number;
        private int? _Number;
        public void Add(int x, int y)
        {
            Console.WriteLine($"Add = {x + y}");
        }
    }
}
