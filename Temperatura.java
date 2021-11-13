/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.temperatura;

/**
 *
 * @author rafap
 */
public class Temperatura {

    public double converterCelsiusFarenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public double converterCelsiusKelvin(double celsius) {
        return celsius + 273.15;
    }

    public String classificarTemp(double celsius) {
        String classifica = " ";

        if (celsius < 0) {
            classifica = "NEGATIVA";
        } else if (celsius > 0) {
            classifica = "POSITIVA";
        } else {
            classifica = "ZERO";
        }
        return classifica;
    }

}
