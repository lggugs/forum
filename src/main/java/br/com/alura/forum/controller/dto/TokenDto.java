/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura.forum.controller.dto;

/**
 *
 * @author Luis
 */
public class TokenDto {

    private final String token;
    private final String tipo;

    
    public TokenDto(String token, String tipo) {
        this.token = token;
        this.tipo = tipo;
        
    }   

    public String getToken() {
        return token;
    }

    public String getTipo() {
        return tipo;
    }
}
