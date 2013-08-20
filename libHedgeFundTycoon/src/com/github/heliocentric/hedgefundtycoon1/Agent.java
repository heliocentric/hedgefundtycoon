/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

/**
 *
 * @author Helio
 */
public interface Agent {
	/*
	 * Returns true if there were no errors on the turn. 
	 * Note, we don't check if agents 'play nice' and 
	 * only do one operation per turn. We probably should.
	 * 
	 * If any agent returns false, that means there is a 
	 * serious problem, and the program should crash.
	 * 
	 */
	public boolean PlayTurn();
}
