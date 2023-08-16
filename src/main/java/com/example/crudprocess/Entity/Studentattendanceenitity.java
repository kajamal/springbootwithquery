package com.example.crudprocess.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Attendance")
public class Studentattendanceenitity {

    @Id
    @Column(name = "std_id")
    @GeneratedValue
    private int id;
    @Column(name = "Student_name")
    private String studentname;
    @Column(name = "attendancepercentage")
    private String attendancepercent;
}
