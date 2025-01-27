/**
 * The class Making Change solves a classic problem:
 * given a set of coins, how many ways can you make change for a target amount?
 *
 * @author Zach Blick
 * @author [Lucas Ying]
 */

public class MakingChange {
    /**
     * TODO: Complete this function, countWays(), to return the number of ways to make change
     *  for any given total with any given set of coins.
     */
    public static long countWays(int target, int[] coins) {

        // make a trie starting with the starting coins and branch off with every possible coin branching off of the first level of nodes
        // then you can mark the leaves as true if the target is hit from the combination of nodes down that path
        // return false on that leaf if

        // think about how to make the problem smaller specifically the target and the number of coins
        // this might allow me to understand how to solve a smaller version of the problem and figure out
        // how to solve the problem when you expand with more coins or larger target

        // to deal with duplicates we might be able to do something similar to when we worked with horners method and rabinkarp
        // by footprinting each sequence of coins with a code at the end to understand that they are the same.
        // you can use the ones place to identify how many coins were used in that place.

        return 0;
    }
}
