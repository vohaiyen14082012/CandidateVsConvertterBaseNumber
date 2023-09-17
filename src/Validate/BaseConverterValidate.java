/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validate;
// BaseConverterValidation.java
public class BaseConverterValidate {
    public boolean isValidInputBase(int base) {
        return base == 2 || base == 10 || base == 16;
    }

    public boolean isValidOutputBase(int base) {
        return base == 2 || base == 10 || base == 16;
    }
}

