package collectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String [] items = scanner.nextLine().split("\\s+");
       int n = Integer.parseInt(scanner.nextLine());
       AddCollection addCollection = new AddCollection();
       AddRemoveCollection addRemoveCollection= new AddRemoveCollection();
       MyListImpl myList = new MyListImpl();
        System.out.println(addCollection(items,addCollection));
        System.out.println(addRemoveCollection(items,addRemoveCollection));
        System.out.println(myListAddMethod(items,myList));
        System.out.println(addRemoveCollectionRemove(n, addRemoveCollection));
        System.out.println(myListRemove(n,myList));

    }

    private static String myListRemove(int n, MyListImpl myList) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n ; i++) {
            sb.append(myList.remove()).append(" ");

        }
        return sb.toString();
    }

    protected static String addRemoveCollectionRemove(int n, AddRemoveCollection addRemoveCollection) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n ; i++) {
           sb.append( addRemoveCollection.remove()).append(" ");


        }

        return sb.toString();
    }


    private static String myListAddMethod(String[] items, MyListImpl myList) {
        StringBuilder sb = new StringBuilder();
        for (String item : items) {
            sb.append(myList.add(item)).append(" ");


        }

        return sb.toString();
    }

    private static String addRemoveCollection(String[] items, AddRemoveCollection addRemoveCollection) {
        StringBuilder sb = new StringBuilder();
        for (String item : items) {
            sb.append(addRemoveCollection.add(item)).append(" ");


        }

        return sb.toString();

    }

    private static String addCollection(String[] items, AddCollection addCollection) {
        StringBuilder sb = new StringBuilder();


        for (String item : items) {
            sb.append(addCollection.add(item)).append(" ");


        }

        return sb.toString();
    }
}
