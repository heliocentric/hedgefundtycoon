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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	private String _name;
	@Override
	public String getName() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setSymbol(String symbol) {
		this._symbol = symbol;
	}

	@Override
	public void setName(String name) {
		this._name = name;
	}
	
}
