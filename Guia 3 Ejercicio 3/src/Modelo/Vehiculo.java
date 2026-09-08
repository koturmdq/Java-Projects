package Modelo;

public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    //Constructor
    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Getters
    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public double obtenerVelocidadMaxima() {
        return velocidadMaxima;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                "\nMarca: " + obtenerMarca() +
                "\nModelo: " + obtenerModelo() +
                "\nVelocidadMaxima: " + obtenerVelocidadMaxima();
    }
}
