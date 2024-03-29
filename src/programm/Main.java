package programm;

import comparator.Comparable;
import comparator.DegreeProgramComparator;
import comparator.ForenameComparator;
import controller.Controller;
import data.Student;
import list.DegreeProgram;
import list.DoublyLinkedList;
import list.Listable;
import list.sort.SelectionSort;
import list.sort.Sortable;


public class Main {

    public static void main(String[] args) {

        Controller controll = new Controller();
        controll.runLists();

        /*
        Listable<Student> list = new DoublyLinkedList<>();


        Sortable<Student> sortable = new SelectionSort<>();
        Comparable comparable = new DegreeProgramComparator();

        Student s1 = new Student("Zen", "Buddy", 666777, DegreeProgram.GEEKY_STUFF, 8);
        Student s2 = new Student("Anna", "Wei", 890066, DegreeProgram.MATHEMATICS, 0);
        Student s3 = new Student("Klaus", "Mueller", 334455, DegreeProgram.COMPUTER_SCIENCE,  1);
        Student s4 = new Student("Angela", "Moss", 111333, DegreeProgram.PROGRAMMING, 0);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.printAll();
        list.printSize();
        System.out.println();

        Student s5 = new Student("Mad", "Scientist", 123456, DegreeProgram.ALGORITHMS,  1);


        list.insertAt(2, s5);
        list.printAll();
        list.printSize();
        System.out.println();

       // list.remove(1);
        list.printAll();

        list.sort(sortable, comparable);

        System.out.println("After sorting: ");
        list.printAll();

        System.out.println(comparable.compare(s1, s2));

        list.clear();
        list.printAll();
        */
    }
}
