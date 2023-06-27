package com.libapi.controller;

import com.libapi.helper.HelperPartyMaster;
import com.libapi.helper.commonhelper.HelperCheckExcelFormat;
import com.libapi.service.PartyMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/partymaster")
public class PartyMasterController {

    @Autowired
    PartyMasterService partyMasterService;

    @Autowired
    HelperCheckExcelFormat helperCheckExcelFormat;

    @PostMapping("/uploadPartyMasterExcel")
    public ResponseEntity<?> uploadPartyMasterExcel(@RequestParam("file") MultipartFile file) throws Exception {
        if (helperCheckExcelFormat.checkExcelFormat(file)){
            try {
                this.partyMasterService.savePartyMaster(file);
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
