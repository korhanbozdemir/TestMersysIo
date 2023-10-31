package Utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtility {

    public static ArrayList<ArrayList<String>> getData(String path, String sheetName, int sutunSayisi) {


        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
            ;
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {  //her bir satırı

            ArrayList<String> satir = new ArrayList<>();
            for (int j = 0; j < sutunSayisi; j++) {  // sutun sayısı kadar dolas
                satir.add(sheet.getRow(i).getCell(j).toString());
            }

            tablo.add(satir);
        }

        return tablo;
    }


    public static void writeToExcel(String path, String name, String code, String fakePosition, String capacity, String shortName) {

        File file = new File(path);
        if (!file.exists()) // dosya yok ise, ilk kez ve 1 kez çalışır
        {
            //hafzada worbook oluştur, içinde hafızada sheet oluştur
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sayfa1");

            //hafızada işlemlerini yap
            Row yeniSatir = sheet.createRow(0);

            ArrayList<Cell> list = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                Cell hucre = yeniSatir.createCell(i);
                list.add(hucre);
            }

            list.get(0).setCellValue(name);
            list.get(1).setCellValue(code);
            list.get(2).setCellValue(fakePosition);
            list.get(3).setCellValue(capacity);
            list.get(4).setCellValue(shortName);

            //kaydet
            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception ex) {
                System.out.println("ex.getMessage() = " + ex.getMessage());
            }
        }
        else {

            FileInputStream inputStream = null;
            Workbook workbook = null;
            Sheet sheet = null;
            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheetAt(0);
            } catch (Exception ex) {
                System.out.println("ex.getMessage() = " + ex.getMessage());
            }
            int sonSatirIndex = sheet.getPhysicalNumberOfRows();
            Row yeniSatir = sheet.createRow(sonSatirIndex);

            ArrayList<Cell> list = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                Cell hucre = yeniSatir.createCell(i);
                list.add(hucre);
            }

            list.get(0).setCellValue(name);
            list.get(1).setCellValue(code);
            list.get(2).setCellValue(fakePosition);
            list.get(3).setCellValue(capacity);
            list.get(4).setCellValue(shortName);


            try {
                inputStream.close();
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception ex) {
                System.out.println("ex.getMessage() = " + ex.getMessage());
            }

        }

    }

    public static void ExcelClean(String path, String sheetName, int sutunSayisi) {

        Workbook workbook = null;
        Sheet sheet = null;

        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
        }

        int satirSayisi = sheet.getPhysicalNumberOfRows();
        for (int i = 1; i < satirSayisi; i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                for (int j = 0; j < sutunSayisi; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        cell.setCellValue(""); // Hücre içeriğini sil
                    }
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
        }

    }
 }