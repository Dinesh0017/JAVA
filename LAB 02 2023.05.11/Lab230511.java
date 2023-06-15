package com.mycompany.lab230511;
public class Lab230511 
{
    public static void main(String[] args)
    {
        
           char grade='A';
            switch(grade)
            {
              case 'A' :
                   System.out.println("Excellent!"); 
                   break;
              case 'D' :
                    System.out.println("You passed");
              case 'F' :
                    System.out.println("Better try again");
                    break;
              default :
                    System.out.println("Invalid grade");
	    }
                    System.out.println("Your grade is " + grade);
        
        
        char grade='A';
        if(grade=='A')
        {
            System.out.println("EXCELLENT !");
        }
        else if(grade=='D')
        {
            System.out.println("YOU PASSED !");
        }
        else if(grade=='F')
        {
            System.out.println("BETTR TRY AGIN !");
        }
        else
        {
            System.out.println("INVALID GRADE !");
        }
        System.out.println("YOUR GRADE IS "+grade);
    }
}
