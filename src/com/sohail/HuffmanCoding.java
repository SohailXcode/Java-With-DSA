package com.sohail;

import java.util.HashMap;


public class HuffmanCoding {

    public static void main(String[] args) {

        String text = "BANANA";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println("Character Frequencies:");

        for (char ch : map.keySet()) {
            System.out.println(ch + " : " + map.get(ch));
        }
    }
}