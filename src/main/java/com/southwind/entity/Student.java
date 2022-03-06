package com.southwind.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-05 21:54
 */

@Data
public class Student {
    private Long id;
    private String name;
    private Double score;
    private Date birthday;


}
