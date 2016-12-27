/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cw3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dominik
 */
public class Cw3 {
    long start, stop;
    
    public void stworz(List list) {
        for (int i=0; i<100; i++) {
            list.add(i);
        }
    }
    
    public void progr() {
        List ArrayList = new ArrayList();
        List LinkedList = new LinkedList();

        stworz(ArrayList);
        stworz(LinkedList);
        
        System.out.println("(Czasy podane i stworzone przez System.nanoTime)");
        System.out.println();

        System.out.println("Wstawianie:");        
        System.out.println("- na początek dla ArrayList - " + wstawpocz(ArrayList));
        System.out.println("- na początek dla LinkedList - " + wstawpocz(LinkedList));
        System.out.println("- w środek dla ArrayList - " + wstawsrod(ArrayList));
        System.out.println("- w środek dla LinkedList - " + wstawsrod(LinkedList));
        System.out.println("- na koniec dla ArrayList - " + wstawkon(ArrayList));
        System.out.println("- na koniec dla LinkedList - " + wstawkon(LinkedList));
        System.out.println();

        System.out.println("Usuwanie:");
        System.out.println("- z początku dla ArrayList - " + usunpocz(ArrayList));
        System.out.println("- z początku dla LinkedList - " + usunpocz(LinkedList));
        System.out.println("- z środka dla ArrayList - " + usunsrod(ArrayList));
        System.out.println("- z środka dla LinkedList - " + usunsrod(LinkedList));
        System.out.println("- z końca dla ArrayList - " + usunkon(ArrayList));
        System.out.println("- z końca dla LinkedList - " + usunkon(LinkedList));       
        System.out.println();

        System.out.println("Pobieranie:");
        System.out.println("- z początku dla ArrayList - " + dajpocz(ArrayList));
        System.out.println("- z początku dla LinkedList - " + dajpocz(LinkedList));
        System.out.println("- z środka dla ArrayList - " + dajsrod(ArrayList));
        System.out.println("- z środka dla LinkedList - " + dajsrod(LinkedList));
        System.out.println("- z końca dla ArrayList - " + dajkon(ArrayList));
        System.out.println("- z końca dla LinkedList - " + dajkon(LinkedList));
        
        
    }

    

    public long wstawpocz(List list) {
        start = System.nanoTime();
        list.add(0, 100);
        stop = System.nanoTime();
        return stop - start;
    }
    
    public long wstawsrod(List list) {
        start = System.nanoTime();
        list.add(50, 101);
        stop = System.nanoTime();
        return stop - start;
    }
    
    public long wstawkon(List list) {
        start = System.nanoTime();
        list.add(102);
        stop = System.nanoTime();
        return stop - start;
    }
    

    public long usunpocz(List list) {
        start = System.nanoTime();
        list.remove(0);
        stop = System.nanoTime();
        return stop - start;
    }

    public long usunsrod(List list) {
        start = System.nanoTime();
        list.remove(50);
        stop = System.nanoTime();
        return stop - start;
    }
    
    public long usunkon(List list) {
        start = System.nanoTime();
        list.remove(100);
        stop = System.nanoTime();
        return stop - start;
    }
    

    

    public long dajpocz(List list) {
        start = System.nanoTime();
        list.get(0);
        stop = System.nanoTime();
        return stop - start;
    }

    public long dajsrod(List list) {
        start = System.nanoTime();
        list.remove(50);
        stop = System.nanoTime();
        return stop - start;
    }
    
    public long dajkon(List list) {
        start = System.nanoTime();
        list.get(98);
        stop = System.nanoTime();
        return stop - start;
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cw3 p = new Cw3();
        p.progr();
    }

}