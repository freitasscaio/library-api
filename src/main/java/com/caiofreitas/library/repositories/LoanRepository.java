package com.caiofreitas.library.repositories;

import com.caiofreitas.library.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
