package org.example.animal;

public class Animal {
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    // Método para mostrar la información del animal
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad);
    }

    // Método general para hacer sonido (será sobrescrito por las clases hijas)
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }


}
