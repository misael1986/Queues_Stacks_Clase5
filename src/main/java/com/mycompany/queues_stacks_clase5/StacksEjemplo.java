/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues_stacks_clase5;

import java.util.Stack;

/**
 *
 * @author misael.perilla
 */
public class StacksEjemplo {
    
    public StacksEjemplo(){
    
    
    }
    
    public void Ejemplo(){
    Stack<String> pila1 = new Stack<String>();
        
        pila1.push("Juan");
        pila1.push("Ana");
        pila1.push("Luis");
        pila1.push("Marcela");
        
        System.out.println("Cantidad de elementos en la pila: " + pila1.size());
        System.out.println("Extracion de un elemento de la pila: " + pila1.pop());
        System.out.println("Cantidad de elementos en la pila: " + pila1.size());
        System.out.println("Consulta del primer elemento de la pila sin extraerlo: "
                + pila1.peek());
        System.out.println("Cantidad de elementos en la pila: " + pila1.size());
        System.out.println("Busqueda de un valor en la pila: "+pila1.search("ana"));
        
        
        System.out.println("Extraemos uno a un cada elemento de la pila mientras "
                + "no este vacía:");
        while (!pila1.isEmpty())
            System.out.print(pila1.pop() + "-");
        System.out.println();

        //-----------------------------------------------------------
        
        Stack<Integer> pila2 = new Stack<Integer>();
        pila2.push(70);
        pila2.push(120);
        pila2.push(6);
        System.out.println("Cantidad de elementos en pila 2: " +pila2.size());
        System.out.println("Borramos toda la pila");
        pila2.clear();
        System.out.println("Cantidad de elementos en la pila de enteros:" + pila2.size());
        
    }
    
}
