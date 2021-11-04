package com.company;

public class PrintMe implements Runnable{
    Thread hilo;

    PrintMe(String nombre){
        hilo=new Thread(this,nombre);
    }
    public static PrintMe crearYComenzar (String nombre){
        PrintMe miHilo=new PrintMe(nombre);
        miHilo.hilo.start(); //Inicia el hilo
        return miHilo;
    }

    @Override
    public void run() {
        System.out.println(hilo.getName()+" iniciando.");
        try {
            for (int i=0; i<11;i++){
                Thread.sleep(2562);
                System.out.println("En "+hilo.getName()+ ", el recuento es "+i);
            }
        }catch (InterruptedException exc){
            System.out.println(hilo.getName()+ " interrumpudo.");
        }
        System.out.println(hilo.getName()+" terminado.");
    }
}

