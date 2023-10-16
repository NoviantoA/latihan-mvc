package com.novianto.synrgy.chapter4.service.impl;

import com.novianto.synrgy.chapter4.entity.Karyawan;
import com.novianto.synrgy.chapter4.service.KaryawanService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KaryawanServiceImpl implements KaryawanService {

    @Override
    public List<Karyawan> getAllEmployees() {
        List<Karyawan> karyawanList = new ArrayList<>();

        Karyawan karyawan = new Karyawan();
        karyawan.setId(1);
        karyawan.setName("Novianto");
        karyawan.setDob("28 November 2000");
        karyawan.setAddress("Surabaya");

        karyawanList.add(karyawan);

        return karyawanList;
    }
}
