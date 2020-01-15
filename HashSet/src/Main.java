import java.util.HashSet;
import java.util.stream.IntStream;

/**
 *
 * The HashSet stores items in an Hash table. It's implementation is an
 * HashMap where the value is a dummy object - only the key is used.
 * For this reason, HashSets don't have order, and the code cannot directly
 * index the hash table. The advantage of this mechanism is that it allows the
 * execution time to be constant for add(), contains(), remove(), and size()
 * to be constant, independently of the size of the set.
 *
 * An important feature over other collections, such as the ArrayList, is that
 * members are unique.
 *
 * It directly implements the Set interface
 *
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        HashSet<String> hashset = new HashSet<>();

        // Adding new members to the HashSet
        hashset.add("Football");
        hashset.add("Tennis");
        hashset.add("Handball");

        System.out.println("Size before adding duplicate is " + hashset.size());

        // Adding a duplicate member
        // When printing, "football will only show once"
        hashset.add("Football");

        System.out.println("Size after adding duplicate is " + hashset.size());

        // Iterating over members
        // It can be seen that the order is not kept within the collection+
        printHashSet(hashset);
        System.out.println("We can see that the insertion order is not kept");

        // Removing an item
        hashset.remove("Football");

        System.out.println("Removed Football");
        printHashSet(hashset);

        // Generate a big hashset
        HashSet<String> bigHashSet = genererateBigHashSet(100);

        long startTime = System.currentTimeMillis();
        bigHashSet.contains("string50");
        long finishTime = System.currentTimeMillis();

        System.out.println("Took " + (startTime-finishTime) + " to complete");

    }

    private static HashSet<String> genererateBigHashSet(int numOfElements) {

        HashSet<String> hashSet = new HashSet<>();

        IntStream.range(0,numOfElements).forEach(i -> hashSet.add("string" + i));

        return hashSet;

    }

    private static void printHashSet(HashSet<String> hashSet) {
        for(String string : hashSet) {
            System.out.println(string);
        }
    }
}
