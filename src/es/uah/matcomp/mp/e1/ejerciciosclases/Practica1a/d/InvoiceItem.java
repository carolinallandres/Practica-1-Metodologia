package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1a.d;

public class InvoiceItem {

    //Atributos de la clase
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;


    public InvoiceItem (String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    //Getters y Setters de los atributos
    public String getId () {return id;}

    public String getDesc () {return desc;}

    public int getQty () {return qty;}

    public void setQty (int qty) {this.qty=qty;}

    public double getUnitPrice() {return unitPrice;}

    public void setUnitPrice (double unitPrice) {this.unitPrice=unitPrice;}

    //Cálculo del precio total de la factura 
    public double getTotal () {return unitPrice*qty;}

    public String toString () {return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",uniPrice="+unitPrice+"]";}

}
