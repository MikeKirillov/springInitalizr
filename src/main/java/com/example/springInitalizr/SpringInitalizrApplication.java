package com.example.springInitalizr;

import com.example.springInitalizr.model.ModelClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringInitalizrApplication {
    List<ModelClass> modelList = new ArrayList<>();

    /*
        creating model
    */
    @RequestMapping(value = "/model/set", method = RequestMethod.POST)
    public ModelClass setModel(@RequestBody ModelClass model) {
        modelList.add(model);
        return model;// just to check it's created
    }

    /*
        getting models
    */
    @RequestMapping(value = "/model/list", method = RequestMethod.GET)
    public List<ModelClass> getModels() {
        return modelList;
    }

    /*
        getting model by id
    */
    @RequestMapping(value = "/model/{id}", method = RequestMethod.GET)
    public ResponseEntity<ModelClass> getModelById(@PathVariable int id) {
        for (ModelClass model : modelList) {
            if (model.getId() == id) {
                return ResponseEntity.ok(model);
            } /*else return ResponseEntity.notFound().build();*/
        }
        return null;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringInitalizrApplication.class, args);
    }
}
