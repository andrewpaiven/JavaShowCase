import java.util.LinkedList;

/**
 * A LinkedList is a type of list where each item (a node) stores a link
 * to the next item in the LinkedList, besides the data.
 * In an Array or ArrayList, adding an element to in any position, requires
 * shifting subsequent positions in memory. Similarly, if we delete an element,
 * subsequent positions need to be shifter back 1 position. Adding a new element
 * on any position in the LinkedList just requires changing the the reference on
 * the previous node. Elements that are not anymore linked are eventually
 * destroyed by the garbage collector.
 *
 * Due to the fact the the LinkedList stores references to next nodes, its memory
 * footprint is higher. When in doubt, LinkedLists should not be chosen as for example
 * ArrayLists access data much faster. They are a good option however when we have
 * massive amounts of adding and removing from the List.
 *
 * A nice stackoverflow post concerning LinkedList performance considerations:
 * https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist
 */



public class Main {

    public static void main(String[] args) {

        LinkedList<String> invitees = new LinkedList<>();

        //The LinkedList implements the List, Deque and Queue interfaces
        //Adding an element to the LinkedList can be done in several ways
        //(see the interfaces). These examples do not cover all methods
        //of these interfaces

        //Calling add will add the item to the end of the LinkedList
        invitees.add("Andre");

        //Or alternatively
        invitees.addLast("Tom");

        //To add to the beginning
        invitees.addFirst("Harry");

        //To add to an index
        invitees.add(1, "William");

        printLinkedList(invitees);

        //To remove an item pass it as an argument to the remove(object) method
        System.out.println(invitees.remove("Andre")); //Removing an existing item returns true
        System.out.println(invitees.remove("Trump")); //Removing a non existing item returns false

        //or by index
        invitees.remove(1);

        //To check in which position an object is we use the indexOf(obj) method
        //Searching for an object that don't exist will result in the method returning -1
        System.out.println(invitees.indexOf("Tom"));
        System.out.println(invitees.indexOf("Andre"));

        printLinkedList(invitees);

        //We can add another LinkedList to our initial LinkedList
        LinkedList<String> otherPeople = new LinkedList<>();
        otherPeople.add("Romeo");
        otherPeople.add("Juliette");

        invitees.addAll(otherPeople);
        printLinkedList(invitees);

        //We can copy an LinkedList via the constructor
        LinkedList<String> inviteesCopy = new LinkedList<>(invitees);
        System.out.println("Printing the copy");
        printLinkedList(inviteesCopy);

        //We can convert our LinkedList to an Array
        String[] array =  new String[invitees.size()];
        invitees.toArray(array);

    }

    static void printLinkedList(LinkedList<String> linkedList) {
        for(String invitee : linkedList) {
            System.out.println(invitee);
        }
        System.out.println("------");
    }
}