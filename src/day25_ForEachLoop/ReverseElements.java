package day25_ForEachLoop;
import java.util.Arrays;
public class ReverseElements {
    public static void main(String[] args) {


    String[] array = {"Java", "Python", "C#"};

        for (int j = 0; j < array.length; j++) { // j: index numbers of the array ( starting from 0)

        String element = array[j]; //element of the array
        //0123
        String reverse = ""; //to store the reversed version of the element

        for (int i = element.length()-1; i >=0 ; i--) { // index numbers of the String
            reverse += element.charAt(i); // gets the characters from the string element
        }

        array[j] = reverse; // assigning reversed element to the index of the array

    }




        System.out.println(Arrays.toString(array));



}

}

/*
1. write a program that can  reverse each elements in an array of string
		Ex:
		    array = {"Java", "Python", "C#"}
	    	output:
	    		["avaJ", "nohtyP", "#C"]
 */
