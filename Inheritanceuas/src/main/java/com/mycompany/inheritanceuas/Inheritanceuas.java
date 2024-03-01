/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritanceuas;

/**
 *
 * @author Acer
 */
public class Inheritanceuas {
public static void main(String[] args) {
        SepatuSneaker sneaker = new SepatuSneaker("Nike", "Hitam", "Air Max");
        SepatuBoots boots = new SepatuBoots("Dr. Martens", "Coklat", 42);

        System.out.println("Sepatu Sneakers:");
        sneaker.info();

        System.out.println("\nSepatu Boots:");
        boots.info();
    }
}

