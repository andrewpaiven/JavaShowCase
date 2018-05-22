import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Arrays are fixed-size data structures that hold sequences of values
 * of the same type.
 * They can hold primitive data types (int, float, double) or objects
 * like String or Person.
 * See also, ArrayLists.
 *
 */

public class Main {


    public static void main(String args[]) {

        //Arrays are declared like this
        // [] -> Tells the compiler this is an array
        // manyNumbers -> Name of the array
        // [10] -> the array size (i.e. the number of elements it will hold)
        int[] manyNumbers = new int[10];

        //Saving a value to a position in the array
        manyNumbers[5] = 10;

        //Arrays start in position 0 - so the maximum array position
        //of manyNumbers is 9, given that we allocated 10 positions
        //in memory
        // manyNumbers[10] = 10; would result in a compilation error

        //Retrieving a position in an array
        System.out.println(manyNumbers[5]);

        //We can define the values for many positions in the array
        //at once - called array initializer. The numbers of values
        //between the curly braces tell the compiler how many values
        //are inside the array - so memory can be allocated to it.
        String[] names = { "Andre","Thomas","George"};

        //This will only work during initialization, i.e.
        // String[] names;
        // names = { "Andre","Thomas","George"};
        // will result in a compilation error

        //Let's print the first element of this array
        System.out.println(names[0]);

        //A useful property of arrays is the length
        for(int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }

        //That we won't use if we use enhanced-for loops
        for(String name : names) {
            System.out.println(name);
        }

        //We can define dinamically the number of values in
        //an array
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the number of items");
        int numberOfItems = scanner.nextInt();

        //The number of items of the array was decided at runtime
        int[] items = new int[numberOfItems];
        for(int i=0; i<items.length; i++) {
            System.out.println("Insert item " + (i+1));
            items[i] = scanner.nextInt();
        }

        System.out.println("The items inserted are:");

        //Let's print it out
        for(int item : items) {
            System.out.println(item);
        }

        //We can call methods that take arrays as parameters
        System.out.println("The average of the inserted values is " + getAverage(items));


        //We can use lambda expressions to print arrays
        Arrays.stream(names).forEach(name -> System.out.println(name));

    }

    //Arrays can be used as parameters for functions
    //int[] tells the compiler to expect an array
    public static double getAverage(int[] arrayOfInts) {
        int sum = 0;
        for(int value : arrayOfInts) {
            sum += value;
        }
        return (double) sum / (double) arrayOfInts.length;
    }
}