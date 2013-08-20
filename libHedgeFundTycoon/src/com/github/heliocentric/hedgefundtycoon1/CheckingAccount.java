/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

/**
 *
 * @author Helio
 */
public class CheckingAccount implements Account {
	private Integer Balance;
	@Override
	public Integer getValue(Currency currency) {
		return this.Balance;
	}

	@Override
	public Integer AddFunds(Integer Value) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Integer RemoveFunds(Integer Value) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	private boolean locked = false;
	@Override
	public boolean getLock() {
		if (this.locked = false) {
			this.locked = true;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean releaseLock() {
		if (this.locked = true) {
			this.locked = false;
			return true;
		} else {
			return false;
		}
	}
	
}
