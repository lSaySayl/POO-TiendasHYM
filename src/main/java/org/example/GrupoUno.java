package org.example;

public class GrupoUno extends Factura {

    //Constructores

    //Vacío

    public GrupoUno() {
        this.setDescuento(0.01f);
    }

    //Elementos del padre


    public GrupoUno(float valorCompra) {
        super(valorCompra);
        this.setDescuento(0.1f);
    }


    @Override
    public float totalApagar() {
        float total = getValorCompra();
        int cantidadDescuentos = (int) (total/1000000);
        float descuento = cantidadDescuentos * this.getDescuento();
        return total * (1-descuento);

    }

}
