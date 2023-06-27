package com.libapi.helper;

import com.libapi.entity.CreditInfo;
import com.libapi.model.PartyMaster;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelperPartyMaster {

    // Check that file is of excel type or not
    public static boolean checkPartyMasterExcelFormat(MultipartFile file){
        String contentType = file.getContentType();
        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")){
            return true;
        } else {
            return false;
        }
    }

    // convert excel to list of Party master
    public static List<PartyMaster> convertPartyMasterExcelToList(InputStream is) throws Exception {
        List<PartyMaster> list = new ArrayList<>();
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
                //CreditInfo creditInfo = new CreditInfo();
                PartyMaster partyMaster = new PartyMaster();
                while (cells.hasNext()) {
                    Cell cell = cells.next();

                    switch (cid)
                    {
                        case 0:
                            partyMaster.setId((int)cell.getNumericCellValue());
                            break;

                        case  1:
                            partyMaster.setPartyName(cell.getStringCellValue());
                            break;

                        case 2:
                            partyMaster.setPartyType((int)cell.getNumericCellValue());
                            break;

                        case 3:
                            partyMaster.setAddress1(cell.getStringCellValue());
                            break;

                        case 4:
                            partyMaster.setAddress2(cell.getStringCellValue());
                            break;

                        case 5:
                            partyMaster.setAddress3(cell.getStringCellValue());
                            break;

                        case 6:
                            partyMaster.setCity(cell.getStringCellValue());
                            break;

                        case 7:
                            partyMaster.setState(cell.getStringCellValue());
                            break;

                        case 8:
                            partyMaster.setContactperson(cell.getStringCellValue());
                            break;

                        case 9:
                            partyMaster.setMobileno(cell.getStringCellValue());
                            break;

                        case 10:
                            partyMaster.setPincode(cell.getStringCellValue());
                            break;

                        case 11:
                            partyMaster.setEmail(cell.getStringCellValue());
                            break;

                        case 12:
                            partyMaster.setDocNo(cell.getStringCellValue());
                            break;

                        default:
                            throw new Exception("Column name doesn't match");
                    }
                    cid++;
                }

                list.add(partyMaster);
            }

        }catch (Exception e){
            throw e;
        }
        return list;
    }

}
