package com.example.demoTest.student;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    //transformisacemo OPT<> u Upit= SELECT * FROM student WHERE email =?
    //Custom function that help us to fing user(student) by email
    ///We can construct  Query based on the method name
    //SELECT * FROM student WHERE email = ?

    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}

