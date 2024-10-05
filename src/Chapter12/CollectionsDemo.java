package Chapter12;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();

    }

    public static void setDemo(){
        Set<String> fruit = new HashSet(); //diamond operator put for the for-each
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        //System.out.println(fruit.size()); //Return the size of the set (4, five elements position from 0 to 4)
        //System.out.println(fruit);

        //Iterator
//        var i=fruit.iterator();
//        while(i.hasNext())//boolean who return true if the iterator has more elements
 //           System.out.println(i.next()); //Return the next item of the set

        //iterator returns duplicate elements only a one time (the last one)

        /**
         *another way to print one time the elements in the loop (for)
         *Important put the diamond operator <String> in the object
         * @return an array
         */
//        for (String item:fruit){
//            System.out.println(item);
//        }

        //Third method for-Each with lambda expression (a generic name for every type o object)
        fruit.forEach(x -> System.out.println(x)); //Shortcut fruit.forEach(System.out::println);

        //The method upside are for all the collections (set, list and queue)

    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap(); //For the interate with for loop, use <String> with the type of data (use Integer and not int)
        fruitCalories.put("apple",95);
        fruitCalories.put("lemon",20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange",45);
        fruitCalories.put("lemon",17); //last element ovewrite the first with the same name

//        System.out.println(fruitCalories.size()); //return only the map size
//        System.out.println(fruitCalories); //return all the map
//        System.out.println(fruitCalories.entrySet()); //Return a set containing the map
//        System.out.println(fruitCalories.remove("orange")); //remove an element
//        System.out.println(fruitCalories); //return the map after the remove

        for (var entry:fruitCalories.entrySet()){ //transform the value in a set
            System.out.println(entry.getValue()); //use getValue to return only a value an not the key
        }

        //For-each
        fruitCalories.forEach(
                (key, value) ->System.out.println("Fruit: "+key+", Calories: "+value));
    }

    public static void listDemo(){
        List fruit= new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); //return the object with index
        System.out.println(fruit.size()); //return the number of elements
        System.out.println(fruit); //prin all the array
    }

    public static void queueDemo(){
        Queue fruit=new LinkedList(); //PriorityQueue it's an alternative
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("lemon");

        System.out.println(fruit.size()); //Return the size
        System.out.println(fruit); //Return all the list

        fruit.remove(); //Eliminate an element, without an index eliminate the first
        System.out.println(fruit); //Return the list after the remove

        System.out.println(fruit.peek()); //Peek the first element of the array (without index)
    }

}
