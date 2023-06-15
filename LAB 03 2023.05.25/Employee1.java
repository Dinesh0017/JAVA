public class Employee1 {
    private String empname;
    private int empage;
    private double salary,basicsalary,bonus;

    public Employee1(String empname, int empage, double basicsalary, double bonus) {
        this.empname = empname;
        this.empage = empage;
        this.basicsalary = basicsalary;
        this.bonus = bonus;
    }
//setter methods
    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //getter methods


    public String getEmpname() {
        return empname;
    }

    public int getEmpage() {
        return empage;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    public double getBonus() {
        return bonus;
    }

    //calculate salary

    public double calSalary(){
       return salary=basicsalary+bonus;
    }


}
