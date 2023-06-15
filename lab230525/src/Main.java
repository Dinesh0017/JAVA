// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        /*    Employee h1=new Employee();
          //without constructor
             h1.setEmpName("imashi");
             h1.setAge(23);
             h1.setSalary(5000000.00);
             System.out.println("empname "+h1.getEmpName());
             System.out.println("age "+h1.getAge());
             System.out.println("salary "+h1.getSalary());

           //with constructor
           Employee h1=new Employee("harsha",23, 8000000.00);

             System.out.println("empname "+h1.getEmpName());
             System.out.println("age "+h1.getAge());
             System.out.println("salary "+h1.getSalary());*/

        Employee1 h2=new Employee1("asds",23,50000.00,10000.00);

        System.out.println("EMPLOYEE NAME "+h2.getEmpname());
        System.out.println("EMPLYOEE AGE "+h2.getEmpage());
        System.out.println("EMPLOYEE BASIC SALARY "+h2.getBasicsalary());
        System.out.println("EMPLOYEE BONUS "+h2.getBonus());
        System.out.println("EMPLOYEE SALARY "+h2.calSalary());
    }

}