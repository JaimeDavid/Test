import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jaime", "David", 1));
        employeeList.add(new Employee("Sonia", "Arandia", 2));
        employeeList.add(new Employee("Christian", "Arandia", 3));
        employeeList.add(new Employee("Isabel", "Angarita", 4));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("==========");
        System.out.println(employeeList.get(0));
        employeeList.set(1, new Employee("Raul Jaime", "David", 5));
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.size());

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee n :employeeArray){
            System.out.println(n);

        }



    }
}
