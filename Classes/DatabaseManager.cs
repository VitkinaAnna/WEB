using System;
using System.Linq;

namespace WebApplication.Classes
{
    public class DatabaseManager
    {
        private static DatabaseManager _instance;
        public static Database Database;

        private DatabaseManager() { }

        public static DatabaseManager GetInstance()
        {
            if (_instance == null)
            {
                _instance = new DatabaseManager();
                Database = new Database("DB");
                _instance.PopulateTable();
                _instance.PopulateTable();
                // Initialize other dependencies if required
            }
            return _instance;
        }

        public void PopulateTable()
        {
            var table = new Table("testTable" + Database.Tables.Count);
            table.AddColumn(new TypeInteger("column1"));
            table.AddColumn(new TypeReal("column2"));
            table.AddColumn(new StringColumn("column3"));
            table.AddColumn(new TypeChar("column4"));
            table.AddColumn(new TypeHTML("column5"));
            table.AddColumn(new TypeStringInvl("column6"));

            var row1 = new Row();
            row1.Values.Add("10");
            row1.Values.Add("10.0");
            row1.Values.Add("10");
            row1.Values.Add("1");
            row1.Values.Add("hehe.html");
            row1.Values.Add("hehe-hihi");
            table.AddRow(row1);

            var row2 = new Row();
            row2.Values.Add("15");
            row2.Values.Add("15.0");
            row2.Values.Add("15");
            row2.Values.Add("3");
            row2.Values.Add("hehe.html");
            row2.Values.Add("hehe-hihi");
            table.AddRow(row2);

            Database.AddTable(table);
        }

        public string RenameDB(string name)
        {
            if (!string.IsNullOrEmpty(name))
            {
                Database.Name = name;
                return name;
            }
            return null;
        }

        public void CreateDB(string name)
        {
            Database = new Database(name);
        }

        public bool AddTable(string name)
        {
            if (!string.IsNullOrEmpty(name))
            {
                var table = new Table(name);
                Database.AddTable(table);
                return true;
            }
            return false;
        }

        public bool DeleteTable(int tableIndex)
        {
            if (tableIndex != -1 && tableIndex < Database.Tables.Count)
            {
                Database.Tables.RemoveAt(tableIndex);
                return true;
            }
            else
            {
                return false;
            }
        }


        public bool AddColumn(int tableIndex, string columnName, TypeColumn columnType)
        {
            if (!string.IsNullOrEmpty(columnName) && tableIndex != -1 && tableIndex < Database.Tables.Count)
            {
                Column column = null;
                switch (columnType)
                {
                    case TypeColumn.INT:
                        column = new TypeInteger(columnName);
                        break;
                    case TypeColumn.REAL:
                        column = new TypeReal(columnName);
                        break;
                    case TypeColumn.STRING:
                        column = new StringColumn(columnName);
                        break;
                    case TypeColumn.CHAR:
                        column = new TypeChar(columnName);
                        break;
                    case TypeColumn.HTML:
                        column = new TypeHTML(columnName);
                        break;
                    case TypeColumn.STRINGINVL:
                        column = new TypeStringInvl(columnName);
                        break;
                }

                if (column != null)
                {
                    Database.Tables[tableIndex].AddColumn(column);
                    foreach (var row in Database.Tables[tableIndex].Rows)
                    {
                        row.Values.Add("");
                    }
                    return true;
                }
            }
            return false;
        }


        public bool DeleteColumn(int tableIndex, int columnIndex)
        {
            if (columnIndex != -1 && tableIndex != -1 && tableIndex < Database.Tables.Count
                && columnIndex < Database.Tables[tableIndex].Columns.Count)
            {
                Database.Tables[tableIndex].DeleteColumn(columnIndex);
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool AddRow(int tableIndex, Row row)
        {
            if (tableIndex != -1 && tableIndex < Database.Tables.Count)
            {
                var table = Database.Tables[tableIndex];
                for (int i = row.Values.Count; i < table.Columns.Count; i++)
                {
                    row.Values.Add("");
                }
                table.AddRow(row);
                return true;
            }
            return false;
        }

        public bool DeleteRow(int tableIndex, int rowIndex)
        {
            if (rowIndex != -1 && tableIndex != -1 && tableIndex < Database.Tables.Count
                && rowIndex < Database.Tables[tableIndex].Rows.Count)
            {
                Database.Tables[tableIndex].DeleteRow(rowIndex);
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool UpdateCellValue(string value, int tableIndex, int columnIndex, int rowIndex)
        {
            if (tableIndex != -1 && columnIndex != -1 && rowIndex != -1
                && tableIndex < Database.Tables.Count && columnIndex < Database.Tables[tableIndex].Columns.Count
                && rowIndex < Database.Tables[tableIndex].Rows.Count)
            {
                var column = Database.Tables[tableIndex].Columns[columnIndex];
                if (column.Validate(value))
                {
                    Database.Tables[tableIndex].Rows[rowIndex].SetAt(columnIndex, value.Trim());
                    return true;
                }
            }
            return false;
        }

        public bool ChangeColumnName(int tableIndex, int columnIndex, string columnName)
        {
            Database.Tables[tableIndex].Columns[columnIndex].Name = columnName;
            return true;
        }

    }
}
