using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication.Classes
{
    public class Table
    {
        public string Name { get; set; }
        public List<Row> Rows { get; } = new List<Row>();
        public List<Column> Columns { get; } = new List<Column>();

        public Table(string name)
        {
            Name = name;
        }

        // Copy constructor
        public Table(Table table)
        {
            Name = table.Name;
            foreach (Row row in table.Rows)
            {
                Row newRow = new Row();
                foreach (string data in row.Values)
                {
                    newRow.Values.Add(data);
                }
                Rows.Add(newRow);
            }
            foreach (Column column in table.Columns)
            {
                Column newColumn;
                TypeColumn columnType = (TypeColumn)Enum.Parse(typeof(TypeColumn), column.Type);
                switch (columnType)
                {
                    case TypeColumn.INT:
                        newColumn = new TypeInteger(column.Name);
                        break;
                    case TypeColumn.REAL:
                        newColumn = new TypeReal(column.Name);
                        break;
                    case TypeColumn.STRING:
                        newColumn = new StringColumn(column.Name);
                        break;
                    case TypeColumn.CHAR:
                        newColumn = new TypeChar(column.Name);
                        break;
                    case TypeColumn.HTML:
                        newColumn = new TypeHTML(column.Name);
                        break;
                    case TypeColumn.STRINGINVL:
                        newColumn = new TypeStringInvl(column.Name);
                        break;
                    default:
                        throw new InvalidOperationException("Unknown column type");
                }
                Columns.Add(newColumn);
            }
        }

        public void AddRow(Row row)
        {
            Rows.Add(row);
        }

        public void DeleteRow(int rowIndex)
        {
            Rows.RemoveAt(rowIndex);
        }

        public void DeleteColumn(int columnIndex)
        {
            Columns.RemoveAt(columnIndex);
            foreach (Row row in Rows)
            {
                row.Values.RemoveAt(columnIndex);
            }
        }

        public void AddColumn(Column column)
        {
            Columns.Add(column);
        }
    }
}
