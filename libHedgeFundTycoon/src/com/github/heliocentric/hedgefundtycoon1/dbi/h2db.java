/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.dbi;

import com.github.heliocentric.hedgefundtycoon1.Economy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public final class h2db implements Database {

	private Connection conn;
	public h2db(String File) {
		this.Open(File);
		if (this.GetVersion().equals("0.0.0")) {
			this.CreateSchema();
		}
		this.UpdateSchema();
	}
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
		try {
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT value FROM tblConfig WHERE name=\'schema\'");
			rs.next();
			ver = rs.getString(1);
			rs.close();
			stmt.close();
		} catch (SQLException ex) {
		}

		return ver;
	}

	@Override
	public void CreateSchema() {
		/*
		 * Creates the version 1.0.1 schema if the schema was not found in the economy file
		 * Note, we always create version 1.0.1, even if _update_schema supports a fast-forward.
		 * This keeps our updater 'honest'
		 */
	}

	@Override
	public void UpdateSchema() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
