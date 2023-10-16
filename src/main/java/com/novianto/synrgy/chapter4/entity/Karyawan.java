package com.novianto.synrgy.chapter4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Karyawan {
    private int id;
    private String name;
    private String dob;
    private String address;
}
