package com.theorganisation.controller;

import com.theorganisation.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository er;

    public HrManager addHrManager(HrManager hr) {
        System.out.println("Called addHrManager from EmployeeService");
        return er.save(hr);
    }

    public DepartmentManager addDepartmentManager(DepartmentManager dm) {
        System.out.println("Called addDepartmentManager from EmployeeService");
        return er.save(dm);
    }

    public Iterable<Employee> getAllEmployee() {
        System.out.println("Called getAllEmployee from EmployeeService");
        return er.findAll();
    }

    public Employee addProgrammer(Programmer ep) {
        System.out.println("Called addProgrammer from EmployeeService");
        return er.save(ep);
    }

    public Employee addConsultant(Consultant ec) {
        System.out.println("Called addConsultant from EmployeeService");
        return er.save(ec);
    }
}