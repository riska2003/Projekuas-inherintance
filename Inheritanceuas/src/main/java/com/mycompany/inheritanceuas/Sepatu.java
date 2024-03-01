/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceuas;

/**
 *
 * @author Acer
 */

    
public class Sepatu {
    private String merek;
    private String warna;

    public Sepatu(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public void info() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
    }
}
