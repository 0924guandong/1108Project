package com.qf.controller;

import com.qf.Dao.MotifDao;
import com.qf.domain.Motif;
import com.qf.service.MotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MotifController {

    @Autowired
    private MotifService motifService;


    @GetMapping("findAll")
    public List<Motif>  findAll(){

        List<Motif> all = motifService.findAll();

        return all;
    }

}
