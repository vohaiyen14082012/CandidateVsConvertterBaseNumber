/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


// BaseConverterView.java
import java.util.Scanner;

public class BaseConverterView {
    private Scanner scanner;
    
    public BaseConverterView() {
        this.scanner = new Scanner(System.in);
    }

    public int getInputBase() {
        System.out.println("Enter the input base (2, 10, or 16): ");
        return scanner.nextInt();
    }

    public int getOutputBase() {
        System.out.println("Enter the output base (2, 10, or 16): ");
        return scanner.nextInt();
    }

    public String getInputValue() {
        System.out.println("Enter the input value: ");
        scanner.nextLine(); // Consume the newline character
        return scanner.nextLine();
    }

    public void displayResult(String result) {
        System.out.println("Result: " + result);
    }

    public void closeScanner() {
        scanner.close();
    }
}
