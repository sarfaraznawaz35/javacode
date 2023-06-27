package com.libapi.controller;

import com.libapi.helper.commonhelper.HelperCheckExcelFormat;
import com.libapi.service.CreditInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/creditinfo")
public class CreditInfoController {

    @Autowired
    CreditInfoService creditInfoService;

    @Autowired
    HelperCheckExcelFormat helperCheckExcelFormat;

    @PostMapping("/uploadCreditInfoExcel")
    public ResponseEntity<?> uploadCreditInfoExcel(@RequestParam("file") MultipartFile file) throws Exception {
        if (helperCheckExcelFormat.checkExcelFormat(file)){
            try {
                this.creditInfoService.save(file);
                return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));
            }
            //true
            catch (Exception ex) {
                throw new Exception(ex.getMessage());
            }
        } else  {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel file");
        }
    }

}
