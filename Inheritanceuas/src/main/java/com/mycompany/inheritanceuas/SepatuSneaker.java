/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceuas;

/**
 *
 * @author Acer
 */
public class SepatuSneaker extends Sepatu {
    private String model;

    public SepatuSneaker(String merek, String warna, String model) {
        super(merek, warna);
        this.model = model;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Model: " + model);
    }
}
