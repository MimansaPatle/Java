import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // Adding key-value pairs
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");

        treeMap.put(2, "Cherry");
        treeMap.put(5, "Mango");
        // Displaying the TreeMap (Sorted Order of Keys)
        System.out.println("TreeMap: " + treeMap);
        // Getting first and last key
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        // Checking key presence
        System.out.println("Contains Key 2? " +
                treeMap.containsKey(2));
        // Removing a key
        treeMap.remove(3);
        System.out.println("After Removing Key 3: " +
                treeMap);
        // Navigating through keys
        System.out.println("Higher Key than 2: " +
                treeMap.higherKey(2));
        System.out.println("Lower Key than 2: " +
                treeMap.lowerKey(2));

                treeMap.put(3, "Apple");
                treeMap.put(4, "kiwi");

                
        System.out.println("ceiling   :   "+treeMap.ceilingKey(0));

        System.out.println("floor   :   "+treeMap.floorKey(6));

        System.out.println("decending :   "+treeMap.descendingKeySet());

        treeMap.clear();
        System.out.println("After clearing the TreeMap: " +
                treeMap);
    }

}