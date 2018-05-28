import java.util.ArrayList;

/**
 * An ArrayList is a Java collection that can be thought as a resizeable Array, i.e.
 * an ArrayList is similar to an Array in which the size is automatically managed.
 */

public class Main {

    public static void main(String[] args) {

        ArrayList<String> invitees = new ArrayList<>();

        //Adding an element to the ArrayList is done with the method add(item)
        invitees.add("Andre");
        invitees.add("Tom");
        invitees.add("Harry");
        invitees.add("William");

        //Accessing an element is done with the get(position) method
        System.out.println("Element 0 is " + invitees.get(0));

        printArrayListOfStrings(invitees);

        //Removing an item from an ArrayList is done with the method remove(position).
        //When we remove an item from the middle of the ArrayList, positions are
        //adjusted to accommodate the gap. Ex: [Pos0,Pos1,Pos2] becomes [Pos0,Pos2]
        //when we remove position 1. We can also remove items by passing the object
        //to be removed (for objects the comparison done using equals)
        invitees.remove(1);
        System.out.println(invitees.remove("Harry")); //Removing an existing item returns true
        System.out.println(invitees.remove("Samuel")); //Removing a non existing item returns false
        //invitees.remove(10); Attempting to remove a non existing position will cause an IndexOutOfBoundsException
        printArrayListOfStrings(invitees);

        //We can modify a position of the array with the set method
        invitees.set(1,"Michael");
        printArrayListOfStrings(invitees);

        //To check if an ArrayList contains a particular element we use the contains(item) method
        System.out.println("Andre is invited: " + invitees.contains("Andre"));
        System.out.println("Tom is invited: " + invitees.contains("Tom"));

        //To check in which position an object is we use the indexOf(obj) method
        //Searching for an object that don't exist will result in the method returning -1
        System.out.println("Andre is guest number " + invitees.indexOf("Andre"));
        System.out.println("Charles is guest number " + invitees.indexOf("Charles"));

        //We can add another ArrayList to our initial ArrayList
        ArrayList<String> otherPeople = new ArrayList<>();
        otherPeople.add("Romeo");
        otherPeople.add("Juliette");

        invitees.addAll(otherPeople);
        printArrayListOfStrings(invitees);

        //We can copy an ArrayList via the constructor
        ArrayList<String> inviteesCopy = new ArrayList<>(invitees);
        System.out.println("Printing the copy");
        printArrayListOfStrings(inviteesCopy);

        //We can convert our ArrayList to an Array
        String[] array =  new String[invitees.size()];
        invitees.toArray(array);

    }

    public static void printArrayListOfStrings(ArrayList<String> arrayList) {
        for(int i=0; i < arrayList.size(); i++) {
            System.out.println("Item " + i + ": " + arrayList.get(i));
        }
        System.out.println("-------------");
    }
}
