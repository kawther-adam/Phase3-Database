package com.phase3.phase.three.view;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Login")
@RequiredArgsConstructor
public class Login {

    @PostMapping("")
    public String checkLogin(@RequestParam String email,
                             @RequestParam String password){
        if (email.equals("kawtheradam63@gmail.com")& password.equals("Pass3")){
            return "redirect:/product";
        }
        return "product";
    }
}

