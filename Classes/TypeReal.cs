using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    public class TypeReal : Column
    {
        public TypeReal(string name) : base(name)
        {
            Type = TypeColumn.REAL.ToString();
        }

        public override bool Validate(string data)
        {
            if (string.IsNullOrEmpty(data))
            {
                return true;
            }

            return double.TryParse(data, out _);
        }
    }
}
