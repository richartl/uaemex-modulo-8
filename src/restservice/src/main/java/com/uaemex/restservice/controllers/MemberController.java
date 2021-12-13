/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uaemex.restservice.controllers;

import com.uaemex.restservice.dao.Member;
import com.uaemex.restservice.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author richartl
 */

@Controller
@RequestMapping(path="/members")
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;
    
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewMember (@RequestParam String name
      , @RequestParam String email, @RequestParam String lastName,
      @RequestParam String phone) {

        Member n = new Member();
        n.setName(name);
        n.setLastName(lastName);
        n.setEmail(email);
        n.setPhone(phone);
        memberRepository.save(n);
        return "Saved";
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Member> getAllUsers() {
        return memberRepository.findAll();
    }
}
