/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.dbi;

/**
 *
 * @author Owner
 */
public interface ThinObject {
	public void setDB(Database DB);
	public Database getDB();
	public String getUUID();
	public void setUUID(String UUID);
}
