package com.chief;


import java.util.ArrayList;

import java.util.List;

public class WriteJson {

    // public List<Employee> convertToJson(List<Employee> employees) {

    //     return employees;
    // }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee Ken = new Employee("Ken", "ken@Test.com", 1L);
        Employee Ken1 = new Employee("Ken", "ken@Test.com", 2L);
        Employee Ken2 = new Employee("Ken", "ken@Test.com", 3L);
        Employee Ken3 = new Employee("Ken", "ken@Test.com", 4L);

        employees.addAll(List.of(Ken,
                Ken1,
                Ken2,
                Ken3));
                
        System.out.println(employees);

    }

}
