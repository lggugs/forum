package br.com.alura.forum.config.security;

import br.com.alura.forum.model.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luis
 */
@Service
public class TokenService {
    /*
        Para injetar uma propriedade do arquivo application.properties, 
        devemos utilizar a anotação @Value
    */
    @Value("${forum.jwt.expiration}")
    private String expiration;
    
    @Value("${forum.jwt.secret}")
    private String secret;
    
    public String gerarToken(Authentication authentication) {
        Usuario logado = (Usuario) authentication.getPrincipal();  
        Date hoje = new Date();
        Date dataExpirracao = new Date(hoje.getTime() + Long.parseLong(expiration));
        return Jwts.builder()
                .setIssuer("API do Fórum da Alura")
                .setSubject(logado.getId().toString())
                .setIssuedAt(hoje)
                .setExpiration(dataExpirracao)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
    
}
