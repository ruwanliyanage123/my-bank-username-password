package com.bodyguard.mybank.userpass.service;

import com.bodyguard.mybank.userpass.dto.LoanDTO;
import com.bodyguard.mybank.userpass.entity.LoanEntity;
import com.bodyguard.mybank.userpass.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public List<LoanDTO> getAllLoans() {
         List<LoanEntity> loanEntityList = loanRepository.findAll();
         return loanEntityList.stream().map(LoanDTO::new).collect(Collectors.toList());
    }

    public void deleteLoanById(Integer loanId) {
        loanRepository.deleteById(loanId);
    }
}
