package com.controllers.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao {

    private String Driver = "com.mysql.cj.jdbc.Driver";
    private String databaseName = "tasks_management";
    private String url    = "jdbc:mysql://localhost:3306/tasks_management?useTimezone=true&serverTimezone=UTC";
    private String user   = "root";
    private String pwd    = "";
    private Connection conn;
    private Statement stm ;

    public Dao() throws SQLException, InstantiationException, IllegalAccessException {
        try {
             System.out.println("Dao!!!");

            Class.forName( Driver ).newInstance();
            conn = DriverManager.getConnection(url, user, pwd);
            stm = conn.createStatement();
        } catch (ClassNotFoundException ex) {

            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean validateUser(final String username, final String password){
        String query = " SELECT * FROM RESSOURCE WHERE username='"+username+"' AND password='"+password+"' AND role_id='"+1+"' ;";
        try(ResultSet rs= stm.executeQuery( query )){
            return rs.next();
        }catch(Exception e){
            return false;
        }
    }

    public boolean validateTester(final String username, final String password){
        String query = " SELECT * FROM RESSOURCE WHERE username='"+username+"' AND password='"+password+"' AND role_id='"+2+"'  ;";
        try(ResultSet rs= stm.executeQuery( query )){
            return rs.next();
        }catch(Exception e){
            return false;
        }
    }

}
