using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _45Demo_EntityFramework.Models
{
    [Table("Emp1")]
    public class Emp1
    {
        [Key] //Primary key + Identity(1,1) - means Auto increment
        [Column("Id", TypeName ="int")]
        public int Id { get; set; }
        [Column("Name", TypeName ="varchar(50)")]
        public string Name { get; set; }

        [Column("Address", TypeName ="varchar(50)")]
        public string Address { get; set; }
    }
}
