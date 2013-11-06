/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.dbi;

/**
 *
 * @author Owner
 */
public abstract class ThinObject implements IThinObject {
	public ThinObject(){
		
	}
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
	@Override
	public String getStringValue(String Column) {
		return "";
	}
	@Override
	public void setStringValue(String Column, String Value) {
		
	}
}
