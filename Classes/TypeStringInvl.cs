using System;
using WebApplication.Classes;

namespace WebApplication.Classes
{
    public class TypeStringInvl : Column
    {
        public TypeStringInvl(string name) : base(name)
        {
            Type = TypeColumn.STRINGINVL.ToString();
        }

        public override bool Validate(string value)
        {
            string[] parts = value.Split(new string[] { " - " }, StringSplitOptions.None);

            if (parts.Length != 2)
            {
                return false; // Incorrect format (must have the " - " delimiter)
            }

            string value1 = parts[0].Trim();
            string value2 = parts[1].Trim();

            // Check if value1 is less than value2
            return string.Compare(value1, value2) < 0;
        }
    }
}
