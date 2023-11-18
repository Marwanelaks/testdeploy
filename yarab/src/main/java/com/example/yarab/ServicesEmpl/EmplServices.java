package com.example.yarab.ServicesEmpl;

import com.example.yarab.EntityEmp.EntityEmp;
import com.example.yarab.Reposistory.EmpRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmplServices implements SercicesEmpl {
//    @Value("C:/Users/User/Desktop/Oraiimo/employee-management-master/src/upload")
//    private String uploadDir;
    private final EmpRepository empRepository;

    public EmplServices(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    @Override
    public List<EntityEmp> GiveAll() {
        return empRepository.findAll();
    }

    @Override
    public Optional<EntityEmp> GiveById(Long id) {
        return empRepository.findById(id);
    }

    @Override
    public EntityEmp SaveEmp(EntityEmp entityEmp) {
        return empRepository.save(entityEmp);
    }

    @Override
    public EntityEmp ModifyEmp(EntityEmp entityEmp) {
        return empRepository.save(entityEmp);
    }

    @Override
    public void DeleteEmp(Long id) {
        empRepository.deleteById(id);
    }
}
