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
	
	}
	@Override
	public Database getDB() {
		return this.DB;
	}
}
