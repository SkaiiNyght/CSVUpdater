/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Ag User
 */
public class Database {

    Connection connection = null;

    private Connection getConnection() {
        final Properties properties = getConnectionProperties();
        try {
            if (connection == null) {
                Class.forName(properties.getProperty("driver")).newInstance();
                connection = DriverManager.getConnection(properties.getProperty("url"), properties);
            }
            return connection;
        } catch (ClassNotFoundException cnfe) {
            Message.Message.displayError("Locating Class", "Could Not find the Class for the Database Driver\n" + cnfe.getMessage());
        } catch (InstantiationException ie) {
            Message.Message.displayError("Instatiaion", "Could not instantiate Database Driver\n" + ie.getMessage());
        } catch (IllegalAccessException iae) {
            Message.Message.displayError("Access", "Could not access Database Driver\n" + iae.getMessage());
        } catch (SQLException sqle) {
            Message.Message.displayError("SQL", "SQL Exception\n" + sqle.getMessage());
        } catch(Exception ex){
            Message.Message.displayError("Unknown", "An Unexpected Error has occurred\n" + ex.getMessage());
        }
        return null;
    }
    private Properties getConnectionProperties() {
        Properties properties = new Properties();
        
        try {
            FileReader reader = new FileReader("./src/resources/configuration.properties");
            properties.load(reader);
            properties.setProperty("url", "jdbc:mysql://" +
                    properties.getProperty("url") + ":" +
                    properties.getProperty("port") + "/" +
                    properties.getProperty("schema"));
        } catch (Exception ex) {
            Message.Message.displayError("Locating File", "Unable to locate the properties file.\n" + ex.getMessage());
        }
            

        return properties;
    }
    
    public void closeConnection(){
        if(connection != null){
            try{
                connection.close();
            }catch(SQLException sqle){
                Message.Message.displayError("SQL Exception", "Unable to close connection\n" + sqle.getMessage());
            }finally{
                connection = null;
            }
        }
    }
    public Database() {
        getConnection();
    }
}
