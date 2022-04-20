package mySetMethods;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MySetMethods mySetMethods = new MySetMethods();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Hello");
        arrayList.add("!");

        System.out.println(mySetMethods.convertToUnique(arrayList));

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(7);
        integerList.add(9);
        integerList.add(9);
        integerList.add(3);
        System.out.println(mySetMethods.getSortedIntegerASC(integerList));
        System.out.println(mySetMethods.getSortedUniqueIntegerDESC(integerList));

        String[] stringArray = {"Hello", "World", "Hello", "!", "!"};
        System.out.println(mySetMethods.buildSentenceDirection(stringArray));

    }
}