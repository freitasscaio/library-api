package com.caiofreitas.library;

import com.caiofreitas.library.models.Loan;
import com.caiofreitas.library.models.LoanStatus;

import java.time.LocalDate;

public class LoanManualTest {

    public static void main(String[] args) {

        LocalDate prazo = LocalDate.of(2026, 11, 30);
        LocalDate devolucao = LocalDate.of(2026, 12, 3);

        Loan loan1 = new Loan(LoanStatus.RETURNED, devolucao, prazo, "Maria",
                LocalDate.of(2026, 11, 23), null, null);

        System.out.println("Caso 1 (esperado 6.0): " + loan1.calculateFine());

        LocalDate prazo1 = LocalDate.of(2026, 11, 30);
        LocalDate devolucao1 = LocalDate.of(2026, 11, 28);

        Loan loan2 = new Loan(LoanStatus.RETURNED, devolucao1, prazo1, "Maria",
                LocalDate.of(2026, 11, 23), null, null);

        System.out.println("Caso 2 (esperado 0.0): " + loan2.calculateFine());

        LocalDate prazo2 = LocalDate.of(2026, 11, 30);
        LocalDate devolucao2 = LocalDate.of(2026, 11, 30);

        Loan loan3 = new Loan(LoanStatus.RETURNED, devolucao2, prazo2, "Maria",
                LocalDate.of(2026, 11, 23), null, null);

        System.out.println("Caso 3 (esperado 0.0): " + loan3.calculateFine());

    }

}
