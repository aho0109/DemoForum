package com.joyfulgarden.util;

public class Meeting {

	public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < rows ; i++) {      
            for(int sp = (rows-1); sp > i; sp--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
}
