package com.example.springInitalizr.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyModelClass {
/*
    some name
*/
    private String name;
/*
    some count
*/
    private Integer count;
/*
    some attribute list
*/
    private List<String> attributes;
}
