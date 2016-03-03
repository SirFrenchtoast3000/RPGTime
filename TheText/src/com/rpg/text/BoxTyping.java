package com.rpg.text;
import javax.swing.*;
import javax.swing.event.*;

import com.rpg.text.NPC.Monster;
import com.rpg.text.fight.Battle;

import java.awt.color.*;
import java.util.Scanner;
public class BoxTyping	{
	public int atk = 50;
	public int hp = 100;
	public int eatk = 50;
	public int speed = 5;
	public int enemyhp = 100;
	public int espd = 500;
	public boolean hit;
	public boolean running = false;
	public double chnce = Math.pow(Math.random(), 100);
	public double chnce1 = Math.pow(Math.random(), 100);
	 public int turn = 0;
	public BoxTyping()	{
		
	}
	public void start()	{
		running = true;
	}
	public void stop()	{
		running = false;
	}
	public static void main(String[] args) {
		Monster mon = new Monster();
		BoxTyping box = new BoxTyping();
		Battle bat = new Battle();
		Scanner scan = new Scanner(System.in);
		do	{
		System.out.println("What do you wish to do?");
		bat.BattleTime(scan);
		box.enemyhp = bat.enemyhp;
		System.out.println("Your enemy has " + box.enemyhp + " HP left");
		System.out.println("Enemy's turn: ");
		bat.Attack(box.eatk,box.espd,box.hp);
		System.out.println("Your HP: " + box.hp);
		if(box.enemyhp<= 0 || box.hp <= 0){
			mon.defeat();
			break;
		}
		box.turn ++;
		} while(bat.battling = true);
		//System.out.println("Enemy attacks!\nEnemy dealt: " + box.eatk + " damage!\nYour HP: " + box.hp);
	}

	
	
}