package com.example.demo.controller;

import com.example.demo.api.RibbonTestApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonTestController implements RibbonTestApi {

    @Override
    public String test() {
        return "this is fcs-serverone test api";
    }
}