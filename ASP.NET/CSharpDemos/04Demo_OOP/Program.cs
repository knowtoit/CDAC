namespace _04Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Person Class
            //Person person = new Person();
            //person.PId = 12;
            //person.PName = "Hugh Jackman";
            //person.PCity = "NYC";
            //person.GetPersondetails(); 
            #endregion


            #region CMath, AdvMath : Inheritance demo
            //CMath cmath = new CMath();
            //Console.WriteLine($"Add result = {cmath.Add(10,20)}");
            //Console.WriteLine($"Sub result = {cmath.Sub(100,20)}");

            //AdvMath advmath = new AdvMath();
            //Console.WriteLine($"Add result = {advmath.Add(20,34)}");
            //Console.WriteLine($"Sub result ={advmath.Sub(100,22)}");
            //Console.WriteLine($"Sqr result = {advmath.square(5)}"); 
            #endregion


            #region Virtual, Override, New Keyword, Overloading demos
            //AdvMath advMath = new AdvMath();
            //Console.WriteLine(advMath.Add(40,38));
            //Console.WriteLine(advMath.Sub(500,50));

            //advMath.show();
            //advMath.show("Blah Blah Blah");
            //advMath.show("Blah Blah Blah",20);

            //CMath cmath = new AdvMath();
            //Console.WriteLine(cmath.Add(55, 55));
            //Console.WriteLine(cmath.Sub(88,11)); 
            #endregion
        }
    }

    public class Person
    {
        //fields 
        public int PId;
        public string PName;
        public string PCity;

        //Constructor - ctor
        public Person()
        {
            Console.WriteLine("In person constructor");
        }

        //methods
        public void GetPersondetails()
        {
            Console.WriteLine($"Id={PId}, name={PName} , city={PCity}");
        }

    }

    public class CMath()
    {
        public virtual int Add(int x, int y)
        {
            return x + y;
        }

        public int Sub(int x, int y) 
        {
            return x - y;
        }

        public virtual int Mult(int x, int y)
        {
            return x * y;
        }


        public void show()
        {
            Console.WriteLine("show method");
        }



        //method overloading with same class
        public void show(String str)
        {
            Console.WriteLine($"Show methon and {str}");
        }



    }

    public class AdvMath : CMath
    {
        //method overloading across the classes
        public void show(String str, int id) 
        {
            Console.WriteLine($"Show method {str} and id={id}");
        }


        public override int Mult(int x, int y)
        {
            return (x * y) * 2;
        }

        public override int Add(int x, int y)
        {
            return x + y + 1000; 
        
        
        }

        //Shadowing using new keyword : this to tell compiler to remove warning of intentional hiding of
        //inherited member from base classess/entities

        public new int Sub(int x, int y)
        {
            return (x - y)*100;
        }
        public int square(int x)
        {
            return x*x;
        }
    }

}
