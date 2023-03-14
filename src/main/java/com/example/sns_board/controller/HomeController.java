package com.example.sns_board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //기본페이지 요청 메서드
    @GetMapping("/")
    public String index(){ //요청이왔을때 template라는 index.html을 찾아감.
        return "index";
    }



}
