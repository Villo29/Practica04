package com.david.practica04;

import com.david.practica04.models.Persona;

import java.util.Scanner;

public class Main {
    private static Persona[] ListaPersonas = new Persona[5];
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        byte opcion;
        do {
            System.out.println("UNIVERSIDAD POLITECNICA DE CHIAPAS ");
            System.out.println("1. Agregar Persona ");
            System.out.println("2. Agregar Vehiculo");
            System.out.println("3. Imprimir registro");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion: ");
            opcion=teclado.nextByte();
            switch (opcion){
                case 1: addPersona();break;
                case 2: addVehiculo(); break;
                case 3: imprimirPersonas(); break;
            }
        }while (opcion <4);
    }
    public static void addPersona(){
        short id;
        String nombre;
        String rol;
        byte numeroVehiculos;
        Persona persona;
        //capturardatos
        System.out.println("Ingresa el ID: ");
        id = teclado.nextShort();
        teclado.nextLine();
        System.out.println("Ingresa el Nombre: ");
        nombre= teclado.nextLine();
        System.out.println("Ingresa el rol: ");
        rol= teclado.nextLine();
        System.out.println("Vehiculos a registrar: ");
        numeroVehiculos= teclado.nextByte();
        //almacenar dato
        persona= new Persona(numeroVehiculos);
        persona.setId(id);
        persona.setNombre(nombre);
        persona.setRol(rol);
        System.out.println("valor de persona"+ persona);
        byte indice = 0;
        while (ListaPersonas[indice]!= null )
            indice ++;
        ListaPersonas[indice]=persona;

    }
    public static void addVehiculo(){}
    public static void imprimirPersonas(){}
}