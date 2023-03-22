package org.example;

public abstract class Factura {

    private float descuento;
    private float valorCompra;

    //Constructores

    //Vacío

    public Factura() {
    }

    //Parcial

    public Factura(float valorCompra) {
        this.valorCompra = valorCompra;
    }


    //completo

    public Factura(float descuento, float valorCompra) {
        this.descuento = descuento;
        this.valorCompra = valorCompra;
    }


    //Get and set

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }


    //Metodo a extender

    public abstract float totalApagar();


}
