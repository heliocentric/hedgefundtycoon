/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.algorithm;

/**
 *
 * @author Owner
 */
public class FreeAlgorithm implements IAlgorithm {
	public FreeAlgorithm() {
		this.Constructor(IAlgorithm.GameType.Easy);
	}
	public FreeAlgorithm(IAlgorithm.GameType type) {
		this.Constructor(type);
	}
	public void Constructor(IAlgorithm.GameType type) {
		this.setType(type);
	}
	@Override
	public void setType(IAlgorithm.GameType Type) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
