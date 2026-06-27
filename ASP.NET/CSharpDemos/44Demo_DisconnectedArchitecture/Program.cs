using Microsoft.Data.SqlClient;
using System.Data;

namespace _44Demo_DisconnectedArchitecture
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string conStr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDb;Integrated Security=True";

            #region Select Query using SqlDataAdapter 
            using (SqlConnection con = new SqlConnection(conStr))
            {
                using (SqlCommand cmd = new SqlCommand())
                {
                    string selectQuery = "select * from Emp";

                    cmd.CommandText = selectQuery;

                    SqlDataAdapter da = new SqlDataAdapter(selectQuery, con);

                    SqlCommandBuilder builder = new SqlCommandBuilder(da);

                    DataTable dt1 = new DataTable("Emp");

                    //This line will help DataAdapter to fetch Primary key column schema from
                    //Database and apply it on DataTable respective columns
                    da.MissingSchemaAction = MissingSchemaAction.AddWithKey;

                    da.Fill(dt1);

                    foreach (DataRow row in dt1.Rows)
                    {
                        Console.WriteLine($"Id : {row["Id"]}, Name:{row["Name"]}, Address:{row["Address"]}");

                    }


                    #region Insert 
                    //DataRow newRow = dt1.NewRow();

                    //Console.WriteLine("Enter Id: ");
                    //newRow["Id"] = Convert.ToInt32(Console.ReadLine());

                    //Console.WriteLine("Enter Name: ");
                    //newRow["Name"] = Convert.ToString(Console.ReadLine());

                    //Console.WriteLine("Enter Address");
                    //newRow["Address"] = Convert.ToString(Console.ReadLine());

                    //dt1.Rows.Add(newRow);

                    //da.Update(dt1);
                    //Console.WriteLine("Addedd Successfully!");
                    #endregion

                    #region Update 
                    Console.WriteLine("Enter id for update: ");
                    int idToBeUpdated = Convert.ToInt32(Console.ReadLine());

                    DataRow rowToBeUpdated = dt1.Rows.Find(idToBeUpdated);

                    Console.WriteLine("Enter Name to be updated: ");
                    rowToBeUpdated["Name"] = Console.ReadLine();

                    Console.WriteLine("Enter address to be updated: ");
                    rowToBeUpdated["Address"] = Console.ReadLine();

                    da.Update(dt1);
                    Console.WriteLine("Updated Successfully!");
                    #endregion


                    #region Delete 
                    Console.WriteLine("Enter id for delete: ");
                    int idToBeDeleted = Convert.ToInt32(Console.ReadLine());

                    DataRow rowPointer = dt1.Rows.Find(idToBeDeleted);
                    rowPointer.Delete();

                    da.Update(dt1);
                    Console.WriteLine("Deleted Successfully!");
                    #endregion

                }
            }
            #endregion

            #region Select, SQLCommand with DataSet
            //DataSet ds = new DataSet();
            //DataTable dt = new DataTable("Emp");

            //DataColumn col1 = new DataColumn("Id", typeof(int));
            //DataColumn col2 = new DataColumn("Name", typeof(string));
            //DataColumn col3 = new DataColumn("Address", typeof(string));

            //dt.Columns.Add(col1);
            //dt.Columns.Add(col2);
            //dt.Columns.Add(col3);

            //dt.PrimaryKey = new DataColumn[] { col1 };

            //using (SqlConnection con = new SqlConnection(conStr))
            //{
            //    using (SqlCommand cmd = new SqlCommand())
            //    {
            //        string selectQuery = "Select * from Emp";

            //        cmd.CommandText = selectQuery;
            //        cmd.Connection = con;

            //        con.Open();

            //        SqlDataReader reader = cmd.ExecuteReader();

            //        while (reader.Read())
            //        {
            //            //We are asking DataTable to generate new DataRow class object as per 
            //            //already existing DataColumn Schema bcz dataTable already has dataColumn
            //            //Collection.
            //            DataRow row = dt.NewRow();

            //            row["Id"] = Convert.ToInt32(reader["Id"]);
            //            row["Name"] = reader["Name"].ToString();
            //            row["Address"] = reader["Address"].ToString();

            //            dt.Rows.Add(row);
            //        }

            //        ds.Tables.Add(dt);

            //        ds.WriteXml("E:\\CDAC\\MS.NET\\CSharpDemos\\44Demo_DisconnectedArchitecture\\Data\\empdata.xml");

            //        //da.Fill(ds, "Emp");

            //        foreach (DataRow row in ds.Tables["Emp"].Rows)
            //        {
            //            Console.WriteLine($"Id: {row["Id"]}, Name:{row["Name"]}, Address:{row["Address"]}");
            //        }
            //    }
            //}
            #endregion

           

        }
    }
}
