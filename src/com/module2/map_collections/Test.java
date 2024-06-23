package com.module2.map_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    /*
    The equality contract states that if two objects are equal according to their equals method, they must return the same hashCode.
    If you violate the equality contract, you may experience bugs with hash-based collections (like HashMap).
     */

    public static void main (String[] args) {
        Fruit apple1 = new Fruit("Apple");
        Fruit apple1Ref = apple1;
        Fruit apple1Ref2 = new Fruit("Apple");


        System.out.println(apple1.hashCode());    // Output: some Hash number
        System.out.println(apple1Ref.hashCode()); // Output: the SAME Hash number
        System.out.println(apple1Ref2.hashCode()); // Output: different Hash number (compared to the above)


        System.out.println(apple1.equals(apple1Ref)); // Output: true
        System.out.println(apple1.equals(apple1Ref2)); // Output: false

        Map<Fruit, Integer> map = new HashMap<>();

        map.put(apple1, 1);
        map.put(apple1Ref, 2);
        map.put(apple1Ref2, 3);

                                                 // while the equals method on Fruit class is commented
        System.out.println(map);
        System.out.println(map.get(apple1));     // Output: 2, should be 1  *** this is a problem because both apple1 and apple1Ref share the same Hash number
        System.out.println(map.get(apple1Ref));  // Output: 2
        System.out.println(map.get(apple1Ref2));  // Output: 3

    }

}

class Fruit {


    private String name;

    Fruit(String name) {
        this.name = name;
    }

    // getters and setters ...


    public boolean equals(Object o) {  // The equals() method, will return true, when comparing apple1 and apple1Ref2 because the fields ("Apple") are identical
        if (o == this)
            return true;
        if (!(o instanceof Fruit)) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }


    public int hashCode() {        // The hashCode() method will produce the same hash value because the fields are identical
        return Objects.hash(name);
    }


    /*
    Maintaining the equality contract is critical because it guarantees the correct behavior of hash-based collections like HashMap.
    These collections use the hashCode() method for quick lookups.
    If two equal objects did not produce the same hash code, it would break the contract and could lead to bizarre and hard-to-trace bugs in your program.
     */

}

