package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-10-16T09:51:57.962Z")

@RestSchema(schemaId = "project29cm")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project29cmImpl {

    @Autowired
    private Project29cmDelegate userProject29cmDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject29cmDelegate.helloworld(name);
    }

}
