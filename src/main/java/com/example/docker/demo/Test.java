package com.example.docker.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("test")
public class Test implements Serializable {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
}
