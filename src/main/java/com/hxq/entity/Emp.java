package com.hxq.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Emp {
    private String id;
    private String name;
    private String path;
    private Double salary;
    private Integer age;
}
