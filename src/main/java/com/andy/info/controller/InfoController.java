package com.andy.info.controller;


import com.andy.info.model.Info;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/info")
public class InfoController {

    @GetMapping(value = "/")
    public Info getInfo(){

        Info info = new Info();
        info.setName("Andy");
        info.setAge("20");
        info.setAdditionalInfo("Additional Information");

        return info;
    }
}
