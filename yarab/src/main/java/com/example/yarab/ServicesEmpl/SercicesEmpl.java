package com.example.yarab.ServicesEmpl;

import com.example.yarab.EntityEmp.EntityEmp;

import java.util.List;
import java.util.Optional;

public interface SercicesEmpl {
    List<EntityEmp> GiveAll();
    Optional<EntityEmp> GiveById(Long id);
    EntityEmp SaveEmp(EntityEmp entityEmp);
    EntityEmp ModifyEmp(EntityEmp entityEmp);
    void DeleteEmp(Long id);
}
