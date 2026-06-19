namespace _07Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
        }
    }

    public interface IX
    {
        void Add(int x, int y);
        void Sub(int x, int y);
    }

    public interface IY
    {
        void Add(int x, int y);
        void Sub(int x, int y);

    }

    public interface IData
    {
        void Greet(string name);
        void Log(string message);
    }
}
