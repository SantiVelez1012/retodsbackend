package com.rdai.data.models;

import com.rdai.data.models.entities.UsuarioEntity;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class MainUsuario implements UserDetails {

    private String nombreUsuario;
    private String password;
    private String ciudad;
    private String pais;
    private String rol;
    private Collection<? extends GrantedAuthority> authorities;

    public static MainUsuario build(UsuarioEntity usuarioEntity){


        return null;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }

    @Override
    public boolean isAccountNonLocked(){
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }

    @Override
    public boolean isEnabled(){
        return true;
    }

    @Override
    public boolean isAccountNonExpired(){
        return true;
    }



}
