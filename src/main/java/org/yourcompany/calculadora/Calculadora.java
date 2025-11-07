package org.yourcompany.calculadora;

/**
 *
 * @author Héctor López Pedrosa
 */


public class Calculadora {

    public static void main(String[] args) {

        // Exemples de crida per al mètode sumaPrimersNumeros
        System.out.println();
        System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));
        System.out.println();

        // Exemples de crida per al mètode calcularFactorial
        System.out.println("Factorial de 5: " + calcularFactorial(5));
        System.out.println("Factorial de 7: " + calcularFactorial(7));
        System.out.println("Factorial de 10: " + calcularFactorial(10));
        System.out.println();

        // Exemples de crida per al mètode sumaQuadrats
        System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));
        System.out.println();
        
        // Exemples de crida per al mètode calcularPotencia
        System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));
    }

    public static int sumaPrimersNumeros(int nombre) {
    // Creació de variables
    int suma = 0;
    
    // Creació Bucle
    while (nombre != 0){
        suma += nombre; 
        nombre--;
    }
    // Retornar el resultat
    return suma;
    }

    public static int calcularFactorial(int nombre) {
    // Creació de variables
    int resultat = 1;
    
    // Creació Bucle
    while (nombre != 0){
        resultat *= nombre;
        nombre--;
        }
    // Retornar el resultat
    return resultat;
    }

    public static int sumaQuadrats(int nombre){
    // Creació de variables
    int quadrat;
    int suma = 0;
    
    // Creació Bucle
    while (nombre != 0){
        quadrat = nombre * nombre; // Calcular el quadrat del nombre
        if (suma == 0){
            suma = quadrat; // Si suma no te valor agreguem el primer quadrat que creem
        } else {
            suma += quadrat; // Quan suma te valor li sumem els quadrats nous
        }
        nombre--;
    }
    // Retornar el resultat
    return suma;
}

    public static double calcularPotencia(double base, double exponent){
    // Creació variables 
    double potencia = 1.0;

    // Excepció
    if (exponent == 0.0){
        return 1; // Qualsevol numero elevat a 0 es igual a 1
    }
    // Creació bucle
    for (int i = 0; i < exponent; i++) {
        potencia *= base;
    }
    // Retornar el resultat
    return potencia;
    }
}
