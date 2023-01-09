package org.example.repository;

import org.example.domain.Subject;
import org.springframework.stereotype.Repository;
@Repository
public interface SubjectMapper {
    void create(Subject subject);
}
