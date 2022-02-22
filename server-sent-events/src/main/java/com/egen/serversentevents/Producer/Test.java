package com.egen.serversentevents.Producer;
import java.util.*;
// Given list of folders, print the path of a given folder from root. If there is no path to the root folder then return an empty string. Root level folders will have 0 as id. The structure of Folder is like this:


// Ex:
// list = [Folder(0, [7, 3], “abc”), Folder(0, [], “xyz”), Folder(8, [], “def”), Folder(7, [9], “ijk), Folder(9, [], “lmn”)]

// printPath(9) = “abc” -> “ijk” -> “lmn” printPath(8) = ""
// Clarification: There can be multiple root level folders. All other folders have unique ids.
// Note: printPath method may be called multiple times. Design your solution taking that into account


// Main class should be named 'Solution'
class T {
    static String h = "Hello";

    static String getH() {
        return h;
    }
}
public class Test {



    public static void main(String[] args) {
        System.out.println(T.getH());
    }

}