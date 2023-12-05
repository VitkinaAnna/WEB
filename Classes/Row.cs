using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    [Serializable]
    public class Row
    {
        public List<string> Values { get; } = new List<string>();

        public string GetAt(int index)
        {
            return Values[index];
        }

        public void SetAt(int index, string content)
        {
            Values[index] = content;
        }
    }
}
