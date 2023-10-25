package Entites;

public class ConcretePrinter extends Device implements Printer{ // isto não é herança múltipla, pois não há reuso na relação de ComboDevice e as interfaces Scanner e Printer
                                                                // ComboDevice não herda, mas sim implementa as interfaces (cumpre o contrato).
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }


   @Override
    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
