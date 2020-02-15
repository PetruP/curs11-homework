package org.fasttrackit.curs11.homework.Ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Basket {
    private ArrayList<String> fruits;
    public Basket(){
        this.fruits = new ArrayList<String>();
    }
    public void add(String fruit){
        this.fruits.add(fruit);
    }
    public boolean remove(String fruit){
       return this.fruits.remove(fruit);
    }
    public int position(String fruit){
        return fruits.indexOf(fruit);  //returneaza pozitia fructului in lista de fructe
    }
    public Collection<String> distinct(){
        Set<String> uniqueFruits = new HashSet<String>(fruits);
        return uniqueFruits;
    }
    public boolean find(String fruit){
        return this.fruits.contains(fruit);
    }
    public int count(){
        return this.fruits.size();
    }
    public int customCount(){
        int i = 0;
        for (String fruit : fruits){
            i++;
        }
        return i;
    }
}
