package sky.pro.myCollection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.myCollection.Employee;
import sky.pro.myCollection.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find")
    public String find(@RequestParam(name = "name") String name,
                         @RequestParam(name = "surName") String surName) {
        Employee employee = employeeService.searchEmployee(name, surName);
        return "Сотрудник" + name + " " + surName + " найден";
    }
    @GetMapping("/add")
    public String add(@RequestParam(name = "name") String name,
                         @RequestParam(name = "surName") String surName) {
        employeeService.addEmployee(name, surName);
        return "Сотрудник" + name + " " + surName + " добавлен";
    }
    @GetMapping("/remove")
    public String remove(@RequestParam(name = "name") String name,
                         @RequestParam(name = "surName") String surName) {
        employeeService.deleteEmployee(name, surName);
        return "Сотрудник" + name + " " + surName + " удалён";
    }
}
