
//Zadanie 2
//Zaimplementuj generyczną metodę countIf , która na podstawie tablicy
//dowolnego typu oraz wskazanej funkcji zliczy liczbę elementów spełniających
//warunek.  Funkcją  może  być  dowolony  interfejs  zaimplementowany  anonimowo.


import Validator.Validator;

public class Main {

    public static void main(String[] args) {
        Integer[] tab = {10, 21, 33, 66, 50, 60};
        int counter = Utils.countIf(tab, new Validator<Integer>()
        {
            @Override
            public boolean validate(Integer value) {
                return value % 3 == 0;
            }
        });
        System.out.println(counter);
    }
}