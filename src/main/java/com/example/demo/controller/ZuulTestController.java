package com.example.demo.controller;

import com.example.demo.api.ZuulTestApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulTestController implements ZuulTestApi {

    @Override
    public String test() {
        return "this is fcs-serverone test api" + this.getClass();
    }
}