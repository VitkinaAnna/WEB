using System;
using WebApplication.Classes;

namespace WebApplication.Classes
{
    public class TypeHTML : Column
    {
        public TypeHTML(string name) : base(name)
        {
            Type = TypeColumn.HTML.ToString();
        }

        public override bool Validate(string value)
        {
            return value.ToLower().EndsWith(".html");
        }
    }
}
