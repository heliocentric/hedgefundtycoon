/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

import com.github.heliocentric.hedgefundtycoon1.dbi.Database;
import com.github.heliocentric.hedgefundtycoon1.dbi.ThinObject;
import java.math.BigDecimal;

/**
 *
 * @author Helio
 */
public interface Unit extends ThinObject {
	@Override
	public void setDB(Database db);
	@Override
	public Database getDB();
	@Override
	public String getUUID();
	public void setSymbol(String symbol);

	public String getSymbol();

	public void setName(String name);

	public String getName();

	public BigDecimal ConversionFactor();

	public BigDecimal Value(Unit Currency);

	public BigDecimal Convert(Balance balance);
}
