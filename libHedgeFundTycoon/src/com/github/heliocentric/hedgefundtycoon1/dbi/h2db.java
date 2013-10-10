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
		Logger.getLogger(Economy.class.getName()).log(Level.INFO, "Pre-UpdateSchema DB Version=" + this.GetVersion());
		if (this.GetVersion().equals("0.0.0")) {
			this.CreateSchema();
		}
		this.UpdateSchema();
		Logger.getLogger(Economy.class.getName()).log(Level.INFO, "Post-UpdateSchema DB Version=" + this.GetVersion());
	}

	@Override
	public void Open(String path) {

		String URL = "jdbc:h2:" + path;
		try {
			Class.forName("org.h2.Driver").newInstance();
			this.conn = DriverManager.getConnection(URL, "sa", "");
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
			ResultSet rs = stmt.executeQuery("SELECT fldValue FROM tblConfig WHERE fldName=\'schema\' LIMIT 1");
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
		this.BeginTransaction();
		try {
			this.schema_change("CREATE TABLE tblConfig (fldConfigID INT PRIMARY KEY AUTO_INCREMENT, fldName VARCHAR(255), fldValue VARCHAR(255));");
			this.schema_change("INSERT INTO tblConfig (fldName, fldValue) VALUES('schema','1.0.1')");
		} catch (Exception ex) {
	
			Logger.getLogger(Economy.class.getName()).log(Level.SEVERE, null, ex);
			this.RollBackTransaction();
			return;
		}
		this.EndTransaction();
		return;
	}

	@Override
	public void BeginTransaction() {
	}

	@Override
	public void EndTransaction() {
	}

	@Override
	public void RollBackTransaction() {
	}

	private void schema_change(String sql) throws Exception {
		try {
			Statement stmt = this.conn.createStatement();
			stmt.execute(sql);
			
		} catch (SQLException ex) {
			throw ex;
		}
	}
	
	private void _UpdateVersionNumber(String New) throws Exception {
			this.schema_change("UPDATE tblConfig SET fldValue = '" + New + "' WHERE fldName = 'schema'");
	}
	@Override
	public void UpdateSchema() {
		if (this.GetVersion().equals("1.0.1")) {
			try {
				this.BeginTransaction();
				this.schema_change("CREATE TABLE tblUnit (fldUnitID INT PRIMARY KEY AUTO_INCREMENT, fldUnitSymbol VARCHAR(255), fldUnitName VARCHAR(255), fldUnitShortName VARCHAR(255), fldUnitType INT);");
				this._UpdateVersionNumber("1.0.2");
				this.EndTransaction();
			} catch (Exception ex) {
				this.RollBackTransaction();
				Logger.getLogger(h2db.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if (this.GetVersion().equals("1.0.2")) {
			try {
				this.BeginTransaction();
				this.schema_change("CREATE TABLE tblUnitType (fldUnitID INT PRIMARY KEY AUTO_INCREMENT, fldUnitTypeName VARCHAR(255));");
				this._UpdateVersionNumber("1.0.3");
				this.EndTransaction();
			} catch (Exception ex) {
				this.RollBackTransaction();
				Logger.getLogger(h2db.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if (this.GetVersion().equals("1.0.3")) {
			try {
				this.BeginTransaction();
				this.schema_change("CREATE TABLE tblBalance (fldBalanceID INT PRIMARY KEY AUTO_INCREMENT, fldBalanceUnitTypeID INT, fldBalanceValue DECIMAL(30,10))");
				this.schema_change("CREATE TABLE tblFundamentalUnit (fldFundamentalUnitID INT PRIMARY KEY AUTO_INCREMENT, fldFundamentalUnitFundamentalID INT, fldFundamentalUnitType INT, fldFundamentalUnitName VARCHAR(255), fldFundamentalUnitBalanceID INT);");
				this._UpdateVersionNumber("1.0.4");
				this.EndTransaction();
			} catch (Exception ex) {
				this.RollBackTransaction();
				Logger.getLogger(h2db.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if (this.GetVersion().equals("1.0.4")) {
			try {
				this.BeginTransaction();
				this.schema_change("CREATE TABLE tblCompany (fldCompanyID INT PRIMARY KEY AUTO_INCREMENT, fldCompanyUnitID INT, fldCompanyFundamentalID INT)");
				this._UpdateVersionNumber("1.0.5");
				this.EndTransaction();
			} catch (Exception ex) {
				this.RollBackTransaction();
				Logger.getLogger(h2db.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if (this.GetVersion().equals("1.0.5")) {
			try {
				this.BeginTransaction();
				this.schema_change("CREATE TABLE tblAccount (fldAccountID INT PRIMARY KEY AUTO_INCREMENT, fldAccountBalanceID INT)");
				this._UpdateVersionNumber("1.0.6");
				this.EndTransaction();
			} catch (Exception ex) {
				this.RollBackTransaction();
				Logger.getLogger(h2db.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}
