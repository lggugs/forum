/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author Luis Lima
 */
@org.springframework.stereotype.Controller
public class Controller {
 
    @RequestMapping("/")
    @ResponseBody
    public String helllo(){
        return "Hello World Teste!";
    }
}
