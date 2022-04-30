package com.sau.swe212_project2.Controller;

import com.sau.swe212_project2.Model.EmpEntity;
import com.sau.swe212_project2.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController{

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;}

    @GetMapping("/")
    public String getIndex(Model model){
        List<EmpEntity> employeeList = employeeRepository.findAll();
        model.addAttribute("eList", employeeList);
        return "index";}

    @GetMapping("/addemployee")
    public String addEmployee(Model model){
        EmpEntity employee = new EmpEntity();
        model.addAttribute("employee", employee);
        return "addemp";}

    @PostMapping("/add")
    public String addEmp(EmpEntity employee, Model model){
        employeeRepository.save(employee);
        return "redirect:/";}

    @GetMapping("/updateemployee")
    public String updateEmployee(int empno, Model model){
        Optional<EmpEntity> emp = employeeRepository.findById(empno);
        model.addAttribute("employee", emp);
        return "updateemp";}

    @PostMapping("/update")
    public String updateEmp(EmpEntity employee){
        employeeRepository.save(employee);
        return "redirect:/";}

    @GetMapping("/deleteemployee")
    public String deleteEmployee(int empno, Model model){
        Optional<EmpEntity> emp = employeeRepository.findById(empno);
        model.addAttribute("employee", emp);
        return "deleteemp";}

    @PostMapping("/delete")
    public String deleteEmp(int empno){
        employeeRepository.deleteById(empno);
        return "redirect:/";}
}


