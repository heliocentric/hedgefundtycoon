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
public interface Unit {
	public void setSymbol(String symbol);
	public String getSymbol();
	public void setName(String name);
	public String getName();
	public BigDecimal Convert(Balance balance);
}
