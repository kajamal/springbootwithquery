package com.example.crudprocess.StudentRepo;

import com.example.crudprocess.Entity.Studentattendanceenitity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentattendancerepo extends JpaRepository<Studentattendanceenitity,Integer> {
}
