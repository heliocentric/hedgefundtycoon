/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

/**
 *
 * @author Helio
 */
public interface Account {
	public Integer getValue(Currency currency);
	public Integer AddFunds(Integer Value);
	public Integer RemoveFunds(Integer Value);
	public boolean getLock();
	public boolean releaseLock();
}
