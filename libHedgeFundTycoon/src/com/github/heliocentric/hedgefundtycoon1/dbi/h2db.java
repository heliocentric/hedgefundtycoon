/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.dbi;

import com.github.heliocentric.hedgefundtycoon1.Economy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class h2db implements Database {

	private Connection conn;

	@Override
	public void Open(String path) {

		String URL = "jdbc:h2:" + path;
		try {
			Class.forName("org.h2.Driver").newInstance();
			this.conn = DriverManager.getConnection(URL, "sa", "");

			this.conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@Override
	public String GetVersion() {
		String ver = "0.0.0";

		return ver;
	}
}
