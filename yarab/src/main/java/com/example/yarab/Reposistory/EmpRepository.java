package com.example.yarab.Reposistory;

import com.example.yarab.EntityEmp.EntityEmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EntityEmp,Long> {
}
