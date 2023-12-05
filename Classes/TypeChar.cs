using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    public class TypeChar : Column
    {
        public TypeChar(string name) : base(name)
        {
            Type = TypeColumn.CHAR.ToString();
        }

        public override bool Validate(string data)
        {
            return data.Length == 1 || data.Length == 0;
        }
    }
}
