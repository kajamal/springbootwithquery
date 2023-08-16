package com.example.crudprocess.Controller;

import com.example.crudprocess.Entity.StudentEntity;
import com.example.crudprocess.Entity.StudentPersonaldetails;
import com.example.crudprocess.Entity.Studentattendanceenitity;
import com.example.crudprocess.Service.StudentService;
import com.example.crudprocess.StudentRepo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

@Autowired
    private Studentrepo studentrepo;

    @PostMapping("/Student")
    public List<StudentEntity> poststu(@RequestBody List<StudentEntity> studentEntity){
        return studentService.poststudentdetails(studentEntity);
    }

    @PostMapping("/personaldetails")
    public List<StudentPersonaldetails> postpersonal(@RequestBody List<StudentPersonaldetails> studentPersonaldetails){
        return studentService.postpersonaldetails(studentPersonaldetails);
    }

    @PostMapping("/attendancedetails")
    public List<Studentattendanceenitity> postaddpercentage(@RequestBody List<Studentattendanceenitity> studentattendanceenitity){
        return studentService.postattendancedetails(studentattendanceenitity);
    }

    @GetMapping("/student-info")
    public List<Object[]> getStudentInfo() {
        return studentrepo.getStudentInfoWithAttendance();
    }
}
