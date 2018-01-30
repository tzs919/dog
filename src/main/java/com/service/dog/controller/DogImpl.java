package com.service.dog.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-30T12:45:39.945Z")

@RestSchema(schemaId = "dog")
@RequestMapping(path = "/dog", produces = MediaType.APPLICATION_JSON)
public class DogImpl {

    @Autowired
    private DogDelegate userDogDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDogDelegate.helloworld(name);
    }

}
