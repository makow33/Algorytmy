package Algorithms;


import Struktury.Kopiec;

public class TestowanieKopca extends AbstractAlgoritm {
    @Override
    public String getName() {
        return " Testowanie Kopca ";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = input.length - 1;
        Kopiec kopiec = new Kopiec(n); // "n" jest przekazywane do konstruktora

        for (int i = 1; i < input.length; i++) {
            int newElement = Integer.parseInt(input[i]);
            kopiec.insertElement(newElement);
        }
        kopiec.printAllElemts();

    }
}
