package Utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtilities {

    public FileInputStream file;
    public FileOutputStream fo;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    public CellStyle style;
    String path = null;

    public ExcelUtilities(String path) {

        this.path = path;
    }

    public int getRowCount(String sheetName) throws IOException {
        file = new FileInputStream(path);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);
        int RowCount = sheet.getLastRowNum();
        workbook.close();
        file.close();
        return RowCount;

    }

    public int getCellCount(String sheetName, int RowNum) throws IOException {

        file = new FileInputStream(path);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(RowNum);
        int CellCount = row.getLastCellNum();
        workbook.close();
        file.close();
        return CellCount;

    }

    public String getCellData(String sheetName, int RowNum, int ColNum) throws IOException {
        file = new FileInputStream(path);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(RowNum);
        cell = row.getCell(ColNum);

        DataFormatter formatter = new DataFormatter();
        String data;
        try {
            data = formatter.formatCellValue(cell);
        } catch (Exception e) {
            data = "data is not available";


        }
        workbook.close();
        file.close();
        return data;

    }

    public void setCellData(String sheetName, int RowNum, int ColNum, String data) throws IOException {
        file = new FileInputStream(path);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);

        row = sheet.getRow(RowNum);
        cell = row.createCell(ColNum);
        cell.setCellValue(data);

        fo = new FileOutputStream(path);
        workbook.write(fo);
        workbook.close();
        file.close();
        file.close();

    }

    public void fillGreenColor(String sheetName, int RowNum, int ColNum) throws IOException {
        file = new FileInputStream(path);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);

        row = sheet.getRow(RowNum);
        cell = row.getCell(ColNum);

        style = workbook.createCellStyle();

        style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        workbook.write(fo);
        workbook.close();
        file.close();
        fo.close();

    }

    public void fillRedColor(String sheetName, int RowNum, int ColNum) throws IOException {
        file = new FileInputStream(path);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);

        row = sheet.getRow(RowNum);
        cell = row.getCell(ColNum);

        style = workbook.createCellStyle();

        style.setFillForegroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        workbook.write(fo);
        workbook.close();
        file.close();
        fo.close();


    }


}

