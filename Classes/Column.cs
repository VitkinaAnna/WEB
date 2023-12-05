using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    public abstract class Column
    {
        public string Name { get; set; }
        public string Type { get; set; }

        protected Column(string name)
        {
            Name = name;
        }

        public abstract bool Validate(string data);
    }
}
