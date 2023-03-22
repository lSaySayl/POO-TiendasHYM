package org.example;

public class GrupoDos extends Factura{


    public GrupoDos() {
        this.setDescuento(0.05f);

    }

    public GrupoDos(float valorCompra) {
        super(valorCompra);
        this.setDescuento(0.05f);
    }

    @Override
    public float totalApagar() {
        float total = getValorCompra();
        int cantidadDescuentos = (int) (total/500000);
        float descuento = cantidadDescuentos * getDescuento();
        return total * (1-descuento);

    }

}
