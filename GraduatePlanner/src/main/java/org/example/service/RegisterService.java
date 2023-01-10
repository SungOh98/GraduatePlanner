package org.example.service;

import org.example.dto.RegiDto;
import org.example.dto.RegisterDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegisterService {

    void register(RegiDto regiDto);

    RegisterDto findAllSubject(Long id);

    RegisterDto findSubjectByType(Long id, String type);
}
