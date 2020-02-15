package org.fasttrackit.curs11.homework.Ex1;

import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("mar");
        basket.add("banana");
        basket.add("portocala");
        basket.add("banana");

        if (basket.find("banana")){
            System.out.println("Am gasit fruct");
        } else {
            System.out.println("Nu am gasit fruct");
        }

        System.out.println(basket.position("portocala"));

        Set<String> uniqueFruits = (Set<String>) basket.distinct();
        Iterator itr = uniqueFruits.iterator();  //iteratorul parcurge o colectie (Set)

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Cosul continte: " + basket.count() + " fructe");
    }
}
