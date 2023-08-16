package com.example.crudprocess.StudentRepo;

import com.example.crudprocess.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Studentrepo extends JpaRepository<StudentEntity,Integer> {
    @Query(value = "SELECT s.std_id, s.stu_name, s.stu_mailid, pi.stu_number, pi.student_address, a.attendancepercentage " +
            "FROM student s " +
            "JOIN student_personalinfo pi ON s.std_id = pi.std_id " +
            "JOIN attendance a ON s.std_id = a.std_id",nativeQuery = true)
    List<Object[]> getStudentInfoWithAttendance();
}

