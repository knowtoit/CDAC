using System.Collections;

namespace _39Demo_CSharpFeatures
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Iterator, custom Collection
            //int[] arr = { 1, 2, 3, 4, 5 };
            //ArrayList arrlst = new ArrayList() { "Mon", "Tue"};

            //CustomCollection myCollectionObj = new CustomCollection();
            //myCollectionObj.Add("Mon");
            //myCollectionObj.Add("Tue");
            //myCollectionObj.Add("Wed");

            //foreach(string day in myCollectionObj)
            //{
            //    Console.WriteLine(day);
            //} 
            #endregion

            #region Action Delegate, Anonymous Methos using action delegate, Lambda Expression using action delegate
            //Demo demo = new Demo();
            //Action action = new Action(demo.show);
            //action();

            //Action action1 = delegate ()
            //{
            //    Console.WriteLine("Anonymous Method using Action delegate");
            //};
            //action1();

            //Action action2 = () => Console.WriteLine("Lambda expression using Action Delegate");
            //action2(); 
            #endregion

            #region Func<> Delegate
            //int no = 5;
            //Func<int> doubleFunc = () => no * 2;
            //Console.WriteLine(doubleFunc());

            //Func<string, string> func2 = (name) => $"Hello {name}";
            //Console.WriteLine("Enter your name: ");
            //string? nm = Console.ReadLine();

            //Console.WriteLine(func2(nm)); 
            #endregion

            List<Emp> emps = new List<Emp>()
            {
                new Emp(){Id=1, Name="Ganesh", Address="pune"},
                new Emp(){Id=2, Name="Suresh", Address="puri"},
                new Emp(){Id=3, Name="Ramesh", Address="mumbai"},
                new Emp(){Id=4, Name="Prathamesh", Address="mp"},
                new Emp(){Id=5, Name="Jignesh", Address="patna"},
                new Emp(){Id=6, Name="Naresh", Address="rajasthan"}
            };

            Console.WriteLine("Enter city initials: ");
            string? letter = Console.ReadLine().ToLower();

            Predicate<Emp> predicate = e => e.Address.StartsWith(letter);
            Predicate<Emp> predicate2 = e => e.Address.Contains(letter);

            var filtereddata = emps.FilteredEmpData(predicate2);
            foreach(var emp in filtereddata)
            {
                emp.DisplayEmpData();
            }
        }
    }

    public class CustomCollection : IEnumerable
    {
        private List<string> days = new List<string>();

        public List<string> Days
        {
            get {  return days; }
        }

        public void Add(string day) 
        {
            days.Add(day);
        }

        public IEnumerator GetEnumerator()
        {
            for(int i=0;i<days.Count; i++)
            {
                yield return days[i];
            }
        }
    }

    public class Demo
    {
        public void show()
        {
            Console.WriteLine("Show method from Demo class");
        }
    }

    public class Emp
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public string Address { get; set; }

        public void DisplayEmpData()
        {
            Console.WriteLine($"Id: {Id}, Name: {Name}, Address: {Address}");
        }

    }

    public static class MyClass
    {
        public static List<Emp> FilteredEmpData(this List<Emp> emps, Predicate<Emp> predicate)
        {
            List<Emp> filteredEmpList = new List<Emp>();
            foreach(Emp emp in emps)
            {
                if (predicate(emp))
                {
                    filteredEmpList.Add(emp);
                }
            }
            return filteredEmpList;
        }
    }
}
