package com.novianto.synrgy.chapter4.controller;

import com.novianto.synrgy.chapter4.entity.Karyawan;
import com.novianto.synrgy.chapter4.service.KaryawanService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
//@RequiredArgsConstructor
public class KaryawanController {

    @Autowired
    private KaryawanService karyawanService;

    @RequestMapping("/hello-world")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/profile")
    @ResponseBody
    public List<Karyawan> karyawan(){
        List<Karyawan> getKaryawan = karyawanService.getAllEmployees();
        return getKaryawan;
    }
}
