package com.example.yarab.Controller;

import com.example.yarab.EntityEmp.EntityEmp;
import com.example.yarab.ServicesEmpl.SercicesEmpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/employe-api")

public class EmpController {
    private final SercicesEmpl sercicesEmpl;

    public EmpController(SercicesEmpl sercicesEmpl) {
        this.sercicesEmpl = sercicesEmpl;
    }
    @GetMapping
    public List<EntityEmp> GiveAllemp(){
        return sercicesEmpl.GiveAll();
    };
    @GetMapping("/{id}")
    public Optional<EntityEmp> GiveByIdemp(@PathVariable("id") Long id){
        return sercicesEmpl.GiveById(id);
    };
    @PostMapping
    public EntityEmp SaveEmpl(@RequestBody EntityEmp entityEmp){
        return sercicesEmpl.SaveEmp(entityEmp);
    };
    @PutMapping
    public EntityEmp ModifyEmpl(@RequestBody EntityEmp entityEmp){
        return sercicesEmpl.ModifyEmp(entityEmp);
    };
    @DeleteMapping("/{id}")
    public void DeleteEmpl(@PathVariable("id") Long id){
        sercicesEmpl.DeleteEmp(id);
    };
}
