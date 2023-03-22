package org.example;

public class GrupoNormal extends Factura {

    public GrupoNormal(float valorCompra) {
        super(valorCompra);
    }

    @Override
    public float totalApagar() {
        return getValorCompra();


    }
}
