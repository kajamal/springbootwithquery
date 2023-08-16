package com.example.crudprocess.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "StudentPersonalinfo")
public class StudentPersonaldetails {
    @Id
    @Column(name = "std_id")
    @GeneratedValue
    private int id;
    @Column(name = "Student_name")
    private String studentname;
    @Column(name = "Student_address")
    private String studentaddress;
    @Column(name = "Stu_number")
    private String studentphonenumber;
}
