package com.example.happynoteday.entity;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class BVTDiaryEntity {

    private Integer id;

    private String title;

    private String firstPiecture;

    private String content;

    private String description;

    private Date createTime;

    private Date updateTime;


}
