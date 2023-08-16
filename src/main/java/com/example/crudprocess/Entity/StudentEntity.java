package com.example.crudprocess.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    @Column(name = "std_id")
    @GeneratedValue
    private int id;
    @Column(name = "stu_name")
    private String studentname;

    @Column(name = "stu_mark")
    private int studentmark;

    @Column(name = "stu_mailid")
    private String studentemailid;


}

