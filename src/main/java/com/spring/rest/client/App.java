package com.spring.rest.client;

import com.spring.rest.client.configuration.MyConfig;
import com.spring.rest.client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

Communication communication =
        context.getBean("communication", Communication.class);

//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//        Employee employee = new Employee("NNNqqq", "qqq", "qqq", 123);
//        employee.setId(13l);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(13);



    }
}
