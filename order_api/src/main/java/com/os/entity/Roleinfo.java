package com.os.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Roleinfo implements Serializable {

    private Integer roleid;

    private String rolename;

    private Set<Userinfo> userinfoSet;

}