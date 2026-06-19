

namespace _04Demo_OOP
{
    public class Employee
    {
        public String Department;
        public Employee()
        {

        }

        public Employee(String dept) 
        { 
            Department = dept;
        }
    }
    public class Developers : Employee
    {
        public String Projects;
        public Developers():base()
        {

        }


        // Ctor mapping, ctor chaining
        public Developers(String projectName, String dept) : base(dept) 
        {
            Projects = projectName;

        }
    }
}
