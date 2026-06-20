namespace _11Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
        }
    }

    public class Notepad
    {
        ISpellChecker _checker = null;
        public Notepad(ISpellChecker checker)
        {
            if(checker == null)
            {
                _checker = new EnglishSpellChecker();
            }
            else
            {
                _checker = checker;
            }
        }

        public void Cut()
        {
            Console.WriteLine("Cut");
        }
        public void Copy()
        {
            Console.WriteLine("Copy");
        }
        public void Paste()
        {
            Console.WriteLine("Paste");
        }

        public void SpllCheck()
        {
            _checker.DoSpellCheck();
        }
    }

    public interface ISpellChecker
    {
        void DoSpellCheck();
    }

    public class SpellCheckerFactory
    {
        public ISpellChecker GetSomeSpellChecker(string lang)
        {
            ISpellChecker _somechecker = null;
            switch (lang) 
            {
                 
            }
            return _somechecker;
        }
              
    }

    public class EnglishSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            Console.WriteLine("Spell Check done for English!");
        }
    }

    public class SpanishSpellChecker : ISpellChecker
    {
        public void DoSpellCheck() 
        {
            Console.WriteLine("Spell check done for Spanish");
        }
    }

    public class FrenchSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            Console.WriteLine("Spell check done for French");
        }
    }

    public class KlingonSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            Console.WriteLine("Spell check done for Klingon");
        }
    }

    public class HindiSpellChecker : ISpellChecker
    {
        public void DoSpellCheck()
        {
            Console.WriteLine("Spell check done for Hindi");
        }
    }
}
