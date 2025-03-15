/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.par.impar;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author brsan
 */
public class ParImpar {

    public static void main(String[] args) {
        Scanner num=new Scanner (system.in);
        int numero;
        system.out.println("Ingrese Numero");
        numero=num.nextInt();
        if (numero%2==0){
            system.out.println("El Numero es Par");
        }else
            system.out.println("El Numero es impar");
        }
    }

