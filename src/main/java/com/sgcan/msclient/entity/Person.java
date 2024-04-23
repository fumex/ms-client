package com.sgcan.msclient.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends  BaseEntity{
    private String name;
    private String address;
    private String phone;
    private String email;
    private String numDocument;
}
