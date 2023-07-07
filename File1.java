package com.ArraysQ;

public class File1 {
    public static void main(String[] args) {
        int a[]={1 ,2, 3 ,3 ,4 ,1 ,4, 5, 1, 2};
        int f[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            f[a[i]]++;
        }
        for(int i=0;i<10;i++)
        {   if(f[i]!=0)
            System.out.println(i+" occurs "+f[i]);
        }

    }
}
