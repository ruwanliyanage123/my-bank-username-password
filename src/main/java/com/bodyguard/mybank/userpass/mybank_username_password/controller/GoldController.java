package com.bodyguard.mybank.userpass.mybank_username_password.controller;

import com.bodyguard.mybank.userpass.mybank_username_password.dto.GoldDTO;
import com.bodyguard.mybank.userpass.mybank_username_password.dto.LoanDTO;
import com.bodyguard.mybank.userpass.mybank_username_password.service.GoldService;
import com.bodyguard.mybank.userpass.mybank_username_password.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gold")
public class GoldController {
    @Autowired
    private GoldService goldService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<GoldDTO>> getAllGold() {
        return ResponseEntity.status(HttpStatus.OK).body(goldService.getAllGold());
    }

    @DeleteMapping(value = "/{goldStockId}")
    public ResponseEntity<String> deleteGoldRecord(@PathVariable("goldStockId") Integer goldStockId) {
        goldService.deleteGoldById(goldStockId);
        return ResponseEntity.status(HttpStatus.OK).body("Gold stock deleted successfully");
    }
}
