/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues_stacks_clase5;

import java.util.LinkedList;

/**
 *
 * @author misael.perilla
 */
public class LinkedListEjemplo {

    public LinkedListEjemplo() {

    }

    public void Ejemplo() {
        LinkedList<String> lista1 = new LinkedList<String>();
        
        lista1.add("Juan");
        lista1.add("Luisa");
        lista1.add("Carlos");
        imprimir(lista1);
        lista1.add(1, "Ana");
        imprimir(lista1);
        lista1.remove(0);
        imprimir(lista1);
        lista1.remove("Carlos");
        imprimir(lista1);
        
        
        System.out.println("Cantidad de elementos en la lista:" + lista1.size());
        if (lista1.contains("Ana")) {
            System.out.println("El nombre 'Ana' si esta almacenado en la lista");
        } else {
            System.out.println("El nombre 'Ana' no esta almacenado en la lista");
        }
        System.out.println("El segundo elemento de la lista es:" + lista1.get(1));
        lista1.clear();
        
        if (lista1.isEmpty()) {
            System.out.println("La lista se encuentra vacía");
        }
    }

    public static void imprimir(LinkedList<String> lista) {
        for (String elemento : lista) {
            System.out.print(elemento + "-");
        }
        System.out.println();
    }

}
