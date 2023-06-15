package com.mycompany.lab01230504;

public class Lab01230504 
{

    public static void main(String[] args) 
    {
        for (int i=0;i<=4;i++)
        {
            System.out.println("Excuting loop "+i);
        }
        System.out.println("");
        System.out.println("***********************");
        System.out.println("");
        int j=0;
        while(j<=4)
        {
            System.out.println("Excuting loop "+j);
            j++;
        }
         System.out.println("");
        System.out.println("***********************");
        System.out.println("");
        
        
        int[] numbers={10,20,30,40,50};
        for(int x:numbers)
        {
            if( x==30)
            {
                break;
            }
            System.out.println(x);
            System.out.println("\n");
        }
        System.out.println("i'm out of the loop now");
        
     }
    
    
}
