package com.bodyguard.mybank.userpass.controller;

import com.bodyguard.mybank.userpass.dto.GoldDTO;
import com.bodyguard.mybank.userpass.security.Constants;
import com.bodyguard.mybank.userpass.service.GoldService;
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
@RequestMapping("/gold")
public class GoldController {
    @Autowired
    private GoldService goldService;

    @GetMapping(value = "/getAllGold")
    @PreAuthorize("hasAuthority('" + Constants.GOLD_GET_ALL + "')")
    public ResponseEntity<List<GoldDTO>> getAllGold() {
        return ResponseEntity.status(HttpStatus.OK).body(goldService.getAllGold());
    }

    @DeleteMapping(value = "/{goldStockId}")
    @PreAuthorize("hasAuthority('" + Constants.GOLD_DELETE + "')")
    public ResponseEntity<String> deleteGoldRecord(@PathVariable("goldStockId") Integer goldStockId) {
        goldService.deleteGoldById(goldStockId);
        return ResponseEntity.status(HttpStatus.OK).body("Gold stock deleted successfully");
    }
}
