package com.example.ex2bb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    CommandLineRunner initDatabase(EmployeeRepository repo){
        return args -> {
            log.info("Preloading" +repo.save(new Employee("Bilbo Baggins","Dept Manager")));
            log.info("Preloading" +repo.save(new Employee("Frodo Baggins","Software Engineering")));
        };
    }
}
