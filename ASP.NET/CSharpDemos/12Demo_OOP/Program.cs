namespace _12Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Demo demo = new Demo();
            demo.WrapperMethod();

            HR hr = new HR();
            hr.Display();
        }
    }

    public class Person
    {
        public virtual string Name { get; set; }

        public virtual void Display()
        {
            Console.WriteLine("Person: Display");
        }
    }

    public class  Employee : Person 
    {
        public sealed override string Name { get => base.Name; set => base.Name = value; }

        public sealed override void Display() 
        {
            Console.WriteLine("Employee : Display");
        }
    }

    public sealed class HR: Employee
    {
        public void EmpData()
        {
            Console.WriteLine("Employee: HR");
        }
    }

    public class Demo
    {
        public void WrapperMethod()
        {
            HR obj = new HR();
            obj.EmpData();
        }
    }
}
