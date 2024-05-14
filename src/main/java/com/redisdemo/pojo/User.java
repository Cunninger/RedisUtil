package com.redisdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 功能：
 * 日期：2024/5/13 下午8:12
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class User {
    private String name;
    private String password;
}