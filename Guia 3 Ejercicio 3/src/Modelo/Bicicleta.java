package Modelo;

public class Bicicleta extends Vehiculo {
    //Atributos

    public Bicicleta(String marca, String modelo, double velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String toString() {
        return "\nMarca: " + obtenerMarca() +
                "\nModelo: " + obtenerModelo() +
                "\nVelocidad Maxima: " + obtenerVelocidadMaxima();
    }
}