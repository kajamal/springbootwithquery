package com.example.crudprocess.Service;

import com.example.crudprocess.Entity.StudentEntity;
import com.example.crudprocess.Entity.StudentPersonaldetails;
import com.example.crudprocess.Entity.Studentattendanceenitity;
import com.example.crudprocess.StudentRepo.Studentattendancerepo;
import com.example.crudprocess.StudentRepo.Studentpersonal;
import com.example.crudprocess.StudentRepo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private Studentrepo studentrepo;

    @Autowired
    private Studentpersonal studentpersonal;

    @Autowired
    private Studentattendancerepo studentattendancerepo;

    public List<StudentEntity> poststudentdetails(List<StudentEntity> studentEntity) {
        return  studentrepo.saveAll(studentEntity);

    }
    public List<StudentPersonaldetails> postpersonaldetails(List<StudentPersonaldetails> studentPersonaldetails) {
        return  studentpersonal.saveAll(studentPersonaldetails);

    }
     public List<Studentattendanceenitity> postattendancedetails(List<Studentattendanceenitity> studentattendanceenitity){
        return  studentattendancerepo.saveAll(studentattendanceenitity);
     }


}
