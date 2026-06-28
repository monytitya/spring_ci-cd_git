package com.payu.CatalogueManagement.repository;

import com.payu.CatalogueManagement.entity.BookReturnRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookReturnRecordRepository extends JpaRepository<BookReturnRecord, Long> {
}
