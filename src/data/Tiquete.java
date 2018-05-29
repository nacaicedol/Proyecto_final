package data;

import java.util.ArrayList;

public class Tiquete {
    private double precio=0;
    private ArrayList<Asiento> asientoscomprados;
    private double pesoequpaje;
    private int cantidadequipaje;
    private Vuelos vuelo;

    public Tiquete(ArrayList< Asiento> asientoscomprados, double pesoequpaje, int cantidadequipaje, Vuelos vuelo) {
        this.asientoscomprados = asientoscomprados;
        this.pesoequpaje = pesoequpaje;
        this.cantidadequipaje = cantidadequipaje;
        this.vuelo = vuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Asiento> getAsientoscomprados() {
        return asientoscomprados;
    }

    public void setAsientoscomprados(ArrayList<Asiento> asientoscomprados) {
        this.asientoscomprados = asientoscomprados;
    }

    public double getPesoequpaje() {
        return pesoequpaje;
    }

    public void setPesoequpaje(double pesoequpaje) {
        this.pesoequpaje = pesoequpaje;
    }

    public int getCantidadequipaje() {
        return cantidadequipaje;
    }

    public void setCantidadequipaje(int cantidadequipaje) {
        this.cantidadequipaje = cantidadequipaje;
    }

    public Vuelos getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelos vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "precio=" + precio + ", asientoscomprados=" + asientoscomprados + ", pesoequpaje=" + pesoequpaje + ", cantidadequipaje=" + cantidadequipaje + ", vuelo=" + vuelo + '}';
    }

}
