using _42Demo_ConnectedArchitecture.Models;
using Microsoft.Data.SqlClient;

namespace _42Demo_ConnectedArchitecture.DataAccessLayer_DAL_
{
    //Data Access Layer/DAL : DBContext Layer : This is responsible to perform IET Db specific operations
    public class IETDbContext
    {
        string _connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDb;Integrated Security=True";

        public List<Emp> SelectRecords()
        {
            SqlConnection con = new SqlConnection(_connectionString);

            //SqlCommand cmd = new SqlCommand("select * from Emp", con);
            string selectQuery = "select * from Emp";

            SqlCommand cmd = new SqlCommand();
            cmd.CommandText = selectQuery;
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.Connection = con;

            con.Open();

            SqlDataReader reader = cmd.ExecuteReader();

            List<Emp> emps = new List<Emp>();

            while (reader.Read()) 
            {
                //If reader represents a row and a row is a collection of columns
                int id = Convert.ToInt32(reader[0]);//id
                string? nm = Convert.ToString(reader["Name"]);
                string? add = Convert.ToString(reader["Address"]);

                emps.Add(new Emp() { Id = id, Name = nm, Address = add });
            }
            con.Close();

            return emps;
        }

        public Emp SelectEmpById(int id)
        {
            SqlConnection con = new SqlConnection(_connectionString);

            string selectQuery = $"select * from Emp where Id = {id}";

            SqlCommand cmd = new SqlCommand();

            cmd.CommandText = selectQuery;
            cmd.CommandType= System.Data.CommandType.Text;
            cmd.Connection = con;

            con.Open() ;

            SqlDataReader reader = cmd.ExecuteReader();

            Emp emp = new Emp();

            while (reader.Read())
            {
                emp.Id = Convert.ToInt32(reader["Id"]);
                emp.Name = Convert.ToString(reader["Name"]);
                emp.Address = Convert.ToString(reader["Address"]);
            }

            con.Close();

            return emp;
        }

        public int InsertRecord(Emp obj)
        {
            int noRowsAffected = 0;

            using (SqlConnection con = new SqlConnection(_connectionString))
            {
                string insertQuery = $"insert into Emp values({obj.Id}, '{obj.Name}', '{obj.Address}')";
                //"values(1,'HJ','NYC')"

                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandText = insertQuery;
                    cmd.CommandType = System.Data.CommandType.Text;
                    cmd.Connection = con;

                    con.Open();
                    noRowsAffected = cmd.ExecuteNonQuery();
                }
            }
            return noRowsAffected;
        }

        public int UpdateRecord(int id,Emp obj) 
        {
            int noRowsAffected = 0;
            using (SqlConnection con = new SqlConnection(_connectionString))
            {
                string updateQuery = $"update Emp set Name='{obj.Name}', Address='{obj.Address}' where Id={id}";

                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandText = updateQuery;
                    cmd.CommandType = System.Data.CommandType.Text;
                    cmd.Connection = con;

                    con.Open();

                    noRowsAffected = cmd.ExecuteNonQuery();
                }
            }
            return noRowsAffected;
        }

        public int DeleteRecord(int id) 
        {
            int noRowsAffected = 0;
            using (SqlConnection con = new SqlConnection(_connectionString))
            {
                string deleteQuery = $"Delete Emp where Id = {id}";

                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandText = deleteQuery;
                    cmd.CommandType = System.Data.CommandType.Text;
                    cmd.Connection = con;

                    con.Open();
                    noRowsAffected = cmd.ExecuteNonQuery();
                }
            }
            return noRowsAffected;
        }
    }
}
