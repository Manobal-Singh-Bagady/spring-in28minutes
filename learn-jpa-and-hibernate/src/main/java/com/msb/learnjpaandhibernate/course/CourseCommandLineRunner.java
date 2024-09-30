package com.msb.learnjpaandhibernate.course;

import com.msb.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CourseCommandLineRunner implements CommandLineRunner {
    //    private CourseJdbcRepository repository;
//    private CourseJpaRepository repository;
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) {
//        repository.insert(new Course(1L, "Learn AWS Now!", "in28minutes"));
//        repository.insert(new Course(2L, "Learn Azure Now!", "in28minutes"));
//        repository.insert(new Course(3L, "Learn DevOps Now!", "in28minutes"));
        repository.save(new Course(1L, "Learn AWS Now!", "in28minutes"));
        repository.save(new Course(2L, "Learn Azure Now!", "in28minutes"));
        repository.save(new Course(3L, "Learn DevOps Now!", "in28minutes"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L).orElse(null));
        System.out.println(repository.findById(3L).orElse(null));
        System.out.println(repository.findById(1L).orElse(null));

        System.out.println(repository.findAll());
        System.out.println("Total No. of Courses: " + repository.count());

        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn DevOps Now!"));
    }
}
