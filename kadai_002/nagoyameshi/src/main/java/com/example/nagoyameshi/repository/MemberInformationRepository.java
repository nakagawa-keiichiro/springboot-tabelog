package com.example.nagoyameshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nagoyameshi.entity.MemberInformation;

public interface MemberInformationRepository extends JpaRepository<MemberInformation, Integer> {

}
