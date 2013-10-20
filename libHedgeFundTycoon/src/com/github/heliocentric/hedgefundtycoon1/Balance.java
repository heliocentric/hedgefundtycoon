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
public class Balance implements ThinObject {
	public Unit Unit;
	public BigDecimal Amount;

	@Override
	public void setDB(Database DB) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Database getDB() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
