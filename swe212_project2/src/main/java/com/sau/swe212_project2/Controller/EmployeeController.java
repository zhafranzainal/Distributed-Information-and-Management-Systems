package com.sau.swe212_project2.Controller;

import com.sau.swe212_project2.Model.BonusEntity;
import com.sau.swe212_project2.Model.DeptEntity;
import com.sau.swe212_project2.Model.EmpEntity;
import com.sau.swe212_project2.Model.SalgradeEntity;
import com.sau.swe212_project2.Repository.BonusRepository;
import com.sau.swe212_project2.Repository.DepartmentRepository;
import com.sau.swe212_project2.Repository.EmployeeRepository;
import com.sau.swe212_project2.Repository.SalaryGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController{

    @Autowired
    private EmployeeRepository empRepo;
    private DepartmentRepository deptRepo;
    private SalaryGradeRepository salgradeRepo;
    private BonusRepository bonusRepo;

    public EmployeeController(EmployeeRepository empRepo, DepartmentRepository deptRepo, SalaryGradeRepository salgradeRepo, BonusRepository bonusRepo){
        this.empRepo=empRepo;
        this.deptRepo=deptRepo;
        this.salgradeRepo=salgradeRepo;
        this.bonusRepo=bonusRepo;}

    @GetMapping("/")
    public String getIndex(Model model){
        List<EmpEntity> employeeList = empRepo.findAll();
        model.addAttribute("eList", employeeList);
        return "index";}

    @GetMapping("/getDept")
    public String getDepartments(Model model){
        List<DeptEntity> deptList = deptRepo.findAll();
        model.addAttribute("dList", deptList);
        return "displayDept";}

    @GetMapping("/getSalgrade")
    public String getSalaryGrades(Model model){
        List<SalgradeEntity> salgradeList = salgradeRepo.findAll();
        model.addAttribute("sList", salgradeList);
        return "displaySalgrade";}

    @GetMapping("/getBonus")
    public String getBonus(Model model){
        List<BonusEntity> bonusList = bonusRepo.findAll();
        model.addAttribute("bList", bonusList);
        return "displayBonus";}

    @GetMapping("/addemployee")
    public String addEmployee(Model model){
        EmpEntity employee = new EmpEntity();
        model.addAttribute("employee", employee);
        return "addemp";}

    @PostMapping("/add")
    public String addEmp(EmpEntity employee, Model model){
        empRepo.save(employee);
        return "redirect:/";}

    @GetMapping("/update/{id}")
    public String update(@PathVariable(value = "id") Integer id, Model model){

        for(EmpEntity emp : empRepo.findAll()){
            if(emp.getEmpno() == id){
                model.addAttribute("employee", emp);
                break;}
        }

        return "updateemp";
    }

    @GetMapping("/deleteemployee")
    public String deleteEmployee(int empno, Model model){
        Optional<EmpEntity> emp = empRepo.findById(empno);
        model.addAttribute("employee", emp);
        return "deleteemp";}

    @PostMapping("/delete")
    public String deleteEmp(int empno){
        empRepo.deleteById(empno);
        return "redirect:/";}
}


