package com.libapi.helper;

import com.libapi.entity.CreditInfo;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelperCreditInfo {

     // convert excel to list of products
    public static List<CreditInfo> convertCreditInfoExcelToList(InputStream is) throws Exception {
        List<CreditInfo> list = new ArrayList<>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int rowNumber=0;
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()){
                Row row = iterator.next();
                if (rowNumber == 0){
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cells = row.iterator();
                int cid=0;
                CreditInfo creditInfo = new CreditInfo();
                while (cells.hasNext()) {
                    Cell cell = cells.next();

                    switch (cid)
                    {
                        case 0:
                            creditInfo.setId((int) cell.getNumericCellValue());
                            break;

                        case  1:
                            creditInfo.setFromWeight(BigDecimal.valueOf(cell.getNumericCellValue()));
                            break;

                        case 2:
                            creditInfo.setToWeight(BigDecimal.valueOf(cell.getNumericCellValue()));
                            break;

                        case 3:
                            creditInfo.setPartyId((int) cell.getNumericCellValue());
                            break;

                        case 4:
                            creditInfo.setPaymentType((int) cell.getNumericCellValue());
                            break;

                        case 5:
                            creditInfo.setModeConsign((int) cell.getNumericCellValue());
                            break;
                        case 6:
                            creditInfo.setDocDt(cell.getDateCellValue());
                            break;

                        case 7:
                            creditInfo.setDocTime(cell.getDateCellValue());
                            break;

                        case 8:
                            creditInfo.setWeight(cell.getStringCellValue());
                            break;

                        case 9:
                            creditInfo.setType(cell.getStringCellValue());
                            break;

                        case 10:
                            creditInfo.setLocationId(cell.getStringCellValue());
                            break;

                        case 11:
                            creditInfo.setUserId(cell.getStringCellValue());
                            break;

                        default:
                            throw new Exception("Column name doesn't match");
                    }
                    cid++;
                }

                list.add(creditInfo);
            }

        }catch (Exception e){
           throw e;
        }
        return list;
    }

}
