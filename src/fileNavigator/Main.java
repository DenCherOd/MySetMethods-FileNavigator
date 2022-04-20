package fileNavigator;

public class Main {
    public static void main(String[] args) {
        FileData document = new FileData("MyNotes.txt", (byte) 5, "D:/documents/MyDocuments");
        FileData document2 = new FileData("Example.txt", (byte) 1, "D:/documents/MyDocuments/Den");
        FileData document3 = new FileData("Example.txt", (byte) 7, "D:/documents/MyDocuments/Den");

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("path/java", document);
        fileNavigator.add("path/java/example", document2);
        fileNavigator.add("path/java/example", document3);
        System.out.println(fileNavigator.find("path/java"));
        System.out.println(fileNavigator.filterBySize((byte) 3));
        fileNavigator.remove("path/java");
        System.out.println(fileNavigator.filterBySize((byte) 3));
        System.out.println(fileNavigator.sortBySize());
    }
}