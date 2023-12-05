using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    public class TypeInteger : Column
    {
        public TypeInteger(string name) : base(name)
        {
            Type = TypeColumn.INT.ToString();
        }

        public override bool Validate(string data)
        {
            if (string.IsNullOrEmpty(data))
            {
                return true;
            }

            return int.TryParse(data, out _);
        }
    }
}