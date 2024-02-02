package com.array;

import java.util.concurrent.atomic.AtomicInteger;

public class meteor {
    public static void main(String[] args) {

        int age_1 = 12;
        int age_2 = 12;
        int age_3 = 13;

//        array is a data structure which stores the collection of homogeneous items
//          array is an object

        //arrays has zero based indexing

        //continuous memory allocation

        int[] arr = new int[5];

        int[] arr1 = {1, 2, 3, 4, 5, 6};

//        memory allocation in array

        /*
         * int[] age = new int[3]
         *1 int[]--4bytes
         *3 int[]--12bytes
         *
         * [15,20,56,30]--total memory 4*4=16 bytes
         *  100 105 109 113(memory address) are in hexadecimal format
         *
         * //stack heap memory
         *
         * stack -->primitive datatypes ,reference variables ,functions
         * heap -->object
         *
         * int a=10, int b=50--> stack   (nothing is there in heap)
         *
         * int[] ages; (null)--> in stack
         * ages = new int[3] -->16 bytes in heap -->null is changed by memory address of first element
         *
         *
         * //0 based indexing
         *  1st element 2nd element 3rd element 4th element 5th element
         *   0          1           2           3           4       --index
         *   a[0]=12;  .....................initialize
         *     system.out.println(a[0]);
         *     system.out.println(a[0]);
         *     system.out.println(a[0]);
         *     system.out.println(a[0]);
         *     s
         *
         *
         *
         * */







    }
}
