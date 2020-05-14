package com.xj.springbootnew.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {
    @JsonIgnore//使用后指定不返回的字段
    private Long id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
   // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date cntryDate;

    public User(Long id, String name, Date cntryDate) {
        this.id = id;
        this.name = name;
        this.cntryDate = cntryDate;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCntryDate() {
        return cntryDate;
    }

    public void setCntryDate(Date cntryDate) {
        this.cntryDate = cntryDate;
    }
}
