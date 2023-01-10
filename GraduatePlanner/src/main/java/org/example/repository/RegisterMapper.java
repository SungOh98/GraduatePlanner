package org.example.repository;

import org.example.domain.Register;
import org.example.dto.RegisterDto;
import org.springframework.stereotype.Repository;


@Repository
public interface RegisterMapper {

    void register(Register register);

    RegisterDto getAllType(Long id);
}
