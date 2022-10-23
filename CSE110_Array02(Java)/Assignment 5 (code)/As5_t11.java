//Q*11Design Employee class so that following code prints 12000//

class EmployeeTester {
    public static void main (String[] args) {
        Employee a = new Employee();
        a.name = "Mohammad Java Choudhury";
        a.salary = 10000;
        a.increaseSalary= a.salary*20/100; //percentage
        System.out.println(a.salary+a.increaseSalary);//prints 12000  
    }
}