package org.ht.TPMaven;

import java.util.Random;

import main.util;

public class ImpUtil implements util  {
	
	int a=1;
	
	public double prod(double x, double y) {
		return x*y;
	}

	public double div(double x, double y) { 
		if(y==0)
			throw new IllegalArgumentException(" Zero devide ");
		else
		return x/y;
	}

	public double add(double x, double y) {
		return x+y;
	}

	public double soustr(double x, double y) {
		return x-y;
	}

	
	public int PGCD(int a, int b) {
		while(a != b) {
			if(a < b)
				b = b - a;
			else
				a = a -b;
			} 
			return a;
	}

	public int Fact(int a) {
		if(a<0)
			throw new IllegalArgumentException(" Negative number for factoriel");
		else if (a==0) return(1);
		else return (a*Fact(a-1));
	}

	
	public String bin(int a) {
		return Integer.toBinaryString(a);
	}
	
	
	public boolean estPair(int a) {
		if( a%2 == 0 )
			return true;
		else
			return false;
	}

	public int incrementInt() {
		return a++;
	}
	
	public String Reverse(String input) {
    	
    	String rev = "";
    	for(int i = input.length()-1; i>=0 ; i--) 
    		{rev = rev + input.charAt(i);}
    	return rev ;
    }
	
	public boolean isPalindrome(String word) {
    	if (word == null) {
    		throw new IllegalArgumentException("input string should no be null");
    	}
    	if (word.equals(Reverse(word))) {return true;}
    	else 
    		return false;
    }
	
	public int[] randomTab(final int size) {
		int[] tab = new int[size];
		//Random r = new Random().nextIn();
		for (int i = 0; i< tab.length; i++) {
			tab[i] = new Random().nextInt();
		}
		return tab;
	}
	
	

}
