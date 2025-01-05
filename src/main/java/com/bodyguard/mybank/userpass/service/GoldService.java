package com.bodyguard.mybank.userpass.service;

import com.bodyguard.mybank.userpass.dto.GoldDTO;
import com.bodyguard.mybank.userpass.entity.GoldEntity;
import com.bodyguard.mybank.userpass.repository.GoldRepository;
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
