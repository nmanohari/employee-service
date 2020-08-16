package com.mypack.employee.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee")
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "empnum")
    private Long empNum;
    @Column(name = "empName")
    private String empName;
    @Column(name = "job")
    private String job;
    @Column(name = "salary")
    private Long salary;
    @Column(name = "depNo")
    private Long depNo;
    @Column(name = "commision")
    private Long commision;
    @Column(name = "hireDate")
    private Date hireDate;
    @Column(name = "mgrId")
    private Long mgrId;

}
