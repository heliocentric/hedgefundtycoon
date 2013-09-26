/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

/**
 *
 * @author Helio
 */
public class Fund {

	private char _karma;
	private char _rating;

	public Fund() {
		this._karma = 128;
		this._rating = 91;
	}

	public String Karma() {
		String retval;
		if (this._rating >= 192) {
			retval = "Good";
		} else if (this._rating >= 64) {
			retval = "Neutral";
		} else {
			retval = "Bad";
		}
		return retval;
	}

	public String Rating() {
		String retval;
		if (this._rating >= 101) {
			retval = "Strong Buy";
		} else if (this._rating >= 81) {
			retval = "Buy";
		} else if (this._rating >= 41) {
			retval = "Hold";
		} else if (this._rating >= 21) {
			retval = "Sell";
		} else if (this._rating >= 1) {
			retval = "Strong Sell";
		} else {
			retval = "Bankrupt";
		}
		return retval;
	}

	public String GoodKarma(char value) {
		this._karma = (char) (this._karma + value);
		return this.Karma();
	}

	public String BadKarma(char value) {
		this._karma = (char) (this._karma - value);
		return this.Karma();
	}
}
