public class EmployeeTest {
    public static void main(String[] args){
        Employee empOne= new Employee("吴会子");
        Employee empTwo= new Employee("黄韬");
        empOne.setAge(25);
        empOne.setDesignation("高级工程师");
        empOne.setSalary(10000);
        empOne.printEmployee();

        empTwo.setAge(27);
        empTwo.setDesignation("初级工程师");
        empTwo.setSalary(50);
        empTwo.printEmployee();
    }
}
