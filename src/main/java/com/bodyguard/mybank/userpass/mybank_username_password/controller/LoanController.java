package com.bodyguard.mybank.userpass.mybank_username_password.controller;

import com.bodyguard.mybank.userpass.mybank_username_password.dto.LoanDTO;
import com.bodyguard.mybank.userpass.mybank_username_password.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<LoanDTO>> getAllLoans() {
        return ResponseEntity.status(HttpStatus.OK).body(loanService.getAllLoans());
    }
}
