package com.rpg.text.fight;
import java.util.Scanner;

import com.rpg.text.BoxTyping;

public class Battle {
	private BoxTyping boxbat = new BoxTyping();
	private int atk = boxbat.atk;
	private int hp = boxbat.hp;
	private int eatk = boxbat.eatk;
	private int speed = boxbat.speed;
	public int enemyhp = boxbat.enemyhp;
	private int espd = boxbat.espd;
	public boolean battling = false;
	private int turn = boxbat.turn;
	public Battle()	{
		this.atk = boxbat.atk;
		this.hp = boxbat.hp;
		this.eatk = boxbat.eatk;
		this.speed = boxbat.speed;
		this.enemyhp = boxbat.enemyhp;
		this.espd = boxbat.espd;
	}
	public void BattleTime(Scanner scan) {
		//Array is for future use when there are more input options
		String inputs[] = new String[100];	
		inputs[0] = "attack";
		inputs[1] = "Fire ball";
		if(inputs[0].equalsIgnoreCase(scan.nextLine())){
			Attack(atk,speed,enemyhp);
			battling = true;
		}
		if(inputs[1].equalsIgnoreCase(scan.nextLine()))	{
			FireBall(10,this.hp,this.enemyhp);
		}
	}
	public void Attack(int damage, int spd, int ehp)	{
		double chance = boxbat.chnce;
		double chance1 = boxbat.chnce1;
		if(damage == atk)	{ //Make sure the damage is for the enemy and not player otherwise else -->
			
		
		if (speed*chance<espd*chance1)	{
			ehp-=atk;
			System.out.println("Dealt " + boxbat.atk + " damage.");
			this.enemyhp = ehp;
		}
		else 
			System.out.println("Attack missed!");
		
		}
		else	{ //Same thing as above except for enemy turn
			if (espd*chance>speed*chance1)	{
				//TODO: Fix this piece of shit if statement.
				//boxbat.hp-=boxbat.eatk;
				ehp -= boxbat.eatk;
				boxbat.hp = ehp;
				System.out.println("Dealt " + boxbat.atk + " damage.");
				System.out.println("Enemy attacks!\nEnemy dealt: " + boxbat.eatk + " damage!");
			}
			else 
				System.out.println("Attack missed!");
		}
		
		
	}
	public int FireBall(int damage, int hp, int ehp)	{
		for(int i = this.turn;i < 3; i++)
			ehp -= damage;
		return ehp;
	}
	
}
