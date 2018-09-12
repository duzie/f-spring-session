package com.f.spring.session.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class IndexController {

    @GetMapping("v")
    public String set(String v, HttpSession session) {
        session.setAttribute("v", v);
        return v;
    }

    @GetMapping
    public String get(HttpSession session) {
        return (String) session.getAttribute("v");
    }

}
