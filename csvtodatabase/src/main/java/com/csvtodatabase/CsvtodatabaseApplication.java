package com.csvtodatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.Integer.parseInt;

@SpringBootApplication
public class CsvtodatabaseApplication {

	public static void main(String[] args) {

		SpringApplication.run(CsvtodatabaseApplication.class, args);

		String jdbcUrl = "jdbc:mysql://localhost:3306/ems";
		String username = "root";
		String password = "Istiyak@mi9";
		String filePath = "C:\\Users\\mistayaque\\Desktop\\data.csv";

		int batchSize=20;

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(jdbcUrl, username, password);
			connection.setAutoCommit(false);

			String sqlQuery = "insert into employee (id, name, address, salary) values (?,?,?,?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
			BufferedReader lineReader = new BufferedReader(new FileReader(filePath));

			String lineText = null;
			int count = 0;

			lineReader.readLine();
			while ((lineText=lineReader.readLine())!=null){
				String[] data = lineText.split(",");

				String id = data[0];
				String name = data[1];
				String address = data[2];
				String salary = data[3];

				preparedStatement.setInt(1, parseInt(id));
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, address);
				preparedStatement.setInt(4, parseInt(salary));
				preparedStatement.addBatch();
				if (count%batchSize==0){
					preparedStatement.executeBatch();
				}
			}
			lineReader.close();
			preparedStatement.executeBatch();
			connection.commit();
			connection.close();
			System.out.println("Data has been inserted successfully..");



		} catch (Exception e){
			e.printStackTrace();
		}


	}

}
