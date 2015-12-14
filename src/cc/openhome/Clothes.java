/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

/**
 *
 * @author Albert
 */
public class Clothes {
    String color;
	char size;
	Clothes(String color, char size) {
		this.color = color;
		this.size = size;
	}
	
	void print() {
		System.out.printf("color: %s, size: %c%n", color, size);
	}
}
