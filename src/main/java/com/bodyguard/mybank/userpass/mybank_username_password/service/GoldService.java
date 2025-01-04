package com.bodyguard.mybank.userpass.mybank_username_password.service;

import com.bodyguard.mybank.userpass.mybank_username_password.dto.GoldDTO;
import com.bodyguard.mybank.userpass.mybank_username_password.entity.GoldEntity;
import com.bodyguard.mybank.userpass.mybank_username_password.repository.GoldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoldService {

    @Autowired
    private GoldRepository goldRepository;

    public List<GoldDTO> getAllGold() {
         List<GoldEntity> goldEntities = goldRepository.findAll();
         return goldEntities.stream().map(GoldDTO::new).collect(Collectors.toList());
    }

    public void deleteGoldById(Integer goldId) {
        goldRepository.deleteById(goldId);
    }
}
