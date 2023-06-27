package com.studentmanagementapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    public static boolean insertStudentToDB(Student st)
    {
        boolean flag = false;
      try {
          // JDBC code...
          Connection connection = ConnectionProvider.createConnection();
          String query = "insert into students(sname, sphone, scity) values(?,?,?)";
          // PreparedStatement
          PreparedStatement preparedStatement = connection.prepareStatement(query);
          // set the value of parameters
          preparedStatement.setString(1, st.getStudentName());
          preparedStatement.setString(2, st.getStudentPhone());
          preparedStatement.setString(3, st.getStudentCity());

          // execute
            preparedStatement.executeUpdate();
            flag = true;

      } catch (Exception e){
          e.printStackTrace();
      }
        return flag;
    }

    public static boolean deleteStudent(int userId) {
        boolean flag = false;
        try {
            // JDBC code...
            Connection connection = ConnectionProvider.createConnection();
            String query = "delete from students where sid=?";
            // PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // set the value of parameters
            preparedStatement.setInt(1, userId);


            // execute
            preparedStatement.executeUpdate();
            flag = true;

        } catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }

    public static void showAllStudent() {
        boolean flag = false;
        try {
            // JDBC code...
            Connection connection = ConnectionProvider.createConnection();
            String query = "select * from students;";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phone = resultSet.getString(3);
                String city = resultSet.getString("scity");

                System.out.println("ID : " + id);
                System.out.println("Name: " + name);
                System.out.println("Phone: " + phone);
                System.out.println("City: " + city);
                System.out.println("++++++++++++++++++++++++++++++");
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
