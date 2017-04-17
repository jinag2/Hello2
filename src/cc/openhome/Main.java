/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

import cc.openhome.util.Console;
import java.util.Arrays;
//import java.util.Scanner;
//import cc.openhome.Clothes;

/**
 *
 * @author Albert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Clothes[] c1 = {
			new Clothes("red", 'L'),
			new Clothes("blue", 'M')
		};

		Clothes[] c2 = Arrays.copyOf(c1, c1.length);

	//	Clothes[] c2 = new Clothes[c1.length];
	//	System.arraycopy(c1, 0, c2, 0, c1.length);
	
//	for (int i = 0; i < c1.length; i++) {
	//		c2[i] = new Clothes(c1[i].color, c1[i].size);
	//	}
	
		Console.writeLine("c1 >>");
		for (Clothes c : c1) {
			c.print();
		}
		Console.writeLine("");

		Console.writeLine("c2 >>");
		for (Clothes c : c2) {
			c.print();
		}
		Console.writeLine("");
		
		c2[0].color = "yellow";
		Console.writeLine("c1 >>");
		for (Clothes c : c1) {
			c.print();
		}
		Console.writeLine("");

		Console.writeLine("c2 >>");
		for (Clothes c : c2) {
			c.print();
		}
		Console.writeLine("");
	
		
		/*	Scanner console = new Scanner(System.in);
		int number = (int)(Math.random() * 10);
		int guess;
		Double dd = 1.0;
		Double ee = 0.8;
		Double ff = dd - ee;
		Double gg = 0.2;
		Double kk = Math.abs(ff - gg);
		Double hh = Double.MIN_NORMAL;
		if (Math.abs(ff - gg) <= 5.551115123125783E-17) {
		System.out.println("is 0.2");
		}
		else {
		System.out.println("Not 0.2");
		}*//*	do {
		System.out.println(" Guess (0 ~ 9): ");
		guess = console.nextInt();
		} while (guess != number);
		System.out.println("BIGO!");*//*	int x = 12345678;
		int y = 1234_5678;
		float f = (float)3.14;
		System.out.println("Hello World");
		System.out.println("\u6E2C\u8A66\u6D4B\u8BD5");*/
    }
    
}
