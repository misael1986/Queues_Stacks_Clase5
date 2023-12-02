/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues_stacks_clase5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author misael.perilla
 */
public class SetEjemplos {

    public SetEjemplos() {

    }

    public void Ejemplo() {
        Set<Integer> conjunto1 = new HashSet<Integer>();
        conjunto1.add(20);
        conjunto1.add(10);
        conjunto1.add(1);
        conjunto1.add(5);
        // El valor 20 no se insertará en el conjunto ya que se encuentra repetido
        conjunto1.add(30);
        conjunto1.add(33);
        // La impresión no asegura un orden específico
        for (int elemento : conjunto1) {
            System.out.print(elemento + " - ");
        }
        System.out.println();

        Set<Integer> conjunto2 = new TreeSet<Integer>();
        conjunto2.add(20);
        conjunto2.add(10);
        conjunto2.add(1);
        conjunto2.add(5);
        // El valor 20 no se insertará en el conjunto ya que se encuentra repetido
        conjunto2.add(30);
        conjunto2.add(33);
        // Los elementos se muestran de menor a mayor
        for (int elemento : conjunto2) {
            System.out.print(elemento + " - ");
        }
        System.out.println();

        Set<Integer> conjunto3 = new LinkedHashSet<Integer>();
        conjunto3.add(20);
        conjunto3.add(10);
        conjunto3.add(1);
        conjunto3.add(5);
        // El valor 20 no se insertará en el conjunto ya que se encuentra repetido
        conjunto3.add(30);
        conjunto3.add(33);
        // Los elementos se muestran en el orden que se insertaron
        for (int elemento : conjunto3) {
            System.out.print(elemento + " - ");
        }
        System.out.println();
    }

}
