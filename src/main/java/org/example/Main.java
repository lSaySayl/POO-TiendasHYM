package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        GrupoUno ventaUno = new GrupoUno(2000000);
        GrupoDos ventaDos = new GrupoDos(500000);
        GrupoTres ventaTres = new GrupoTres(200000);
        GrupoNormal ventaNormal = new GrupoNormal(100000);

        JOptionPane.showMessageDialog(null,"El precio de la venta que pertenece al grupo uno es: " + ventaUno.totalApagar());
        JOptionPane.showMessageDialog(null,"El precio de la venta que pertenece al grupo dos es: " + ventaDos.totalApagar());
        JOptionPane.showMessageDialog(null,"El precio de la venta que pertenece al grupo tres es: " + ventaTres.totalApagar());
        JOptionPane.showMessageDialog(null,"El precio de la venta que pertenece al grupo normal es: " + ventaNormal.totalApagar());



    }
}