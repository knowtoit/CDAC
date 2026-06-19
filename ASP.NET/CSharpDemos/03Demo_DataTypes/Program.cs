// Resolving namespace names with using keyword
using _03Demo_DataTypes.SubSection;

namespace _03Demo_DataTypes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");


            #region Printing Datatypes types using GetType Method
            ////int x = 10;
            ////System.Int32 y = 20;
            //Int32 x = 10;
            //Type x_type = x.GetType();
            //Console.WriteLine(x + " " + x_type.ToString());

            //int y = 20;
            //Console.WriteLine(y + " " + y.GetType().ToString());

            //String str = "Hugh Jackman";
            //Console.WriteLine(str + " " + str.GetType().ToString());

            //short num = 2;
            //Console.WriteLine(num + " " + num.GetType().ToString());

            //long num2 = 1231242143213421;
            //Console.WriteLine(num2 + " " + num2.GetType().ToString());

            //double d = 132.123;
            //Console.WriteLine(d + " " + d.GetType().ToString());

            //bool isActive = true;
            //Console.WriteLine(isActive + " " + isActive.GetType().ToString()); 
            #endregion


            #region Input from user , Convert.To()methods
            //Console.WriteLine("Enter a number: ");
            //String ip = Console.ReadLine();

            //int num = Convert.ToInt32(ip); //Sting to int32 conversion

            //Console.WriteLine(num + " "+num.GetType().ToString());

            //Console.WriteLine("Enter salary");
            //double salary = Convert.ToDouble(Console.ReadLine());
            //Console.WriteLine(salary + " " + salary.GetType().ToString());

            //Console.WriteLine("Is account Active?");
            //bool isActive = Convert.ToBoolean(Console.ReadLine());
            //Console.WriteLine(isActive + " " + isActive.GetType().ToString()); 
            #endregion


            #region Namespace, nested namespaces and using statement
            ////_03Demo_DataTypes.SubSection.Demo obj = new _03Demo_DataTypes.SubSection.Demo();

            //Demo obj = new Demo();

            //Console.WriteLine();
            //obj.show();

            //person person = new person();


            //MyClass myClass = new MyClass(); 
            #endregion

            #region string.Format(), $"{},{}"
            //int x = 22;
            //double d = 1234.567;
            //bool b = true;

            //string formatttedstring = string.Format("Int32 = {0}, Boolean = {2},Double = {1}", x, d, b);
            //Console.WriteLine(formatttedstring);

            //// Latest c# feature: String Interpolation Syntax
            //string str = $"Int32 = {x}, Boolean = {b},Double = {d}";
            //Console.WriteLine(str);
            //Console.WriteLine($"Int32 = {x}, Boolean = {b},Double = {d}, Type = {x.GetType().ToString()}"); 
            #endregion


        }
    }

    public class MyClass
    {

    }
    namespace SubSection
    {
        public class Demo
        {
            public void show()
            {
                Console.WriteLine("Sho from demo class");
            }
        }
        public class person
        {

        }
    }
}
