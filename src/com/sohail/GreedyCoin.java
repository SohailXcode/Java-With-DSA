package com.sohail;

public class GreedyCoin {
	public static void main(String[] args) {
		int amount = 68;
		int coins[]= {50,20,10,5,2,1};
		System.out.println("Coins Used :");
		
		for(int coin : coins) {
			while(amount >= coin) {
				System.out.println(coin);
				amount = amount - coin;
			}
		}
	}

}
