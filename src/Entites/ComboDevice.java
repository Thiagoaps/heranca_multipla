package Entites;

public class ComboDevice extends Scanner{ // Não pode extender mais de uma classe. (Problema do diamante).

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }
}
