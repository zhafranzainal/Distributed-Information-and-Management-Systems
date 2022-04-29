package com.sau.swe212_project1.Controller;

import com.sau.swe212_project1.Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController{

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeController(){
        populateList();}

    public void populateList(){
        employeeList.add(new Employee("9369", "Sami", "Clerk", "7902", "12.15.2021", 1000, null, 20));
        employeeList.add(new Employee("7369", "Smith", "Clerk", "7902", "12.17.1980", 900, null, 20));
        employeeList.add(new Employee("7499", "Allen", "Salesman", "7698", "2.20.1981", 1600, 300, 30));
        employeeList.add(new Employee("7521", "Ward", "Salesman", "7698", "2.22.1981", 1250, 500, 30));
        employeeList.add(new Employee("7566", "Jones", "Manager", "7839", "4.2.1981", 2975, null, 20));
        employeeList.add(new Employee("7654", "Martin", "Salesman", "7698", "9.28.1981", 1250, 1400, 30));
        employeeList.add(new Employee("7698", "Blake", "Manager", "7839", "5.1.1981", 2850, null, 30));
        employeeList.add(new Employee("7782", "Clark", "Manager", "7839", "6.9.1981", 2450, null, 10));
        employeeList.add(new Employee("7788", "Scott", "Analyst", "7566", "12.9.1982", 3000, null, 20));
        employeeList.add(new Employee("7839", "King", "President", null, "11.17.1981", 5000, null, 10));
        employeeList.add(new Employee("7844", "Turner", "Salesman", "7698", "9.8.1981", 1500, 0, 30));
        employeeList.add(new Employee("7876", "Adams", "Clerk", "7788", "1.12.1983", 1100, null, 20));
        employeeList.add(new Employee("7900", "James", "Clerk", "7698", "12.3.1981", 950, null, 30));
        employeeList.add(new Employee("7902", "Ford", "Analyst", "7566", "12.3.1981", 3000, null, 20));
        employeeList.add(new Employee("7934", "Miller", "Clerk", "7782", "1.23.1982", 1300, null, 10));}

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("eList", employeeList);
        return "index";}

    @GetMapping("/addemp")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "addemp";}

    @PostMapping("/add")
    public String addEmp(Employee employee, Model model){
        employeeList.add(employee);
        model.addAttribute("eList", employeeList);
        return "index";}

    @GetMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") String numID, Model model){

        for(Employee emp:employeeList){
            if(emp.getNumID().equals(numID)){
                model.addAttribute("employee", emp);
                break;}
        }

        return "update";
    }

    @PostMapping("/update")
    public String updateEmp(Employee employee, Model model){

        for(Employee emp:employeeList){
            if(emp.getNumID().equals(employee.getNumID())){
                emp.setNumID(employee.getNumID());
                emp.setName(employee.getName());
                emp.setJob(employee.getJob());
                emp.setManagerID(employee.getManagerID());
                emp.setHireDate(employee.getHireDate());
                emp.setSalary(employee.getSalary());
                emp.setCommission(employee.getCommission());
                emp.setDeptNo(employee.getDeptNo());
                break;}

            model.addAttribute("eList", employeeList);
        }

        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") String numID, Model model){

        for(Employee emp:employeeList){
            if(emp.getNumID().equals(numID)){
                employeeList.remove(emp);
                break;}
        }

        model.addAttribute("eList", employeeList);
        return "index";
    }

}
