/*
Remove an element in an Array using an index

1. get Array and get index to remove
2. create an array with less 1 size of the Array we got
3. loop through the array and copy each element to another array-1 created
4. if index is equals to current loop do not copy and continue
5. once done, return array

 */

import java.util.Arrays;

class Main{
    public static void main(String [] a){
        int[] numbers = {1,2,3,4,5};
        numbers = remove(numbers, 2);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] remove (int[] array, int index){
        int[] resultArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++){
            if (i == index){
                continue;
            }
            resultArray[j++] = array[i];
        }
        return resultArray;

    }


}