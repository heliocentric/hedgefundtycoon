/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.dbi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class Version {
	public int Major = 0;
	public int Minor = 0;
	public int Revision = 0;
	public Version() {
	}
	
	public Version(String version) {
		String[] versions = version.split("\\.");
		this.Major = Integer.parseInt(versions[0]);
		this.Minor = Integer.parseInt(versions[1]);
		this.Revision = Integer.parseInt(versions[2]);
	}
	
	public String ToString() {
		return this.Major + "." + this.Minor + "." + this.Revision;
	}
	@Override
	public String toString() {
		return this.ToString();
	}
}
