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
	
	
	private Integer _sharesavailable;
	public void setSharesAvailable(Integer shares) {
		this._sharesavailable = shares;
	}
	public Integer getSharesAvailable() {
		return this._sharesavailable;
	}
	
	
	private Integer _sharesallocated;
	public void setSharesAllocated(Integer shares) {
		this._sharesallocated = shares;
	}
	public Integer getSharesAllocated() {
		return this._sharesallocated;
	}
	
	
	public void Income(String Name, BigDecimal value) {
		
	}
	public void Expense(String Name, BigDecimal value) {
		
	}
	public Balance getAsset(String Name) {
		return null;
		
	}
	
	
	public void IncurLiability(String Name, BigDecimal value, String AssetToTransferTo) {
		
	}
	public void DecreaseLiability(String Name, BigDecimal value, String AssetToTransferFrom) {
		
	}
	public Balance getLiability(String Name) {
		return null;
	}
	
	public Fundamental Copy() {
		return new Fundamental();
	}
}
