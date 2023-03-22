package org.example;

public class GrupoTres extends Factura{

    public GrupoTres() {
        this.setDescuento(0.025f);
    }

    public GrupoTres(float valorCompra) {
        super(valorCompra);
        this.setDescuento(0.025f);
    }

    @Override
    public float totalApagar() {
        float total = getValorCompra();
        int cantidadDescuentos = (int) (total/200000);
        float descuento = cantidadDescuentos * getDescuento();
        return total * (1-descuento);

    }

}
