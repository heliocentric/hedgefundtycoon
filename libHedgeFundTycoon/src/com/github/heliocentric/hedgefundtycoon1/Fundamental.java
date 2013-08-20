/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

/**
 *
 * @author Helio
 */
public class Fundamental {
	private Unit _currency;
	public Unit getCurrency() {
		return this._currency;
	}
	public void setCurrency(Unit unit) {
		this._currency = unit;
	}
	private Integer _shares;
	public void setShares(Integer shares) {
		this._shares = shares;
	}
	public Integer getShares() {
		return this._shares;
	}
	public Fundamental Copy() {
		return new Fundamental();
	}
}
