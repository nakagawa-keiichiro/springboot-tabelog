package com.example.nagoyameshi.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "member_information")
@Data
public class MemberInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "member_name")
    private String memberName;
    
    @Column(name = "mailaddress")
    private String mailaddress;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "age")
    private String age;
    
    @Column(name = "job")
    private String job;

    @Column(name = "registration_at", insertable = false, updatable = false)
    private Timestamp registrationAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private Timestamp updatedAt;
}
