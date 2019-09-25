package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


/*        -Write a method called reverse() with an int array as a parameter.

                -The method should not return any value. In other words, the method is allowed to modify the array parameter.

        -In main() test the reverse() method and print the array both reversed and non-reversed.

                -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

                -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


        Tip:
        -Create a new console project with the name eReverseArrayChallengef*/


        int [] array = {1,2,3,4,5,6,7,8,9,10,11};
       // System.out.println(array[array.length-1]);
        System.out.println(Arrays.toString(array));

        reverse(array);

        System.out.println(Arrays.toString(array));


    }
/*
    public static void  reverse(int [] array){

        for (int i = array.length-1; i >= 0; i--){

            System.out.println(array[i]);

        }

    }*/

    public static void reverse(int [] array){

        int lastNum = array.length;
        int temp = array[0];

        for (int i = 0; i < array.length-1;i++){

            array[i] = lastNum;
            lastNum--;




        }

        array[array.length-1] = temp;


    }


}

//alt

/*
    private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2; half cause index will already be swapped before it cross halfway point
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }*/
