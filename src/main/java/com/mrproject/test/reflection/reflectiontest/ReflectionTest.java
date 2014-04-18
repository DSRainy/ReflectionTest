/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrproject.test.reflection.reflectiontest;

import java.lang.reflect.*;
import java.util.*;

/**
 *
 * @author Rain
 */
public class ReflectionTest {

    public static void main(String[] args) {
        
        String name;
        
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name : ");
            name = in.next();
        }
        
        try
        {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            
            if(modifiers.length() > 0)
            {
                System.out.print(modifiers + " "); 
            }
            System.out.print("class " + name);
            if(supercl != null && supercl != Object.class)
            {
                System.out.print(" extends " + supercl.getName());
            }
            
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println("\n{\n");
            printField(cl);
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void printConstructors(Class cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void printMethods(Class cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void printField(Class cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
