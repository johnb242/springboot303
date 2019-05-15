package com.example.springboot303;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    CourseRepository repository;
    @Override
    public void run(String... strings) throws Exception{
        Course course = new Course("Astrophysics", "neil d tyson", "just a course on stars", 3);
        repository.save(course);

        course = new Course("calculus", "carol henley", "rate of change of the rate of change", 3);
        repository.save(course);

        course = new Course("Fressman english", "geraldine program", "learn your language", 3);
        repository.save(course);

        course = new Course( "algebra", "mary jones", "learn math", 4);
        repository.save(course);

        course = new Course("psychology", "abe lincoln", "learn psychology", 3);
        repository.save(course);

        course = new Course("chemistry", "rob peters", "learn chemistry", 4);
        repository.save(course);
    }
}
