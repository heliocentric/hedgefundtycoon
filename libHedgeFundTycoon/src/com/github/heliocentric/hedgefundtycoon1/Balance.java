/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

import com.github.heliocentric.hedgefundtycoon1.dbi.Database;
import com.github.heliocentric.hedgefundtycoon1.dbi.IThinObject;
import com.github.heliocentric.hedgefundtycoon1.dbi.ThinObject;
import java.math.BigDecimal;

/**
 *
 * @author Helio
 */
public class Balance extends ThinObject {
	public Unit Unit;
	public BigDecimal Amount;
}
