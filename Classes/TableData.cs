using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    [Serializable]
    public class TableData
    {
        public string Name { get; set; }
        public int Id { get; set; }

        public TableData(string name, int id)
        {
            Name = name;
            Id = id;
        }
    }
}
