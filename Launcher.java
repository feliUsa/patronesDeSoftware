package model;

import java.util.Random;

import model.productions.*;
import model.productions.DC.*;
import model.productions.Marvel.*;


public class Launcher {

	public static void main(String[] args) {
		
		Cine c = null;
		
		Random r = new Random();
		
		int num = r.nextInt(4);
		
		if(num < 2) {
			c = new Marvel();
		}else {
			c = new DC();
		}
		
		Villano v = c.getVillano();
		Heroe h = c.getHeroe();
		
		System.out.println("Frase Villano:\n"+v.darFrase());
		System.out.println("\nFrase Heroe:\n"+h.darFrase());
		
	}
	
}
