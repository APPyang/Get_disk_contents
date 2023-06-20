package com.yzt.reader;
/*
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class ReadExcel {
    public static void main(String[] args) throws IOException {
        // 文件路径
        String excelFilePath = "D:\\1\\excel.xlsx";
        //String excelFilePath = "path/to/excel/file.xls";
        // 创建文件流
        FileInputStream inputStream = new FileInputStream(new File("D:\\1\\excel.xlsx"));
        // 创建Workbook对象
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            System.out.println("文件后缀不是xls或xlsx！");
        }
        // 遍历所有sheet
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("Sheet Name: " + sheet.getSheetName());
            Iterator<Row> rows = sheet.iterator();
            while (rows.hasNext()) {
                Row row = rows.next();
                Iterator<Cell> cells = row.iterator();
                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    System.out.print(cell.toString() + "  ");
                }
                System.out.println("");
            }
        }
        inputStream.close();
    }
}
上述仅读取内容并打印
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.yzt.other.list;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class ReadExcel {
    public static String readExcelToJson(String excelFilePath) throws IOException {
        // 创建文件流
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        // 创建Workbook对象
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            System.out.println("The file suffix is not .xls or .xlsx！");
        }
        // 遍历所有sheet
        List<List> sheetList = new ArrayList<List>();

        Iterator sheetIterator = workbook.sheetIterator();
        while (sheetIterator.hasNext()) {
            Sheet sheet=(Sheet)sheetIterator.next();
            List rowList = new ArrayList();
            Iterator rows = sheet.iterator();
            while (rows.hasNext()) {
                //Row row = rows.next();
                Row row= (Row) rows.next();
                List
                        cellList = new ArrayList
                        ();
                Iterator cells = row.iterator();
                while (cells.hasNext()) {
                    Cell cell = (Cell) cells.next();
                    cellList.add(cell.toString());
                }
                rowList.add(cellList);
            }
            sheetList.add(rowList);
        }
        inputStream.close();
        // 转换为JSON字符串
        Gson gson = new GsonBuilder().create();
        return gson.toJson(sheetList);
//      String json = gson.toJson(sheetList);
//      System.out.println(json);
    }
    public static DocumentData readExcel(String excelFilePath) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = null;
        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            System.out.println("The file suffix is not .xls or .xlsx！");
        }

        List<List<String>> sheetList = new ArrayList<>();
        String title = "";
        Iterator<Sheet> sheetIterator = workbook.iterator();
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            List rowList = new ArrayList<>();
            title = sheet.getSheetName();
            Iterator<Row> rows = sheet.iterator();
            while (rows.hasNext()) {
                Row row = rows.next();
                List<String> cellList = new ArrayList<>();
                Iterator<Cell> cells = row.iterator();
                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    cellList.add(cell.toString());
                }
                rowList.add(cellList);
            }
            sheetList.add(rowList);
        }

        inputStream.close();
        // 返回新的 DocumentData 对象
        return new DocumentData(title, sheetList);
    }
    // 调用函数
    public static void main(String[] args) throws IOException {
        String excelFilePath = "file\\to\\path";
        //获取以json格式读取的结果
        System.out.println(ReadExcel.readExcelToJson(excelFilePath));
        //获取以 DocumentData 对象形式读取的结果
        DocumentData documentData = ReadExcel.readExcel(excelFilePath);

    }
}

