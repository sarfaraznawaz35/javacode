package com.libapi.repository;

import com.libapi.entity.CreditInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditInfoRepo extends JpaRepository<CreditInfo, Integer> {



}
