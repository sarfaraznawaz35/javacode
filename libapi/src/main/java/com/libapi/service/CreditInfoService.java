package com.libapi.service;

import com.libapi.entity.CreditInfo;
import com.libapi.helper.HelperCreditInfo;
import com.libapi.repository.CreditInfoRepo;
import com.libapi.repository.jdbcconnection.CreditInfoConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CreditInfoService {

    @Autowired
    CreditInfoRepo creditInfoRepo;

    @Autowired
    CreditInfoConnection creditInfoConnection;

    public void save(MultipartFile file)
    {
        try {
            List<CreditInfo> creditInfo = HelperCreditInfo.convertCreditInfoExcelToList((file.getInputStream()));
            this.creditInfoConnection.createConnection(creditInfo);
            //this.creditInfoRepo.saveAll(creditInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
