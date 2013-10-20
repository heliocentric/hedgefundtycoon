/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1.dbi;

/**
 *
 * @author Owner
 */
public interface Database {

	public ThinObject GetObject(String Type, String ID);
	public ThinObject NewObject(String Type);
	public void Open(String path);

	public Version GetVersion();

	public void CreateSchema();

	public void UpdateSchema();

	public void BeginTransaction();

	public void EndTransaction();

	public void RollBackTransaction();
}
