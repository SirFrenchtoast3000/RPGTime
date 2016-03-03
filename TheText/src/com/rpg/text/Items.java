package com.rpg.text;

public class Items {
	Object inv[];
	Object weapons[] = new Object[100];
	Object armor[] = new Object[100];
	Object potion[] = new Object[10];
	int gold = 100;
	public int dropGold(int type, int lvl)	{
		int drop = 0;
		if(type == 1)	{
			drop += 50;
		}
		return drop;
	}
	public Object getItem(int itemType,int invRef)	{
		if(itemType == 1)
			return weapons[invRef];
		else if(itemType == 2)
			return armor[invRef];
		else if(itemType == 3)
			return potion[invRef];
		else
			return null;
		
	}
}
