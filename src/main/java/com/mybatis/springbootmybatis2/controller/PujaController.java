package com.mybatis.springbootmybatis2.controller;

import com.mybatis.springbootmybatis2.mapper.PujaMapper;
import com.mybatis.springbootmybatis2.model.Puja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pujas")
public class PujaController {

    @Autowired
    private PujaMapper pujaMapper;

    @GetMapping("/all")
    public List<Puja> getAllPujas() {
        try {
            return pujaMapper.getAllPujas();
        }catch (Exception exception){
            System.out.println(exception);
            return null;
        }
    }

    @GetMapping("/{id}")
    public Puja getPujaById(@PathVariable Integer id) {
        return pujaMapper.getPujaById(id);
    }

    @PostMapping("/add")
    public int addPuja(@RequestBody Puja puja) {
        return pujaMapper.insertPuja(puja);
    }

    @PutMapping("/update")
    public int updatePuja(@RequestBody Puja puja) {
        return pujaMapper.updatePuja(puja);
    }

    @DeleteMapping("/delete/{id}")
    public int deletePuja(@PathVariable Integer id) {
        return pujaMapper.deletePuja(id);
    }
}
