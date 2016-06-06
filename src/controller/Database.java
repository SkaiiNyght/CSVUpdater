/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import model.Sample;

/**
 *
 * @author Ag User
 */
public class Database {

    Connection connection = null;

    /**
     * Attempts to establish a connection tot he database. With a failure a
     * message will be displayed to the user, and the program will exit. The connection
     * will default to not auto commit. So The commit method much be called.
     *
     * @return Connection
     */
    private Connection getConnection() {
        final Properties properties = getConnectionProperties();
        try {
            if (connection == null) {
                Class.forName(properties.getProperty("driver")).newInstance();
                connection = DriverManager.getConnection(properties.getProperty("address"), properties);
                connection.setAutoCommit(Boolean.FALSE);
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
        } catch (Exception ex) {
            Message.Message.displayError("Unknown", "An Unexpected Error has occurred\n" + ex.getMessage());
        }
        System.exit(0);
        return null;
    }

    /**
     * Retrieves the connection properties from the properties file. In the case
     * of the property file is unable to be located it will display a message to
     * the user and exit the system.
     *
     * @return Properties
     */
    private Properties getConnectionProperties() {
        Properties properties = Props.getProperties();
        properties.setProperty("address", "jdbc:mysql://"
                    + properties.getProperty("url") + ":"
                    + properties.getProperty("port") + "/"
                    + properties.getProperty("schema"));
        return properties;
    }

    /**
     * Attempts to close the connection, if one exists to the database. If, 
     * for some reason it fails to close a message will be displayed to the
     * user.
     */
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException sqle) {
                Message.Message.displayError("SQL Exception", "Unable to close connection\n" + sqle.getMessage());
            } finally {
                connection = null;
            }
        }
    }

    /**
     * Generic constructor for the Database object, it will attempt to establish
     * a connection to the database. If it fails it will display a message and 
     * exit the program.
     */
    public Database() {
        getConnection();
    }
    
    /**
     * Saves the all of the results for each sample.
     * @param samples 
     */
    public void saveResults(List<Sample> samples){
        getConnection();
        
    }
    
}
