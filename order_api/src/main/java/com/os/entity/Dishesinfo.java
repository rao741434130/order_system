package com.os.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dishesinfo implements Serializable {
    private Integer dishesid;

    private String dishesname;

    private String dishesdiscript;

    private String dishesimg;

    private String dishestxt;

    private Integer recommend;

    private String dishesprice;
}