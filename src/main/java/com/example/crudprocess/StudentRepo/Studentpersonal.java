package com.example.crudprocess.StudentRepo;

import com.example.crudprocess.Entity.StudentPersonaldetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentpersonal extends JpaRepository<StudentPersonaldetails,Integer> {
}
