/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
// Main.java

import Controller.BaseConverterController;
import Validate.BaseConverterValidate;
import View.BaseConverterView;

// Main.java
public class Main {
    public static void main(String[] args) {
        BaseConverterView view = new BaseConverterView();
        BaseConverterController controller = new BaseConverterController();
        BaseConverterValidate validation = new BaseConverterValidate();

        boolean continueProgram = true;

        while (continueProgram) {
            int inputBase, outputBase;
            String inputValue;

            do {
                inputBase = view.getInputBase();
            } while (!validation.isValidInputBase(inputBase));

            do {
                outputBase = view.getOutputBase();
            } while (!validation.isValidOutputBase(outputBase));

            inputValue = view.getInputValue();

            String result = controller.convert(inputBase, outputBase, inputValue);
            view.displayResult(result);

            System.out.println("Do you want to continue (Y/N)? ");
            String choice = view.getInputValue().toUpperCase();
            if (!choice.equals("Y")) {
                continueProgram = false;
            }
        }

        view.closeScanner();
    }
}
