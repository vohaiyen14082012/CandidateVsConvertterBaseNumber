
package Controller;


import Model.BaseConverterModel;

public class BaseConverterController {
    private BaseConverterModel model;

    public BaseConverterController() {
        this.model = new BaseConverterModel();
    }

    public String convert(int inputBase, int outputBase, String inputValue) {
        return model.convert(inputValue, inputBase, outputBase);
    }
}
