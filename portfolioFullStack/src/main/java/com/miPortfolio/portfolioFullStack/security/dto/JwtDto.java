
package com.miPortfolio.portfolioFullStack.security.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Usuario
 */
public class JwtDto {
    
    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authoritys;
    
    //Constructor

    public JwtDto() {
    }

    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authoritys) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authoritys = authoritys;
    }
    
    //Getters y Setters

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthoritys() {
        return authoritys;
    }

    public void setAuthoritys(Collection<? extends GrantedAuthority> authoritys) {
        this.authoritys = authoritys;
    }
    
    
    
    
    
}
