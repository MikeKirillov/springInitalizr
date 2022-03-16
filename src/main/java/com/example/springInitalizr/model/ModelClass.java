package com.example.springInitalizr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModelClass {
/*
    some id
*/
    @JsonProperty("id")
    private int id;
/*
    some name
*/
    @JsonProperty("name")
    private String name;
/*
    some count
*/
    @JsonProperty("count")
    private int count;
/*
    some attribute list
*/
/*
    @JsonProperty("attributes")
    private List<String> attributes;
*/
}
