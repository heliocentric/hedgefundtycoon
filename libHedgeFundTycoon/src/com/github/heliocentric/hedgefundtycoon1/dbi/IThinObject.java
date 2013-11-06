/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.dbi;

/*
 *
 * @author Owner
 */
public interface IThinObject {
	public void setDB(Database DB);
	public Database getDB();
	public String getUUID();
	public void setUUID(String UUID);
	public String getStringValue(String Column);
	public void setStringValue(String Column, String Value);
}
