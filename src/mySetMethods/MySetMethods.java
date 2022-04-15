package mySetMethods;

import java.util.*;

public class MySetMethods {
    public LinkedHashSet<String> convertToUnique(ArrayList<String> userList) {
        LinkedHashSet<String> uniqueSet = new LinkedHashSet<>();
        uniqueSet.addAll(userList);
        return uniqueSet;
    }

    public TreeSet<Integer> getSortedIntegerASC(ArrayList<Integer> userList) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.addAll(userList);
        return sortedSet;
    }

    public LinkedHashSet<Integer> getSortedUniqueIntegerDESC(ArrayList<Integer> userList) {
        LinkedHashSet<Integer> reverseSortedSet = new LinkedHashSet<>();
        Collections.sort(userList, Collections.reverseOrder());
        reverseSortedSet.addAll(userList);
        return reverseSortedSet;
    }

    public LinkedHashSet<String> buildSentenceDirection(String[] userArray) {
        LinkedHashSet<String> uniqueStringSet = new LinkedHashSet<>(Arrays.asList(userArray));
        return uniqueStringSet;
    }
}