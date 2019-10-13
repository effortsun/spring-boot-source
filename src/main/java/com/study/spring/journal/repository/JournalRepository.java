package com.study.spring.journal.repository;

import com.study.spring.journal.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository  extends JpaRepository<Journal, Long> {

}
