/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

import com.github.heliocentric.hedgefundtycoon1.algorithm.FreeAlgorithm;
import com.github.heliocentric.hedgefundtycoon1.algorithm.IAlgorithm;
import com.github.heliocentric.hedgefundtycoon1.dbi.Database;
import com.github.heliocentric.hedgefundtycoon1.dbi.h2db;
import java.io.File;

/**
 *
 * @author Owner
 */
public class Economy {

	private String _savefile;
	private Database db;
	private IAlgorithm algorithm;
	public void Load(String File) {
		this._savefile = File;
		this.db = new h2db(this._savefile);
	}

	public void Save() {
	}

	public Economy() {
	}
	public void New() {
		this.algorithm = new FreeAlgorithm();
		this.Load(System.getProperty("user.dir") + File.separator + "autosave.econ");
	}

	public String getSaveFile() {
		return this._savefile;
	}

	public void EndTurn() {
	}

	public String getVersion() {
		return this.db.GetVersion();
	}

	private void _update_schema() {
		
	}
}
