package com.libapi.service;

import com.libapi.helper.HelperPartyMaster;
import com.libapi.model.PartyMaster;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class PartyMasterService {

    public void savePartyMaster(MultipartFile file)
    {
        try {
            List<PartyMaster> partyMaster = HelperPartyMaster.convertPartyMasterExcelToList((file.getInputStream()));
            //this.creditInfoConnection.createConnection(creditInfo);
            //this.creditInfoRepo.saveAll(creditInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
