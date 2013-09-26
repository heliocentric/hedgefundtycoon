/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

import java.math.BigDecimal;

/**
 *
 * @author Helio
 */
public class Currency implements Unit {

	@Override
	public BigDecimal Convert(Balance balance) {
		return null;
	}
	private String _symbol;

	@Override
	public String getSymbol() {
		return this._symbol;
	}
	private String _name;

	@Override
	public String getName() {
		return this._name;
	}

	@Override
	public void setSymbol(String symbol) {
		this._symbol = symbol;
	}

	@Override
	public void setName(String name) {
		this._name = name;
	}
	private BigDecimal _factor;

	@Override
	public BigDecimal ConversionFactor() {
		return this._factor;
	}

	@Override
	public BigDecimal Value(Unit Currency) {
		BigDecimal targetfactor = Currency.ConversionFactor();
		return this._factor.divide(targetfactor);
	}
}
