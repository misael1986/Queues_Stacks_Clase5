/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queues_stacks_clase5;

import java.util.PriorityQueue;

/**
 *
 * @author misael.perilla
 */
public class PriorityQueueEjemplo {
    
    public PriorityQueueEjemplo(){
        
    }
    
    public void Ejemplo(){
        PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();
        cola1.add(70);
        cola1.add(120);
        cola1.add(20);
        cola1.add(6);
        cola1.add(12);
        
        System.out.println("Imprimimos la cola con prioridades de enteros");
        while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");
    
    }
    
}
