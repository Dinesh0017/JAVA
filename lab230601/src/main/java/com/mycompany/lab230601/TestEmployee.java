
package com.mycompany.lab230601;

public class TestEmployee {
   
    public static void main(String[] args){
      
          Employee h1=new Employee();
          Employee h2=new Employee();
          
          h1.setEmpdetails(4585, "imashi", "owner");
          h2.setEmpdetails(4587, "harsha ", "boss");

          
          System.out.println("EMP ID "+h1.getEmpId());
          System.out.println("EMP NAME "+h1.getEmpName());
          System.out.println("EMP DESIGNATION "+h1.getEmpDesing());
         
          System.out.println("EMP ID "+h2.getEmpId());
          System.out.println("EMP NAME "+h2.getEmpName());
          System.out.println("EMP DESIGNATION "+h2.getEmpDesing());
      }
}
