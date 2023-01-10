package org.example.repository;

import org.example.dto.RequireDto;
import org.springframework.stereotype.Repository;

@Repository
public interface AfterSubjectMapper {
    RequireDto getRequire(Long department_id);
}
