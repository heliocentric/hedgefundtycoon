/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

import com.github.heliocentric.hedgefundtycoon1.dbi.Database;
import com.github.heliocentric.hedgefundtycoon1.dbi.h2db;
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
	private Database db;

	public void Load() {
	}

	public void Save() {
	}

	public Economy() {
	}

	public void New() {
		this._savefile = System.getProperty("user.dir") + File.separator + "autosave.econ";
		this.db = new h2db();
	}

	public String getSaveFile() {
		return this._savefile;
	}

	public void EndTurn() {
	}

	public String getVersion() {
		return this.db.GetVersion();
	}

	private void _create_schema() {
		/*
		 * Creates the version 1.0.1 schema if the schema was not found in the economy file
		 * Note
		 */
	}
}
