package com.bodyguard.mybank.userpass.controller;

import com.bodyguard.mybank.userpass.dto.LoanDTO;
import com.bodyguard.mybank.userpass.security.Constants;
import com.bodyguard.mybank.userpass.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping(value = "/getAllLoans")
    @PreAuthorize("hasAuthority('" + Constants.LOAN_GET_ALL + "')")
    public ResponseEntity<List<LoanDTO>> getAllLoans() {
        return ResponseEntity.status(HttpStatus.OK).body(loanService.getAllLoans());
    }

    @DeleteMapping(value = "/{loanId}")
    @PreAuthorize("hasAuthority('" + Constants.LOAN_DELETE + "')")
    public ResponseEntity<String> deleteAllLoans(@PathVariable("loanId") Integer loanId) {
        loanService.deleteLoanById(loanId);
        return ResponseEntity.status(HttpStatus.OK).body("Loan deleted successfully");
    }
}
