/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import org.h2.Driver;

/**
 *
 * @author Owner
 */
public class Economy {

    private String _savefile;

    public void Load() {
    }

    public void Save() {
    }

    public Economy() {
    }

    private void _open_db() {

        String URL = "jdbc:h2:" + this._savefile;
        try {
            Class.forName("org.h2.Driver").newInstance();
            Connection conn;
            conn = DriverManager.getConnection(URL, "sa", "");

            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
        }
        // add application code here
  

    }

    public void New() {
        this._savefile = System.getProperty("user.dir") + File.separator + "autosave.econ";
        this._open_db();
    }

    public String getSaveFile() {
        return this._savefile;
    }

    public void EndTurn() {
    }
}
