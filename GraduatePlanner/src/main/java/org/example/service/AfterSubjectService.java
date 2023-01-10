package org.example.service;

import org.example.dto.AfterSubjectDto;
import org.example.dto.RegisterDto;
import org.example.dto.RequireDto;
import org.springframework.stereotype.Service;

@Service
public interface AfterSubjectService {
    RequireDto getAllRequire(Long id);

    AfterSubjectDto getAfterSubject(String type, Long id, Long department_id);
}
