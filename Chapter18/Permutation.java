/*
18.25 (String permutation) Write a recursive method to print all the permutations of a
string. For example, for the string abc, the permuation is

abc
acb
bac
bca
cab
cba

(Hint: Define the following two methods. The second is a helper method.)
public static void displayPermutation(String s)
public static void displayPermutation(String s1, String s2)
The first method simply invokes displayPermutation(" ", s). The second
method uses a loop to move a character from s2 to s1 and recursively invokes
it with a new s1 and s2. The base case is that s2 is empty and prints s1 to the
console.

Write a test program that prompts the user to enter a string and displays all its
permutations.
*/

import java.util.*;

public class Permutation{

    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String s = "abc";
        displayPermutation(s);
    }

    public static void displayPermutation(String s){
        displayPermutation("",s);
    }

    public static void displayPermutation(String s1, String s2){
        if(s2.length()==0){
            System.out.println(s1);
        }else{
            for(int i=0;i<s2.length();i++){
                displayPermutation(s1+s2.charAt(i),s2.substring(0,i)+s2.substring(i+1));
            }
        }
    }

}
