package optimized_version;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void printManual() {
        System.out.println("Options are:\n" +
                "\t0 - quit\n" +
                "\t1 - next element\n" +
                "\t2 - previous element\n" +
                "\t3 - this list\n");
    }

    public static void iterate(LinkedList<String> towns) {
        ListIterator<String> li = towns.listIterator();
        printManual();
        boolean moveForward = true;

        while (true) {
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    return;
                case 1:
                    if (!moveForward) { // if we iterated backwards previously
                        moveForward = true;
                        if (li.hasNext()) {
                            li.next(); // move one position forward to skip already printed
                            // element (i.e. in the previous backward step)
                        }
                    }
                    if (li.hasNext()) {
                        System.out.println(li.next());
                    }
                    break;
                case 2:
                    if (moveForward) { // if we iterated forward previously
                        moveForward = false;
                        if (li.hasPrevious()) {
                            li.previous(); // move one position backwards to skip already printed
                            // element (i.e. in the previous forward step)
                        }
                    }
                    if (li.hasPrevious()) {
                        System.out.println(li.previous());
                    }
                    break;
                case 3:
                    printManual();
                    break;
                default:
                    System.out.println("Unknown command");
                    printManual();
                    break;
            }
        }

    }

    public static void main(String[] args) {

        LinkedList<String> towns = new LinkedList<>();

        // populate list with towns:
        towns.add("Cluj");
        towns.add("Targu Jiu");
        towns.add("Suceava");
        towns.add("Bucuresti");
        towns.add("Brasov");

        iterate(towns);
    }
}