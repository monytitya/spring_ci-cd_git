package com.payu.CatalogueManagement.repository;

import com.payu.CatalogueManagement.entity.BorrowerRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowerRecordRepository extends JpaRepository<BorrowerRecord, Long> {
}
