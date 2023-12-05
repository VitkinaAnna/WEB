using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Configuration;
using System.Web.Services;
using System.Configuration;
using System.Threading.Tasks;
using WebApplication.Classes;
using Newtonsoft.Json;
using Microsoft.EntityFrameworkCore;
using System.IO;

namespace WebApplication
{
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.None)]
    [System.ComponentModel.ToolboxItem(false)]
    [System.Web.Script.Services.ScriptService]
    public class WebService : System.Web.Services.WebService
    {
        private DatabaseManager dbManager = DatabaseManager.GetInstance();

        [WebMethod]
        public string GetRows(int tableIndex)
        {
            var rows = DatabaseManager.Database.Tables[tableIndex].Rows;
            return JsonConvert.SerializeObject(rows);
        }

        [WebMethod]
        public string GetColumns(int tableIndex)
        {
            var columns = DatabaseManager.Database.Tables[tableIndex].Columns;
            return JsonConvert.SerializeObject(columns);
        }

        [WebMethod]
        public string GetTablesData()
        {
            var tables = DatabaseManager.Database.Tables;
            var tablesData = new List<TableData>();

            for (int i = 0; i < tables.Count; i++)
            {
                tablesData.Add(new TableData(tables[i].Name, i));
            }

            return JsonConvert.SerializeObject(tablesData);
        }

        [WebMethod]
        public bool CreateTable(string name)
        {
            return dbManager.AddTable(name);
        }

        [WebMethod]
        public bool AddRow(int tableIndex)
        {
            return dbManager.AddRow(tableIndex, new Row());
        }

        [WebMethod]
        public bool AddColumn(int tableIndex, string name, TypeColumn columnType)
        {
           
            return dbManager.AddColumn(tableIndex, name, columnType);
        }

        [WebMethod]
        public bool DeleteTable(int tableIndex)
        {
            return dbManager.DeleteTable(tableIndex);
        }

        [WebMethod]
        public bool DeleteColumn(int tableIndex, int columnIndex)
        {
            return dbManager.DeleteColumn(tableIndex, columnIndex);
        }

        [WebMethod]
        public bool DeleteRow(int tableIndex, int rowIndex)
        {
            return dbManager.DeleteRow(tableIndex, rowIndex);
        }


        [WebMethod]
        public bool EditCell(int tableIndex, int rowIndex, int columnIndex, string value)
        {
            return dbManager.UpdateCellValue(value, tableIndex, columnIndex, rowIndex);
        }

        [WebMethod]
        public void CreateTestTable()
        {
            dbManager.PopulateTable();
        }

        [WebMethod]
        public bool ChangeColumnName(int tableIndex, int columnIndex, string columnName)
        {
            return dbManager.ChangeColumnName(tableIndex, columnIndex, columnName);
        }
    }
}
