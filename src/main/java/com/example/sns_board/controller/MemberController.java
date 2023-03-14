package com.example.sns_board.controller;

import com.example.sns_board.dto.MemberDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MemberController {
    @GetMapping("/member/login")
    public String loginForm(){
        return "login";
    }
    @GetMapping("/member/signup")
    public String signupForm(){
        return "signup";
    }
    @PostMapping("/member/signup")
//RequestParam을이용해서 받아온"memberEmail"라는이름의 값을 memberEmail에넣어준다
    public String signup(@ModelAttribute MemberDTO memberDTO){
        System.out.println("memberController.save");
        return null;
    }



}
