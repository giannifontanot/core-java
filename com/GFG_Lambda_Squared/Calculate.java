/*
This class demonstrates how a lambda works with a functional interface.

The lambda is the content of a variable. This variable is of a certain new type.
The type is of a new kind of object, which we just defined its signature by using
an interface at the top.

This new type, since it is an interface, does not have any implementation, just the
signature.

The lambda is used when we execute the method defined in the interface.
 */
package com.GFG_Lambda_Squared;

@FunctionalInterface
interface Square {
    int calculate(int x);
}

public class Calculate {

    public static void main(String[] args) {
        int a = 5;
        Square s = (int x) -> (x * x);

        int aSquared =  s.calculate(5);

        System.out.println(aSquared);
    }
}
