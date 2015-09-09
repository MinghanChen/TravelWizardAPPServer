package model;

import java.io.Serializable;

public class SceneIDCountCombo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4483356607877507384L;
	private int sceneID;
	private int count;
	
	public SceneIDCountCombo(int sceneID, int count) {
		this.sceneID = sceneID;
		this.count = count;
	}
	
	public int getSceneID() {
		return sceneID;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setSceneID(int id) {
		sceneID = id;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
}
