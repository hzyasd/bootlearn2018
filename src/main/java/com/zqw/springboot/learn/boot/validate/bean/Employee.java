package com.zqw.springboot.learn.boot.validate.bean;

import com.zqw.springboot.learn.boot.validate.custom.CarNoConstraint;
import com.zqw.springboot.learn.boot.validate.custom.Sex;
import com.zqw.springboot.learn.boot.validate.custom.SexConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Slf4j
public class Employee {
    @Max(value=5,message = "最大5")
    @Min(value = 3, message = "最小3")
    private Integer id;
    @Size(min=3,max=5, message = "介于3到5")
    private String name;
    @SexConstraint
    private Sex sex;

    @CarNoConstraint
    private String carNo;

    public Employee( Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
    }


}
