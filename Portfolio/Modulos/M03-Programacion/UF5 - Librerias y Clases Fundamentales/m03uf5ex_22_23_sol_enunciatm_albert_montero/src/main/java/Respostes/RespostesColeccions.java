/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respostes;

import Enunciat.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author manel
 */
public class RespostesColeccions {

    public static List<Persona> respostaColeccions1(Stack<Persona> elements, Integer n) {
        Stack<Persona> hola = new Stack<Persona>();
        for(int i = 0; i<n; i++){
            Persona p = elements.pop();
            hola.addElement(p);
        }
        return (List)hola;
    }

    public static List<Persona> respostaColeccions4(List<Persona> elements) {

    Collections.sort(elements, (o1, o2) -> o1.getEdat().compareTo(o2.getEdat()));
    return elements;
    }
}
