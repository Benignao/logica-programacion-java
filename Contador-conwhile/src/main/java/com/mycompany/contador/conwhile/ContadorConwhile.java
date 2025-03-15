/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contador.conwhile;

/**
 *
 * @author brsan
 */
public class ContadorConwhile {

    public static void main(String[] args) {
        int cantidad =10;
        int acumulador = 0;
        int contador = 0;
        while(contador<10)
        {
            acumulador= acumulador + 5;
        }
        double promedio = acumulador / cantidad;
        System.out.println(promedio);
    }
}
