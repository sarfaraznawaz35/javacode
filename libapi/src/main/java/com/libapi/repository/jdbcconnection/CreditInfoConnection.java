package com.libapi.repository.jdbcconnection;

import com.libapi.entity.CreditInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;
@Component
public class CreditInfoConnection {
    @Autowired
    ConnectionProvider connectionProvider;

    public boolean createConnection(List<CreditInfo> creditInfoData) throws SQLException, ClassNotFoundException {
        Connection connection;
        boolean flag = false;
        try {
            connection = connectionProvider.connectionJdbc();
            StringBuilder query = new StringBuilder("INSERT INTO credit_info (id, weight, type, from_weight, to_weight, party_id, location_id, payment_type, mode_consign, doc_dt, doc_time, user_id) values ");
            for (var i = 0; i < creditInfoData.size(); i++) {
                query.append("(?,?,?,?,?,?,?,?,?,?,?,?)");
                if (creditInfoData.size() > 1 && creditInfoData.size() != i+1)
                    query.append(", ");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
            for (int i = 0; i < creditInfoData.size(); i++) {
                java.sql.Date docDate = new java.sql.Date(creditInfoData.get(i).getDocDt().getTime());
                java.sql.Time docTime = new java.sql.Time(creditInfoData.get(i).getDocDt().getTime());
                // set the value of parameters
                preparedStatement.setInt((i * 12) + 1, creditInfoData.get(i).getId());
                preparedStatement.setString((i * 12) + 2, creditInfoData.get(i).getWeight());
                preparedStatement.setString((i * 12) + 3, creditInfoData.get(i).getType());
                preparedStatement.setBigDecimal((i * 12) + 4, creditInfoData.get(i).getFromWeight());
                preparedStatement.setBigDecimal((i * 12) + 5, creditInfoData.get(i).getToWeight());
                preparedStatement.setInt((i * 12) + 6, creditInfoData.get(i).getPartyId());
                preparedStatement.setString((i * 12) + 7, creditInfoData.get(i).getLocationId());
                preparedStatement.setInt((i * 12) + 8, creditInfoData.get(i).getPaymentType());
                preparedStatement.setInt((i * 12) + 9, creditInfoData.get(i).getModeConsign());
                preparedStatement.setDate((i * 12) + 10, docDate);
                preparedStatement.setTime((i * 12) + 11, docTime);
                preparedStatement.setString((i * 12) + 12, creditInfoData.get(i).getUserId());
            }
            // execute
            preparedStatement.executeUpdate();
            flag = true;

        }catch (Exception e){
            throw e;
        }
        return flag;
    }

}
