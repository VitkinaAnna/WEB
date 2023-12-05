using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    public class Database
    {
        public string Name { get; set; }
        public List<Table> Tables { get; } = new List<Table>();

        public Database(string name)
        {
            Name = name;
        }

        public void AddTable(Table table)
        {
            Tables.Add(table);
        }

        public void DeleteTable(int index)
        {
            Tables.RemoveAt(index);
        }
    }
}
