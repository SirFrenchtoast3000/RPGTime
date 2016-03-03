package com.rpg.text.NPC;
import com.rpg.text.*;
public class Monster {
	int lvl;
	private int health = 100;
	private int spd;
	int einv[] = new int[20];
	String type;
	Object idrop[];
	private BoxTyping box = new BoxTyping();
	public void Monster(int lvl)	{
		this.lvl = lvl;
	}
	public void defeat()	{
		System.out.println(type + "has been defeated!");
		//gdrop = gloot;
		//System.arraycopy(idrop, einv);
	}
	
}
