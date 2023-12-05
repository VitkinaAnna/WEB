using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    public class StringColumn : Column
    {
        public StringColumn(string name) : base(name)
        {
            Type = TypeColumn.STRING.ToString();
        }

        public override bool Validate(string data)
        {
            return true;
        }
    }
}
