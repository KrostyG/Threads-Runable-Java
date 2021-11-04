package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");

        PrintMe ins1 = PrintMe.crearYComenzar("#1");
        PrintMe ins2 = PrintMe.crearYComenzar("#2");
        PrintMe ins3 = PrintMe.crearYComenzar("#3");

        for (int i = 0; i < 11; i++) {
            System.out.print(".");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exc) {
                System.out.println("Hilo principal interrumpido.");
            }
        }
        System.out.println("Hilo principal finalizado");
    }
}
