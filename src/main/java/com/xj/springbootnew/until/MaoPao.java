package com.xj.springbootnew.until;

public class MaoPao {
    public static void main(String[] args) {
        int[] array = {9,8,10,5,3,1,12,89,45,23,16};
        int[] array2=bubbleSort(array);
        for(int i=0;i<array2.length;i++)
            System.out.print(array2[i]+",");


    }

    public static int[] bubbleSort(int[] array){
        if(array.length!=0) {
            for (int i = 0; i < array.length; i++)
                for (int j = 0; j < array.length-i-1; j++)
                    if (array[j+1] < array[j]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
            return array;
        }
        System.out.println(".........");
        return array;
    }
}
