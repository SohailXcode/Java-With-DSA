package com.sohail;

class Item {
	int weight;
	int value;

	Item(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
}

public class FractionalKnapsack {

	public static void main(String[] args) {

		Item items[] = { new Item(10, 600), new Item(20, 500), new Item(30, 400) };

		int capacity = 50;

		double totalValue = 0;

		for (Item item : items) {

			if (capacity >= item.weight) {

				totalValue += item.value;

				capacity -= item.weight;

			} else {

				totalValue += ((double) item.value / item.weight) * capacity;

				break;
			}
		}

		System.out.println("Maximum Value = " + totalValue);
	}
}