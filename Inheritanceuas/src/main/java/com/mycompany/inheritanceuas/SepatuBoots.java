/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceuas;

/**
 *
 * @author Acer
 */
public class SepatuBoots extends Sepatu {
    private int ukuran;

    public SepatuBoots(String merek, String warna, int ukuran) {
        super(merek, warna);
        this.ukuran = ukuran;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ukuran: " + ukuran);
    }
}

