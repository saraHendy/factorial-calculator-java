/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

/**
 *
 * @author USER
 */
// FactorialCalculator.java
public class FactorialCalculator {
    // Method to calculate factorial
    public int calculateFactorial(int number) {
        if (number == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return number * calculateFactorial(number - 1); // Recursive case
        }
    }
    
    public static void main(String[] args) {
        // Creating an instance of FactorialCalculator
        FactorialCalculator calculator = new FactorialCalculator();
        
        // Input number
        int number = 5; // Example: calculate factorial of 5
        
        // Calculate factorial and display the result
        int result = calculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
