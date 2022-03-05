package com.southwind.entity;

import lombok.AllArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-05 23:27
 */
public class User {
    @NotNull(message = "id不能为空")
    private Long id;
    @NotEmpty(message = "姓名不能为空")
    @Length(min = 2,message = "姓名长度不能小于2位")
    private String name;
    @Min(value = 60,message = "成绩必须大于60分")
    private double score;

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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public User(@NotNull(message = "id不能为空") Long id, @NotEmpty(message = "姓名不能为空") @Length(min = 2, message = "姓名长度不能小于2位") String name, @Min(value = 60, message = "成绩必须大于60分") double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public User() {
    }
}
