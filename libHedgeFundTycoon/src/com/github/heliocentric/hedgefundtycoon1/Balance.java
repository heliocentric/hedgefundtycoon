/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

import com.github.heliocentric.hedgefundtycoon1.dbi.Database;
import com.github.heliocentric.hedgefundtycoon1.dbi.IThinObject;
import java.math.BigDecimal;

/**
 *
 * @author Helio
 */
public class Balance implements IThinObject {
	public Unit Unit;
	public BigDecimal Amount;
	private Database DB;
	@Override
	public void setDB(Database DB) {
		this.DB = DB;
	}

	@Override
	public Database getDB() {
		return this.DB;
	}
	
	private String UUID;
	@Override
	public String getUUID() {
		return this.UUID;
	}

	@Override
	public void setUUID(String UUID) {
		this.UUID = UUID;
	}
}
