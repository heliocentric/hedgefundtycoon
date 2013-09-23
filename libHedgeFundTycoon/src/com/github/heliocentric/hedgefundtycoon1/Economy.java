/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.heliocentric.hedgefundtycoon1;

import java.io.File;

/**
 *
 * @author Owner
 */
public class Economy {
    private String _savefile;
    public void Load() {
    }
    public void Save() {
    }
    public Economy() {
        this.New();
    }
    public void New() {
        this._savefile = System.getProperty("user.dir") + File.separator + "autosave.econ";
    }
    public String getSaveFile() {
        return this._savefile;
    }
    public void EndTurn() {
    }
}
