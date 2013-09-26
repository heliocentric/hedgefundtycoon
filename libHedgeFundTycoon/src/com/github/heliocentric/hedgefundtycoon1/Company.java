/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

/**
 *
 * @author Helio
 */
public class Company implements Agent {

	private Fundamental Current;

	@Override
	public boolean PlayTurn() {
		return true;
	}
}
