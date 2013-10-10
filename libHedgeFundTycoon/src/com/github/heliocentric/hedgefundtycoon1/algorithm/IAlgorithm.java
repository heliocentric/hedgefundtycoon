/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.algorithm;

/**
 *
 * @author Owner
 */
public interface IAlgorithm {
	public void setType(IAlgorithm.GameType type);
	public enum GameType {
		Easy,
		Simulation,
		Hardcore
	}
}
