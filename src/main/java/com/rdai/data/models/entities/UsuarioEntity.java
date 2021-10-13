package com.rdai.data.models.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="nombre_usuario", unique = true)
    private String nombreUsuario;

    private String password;

    @Column(name="nombre_completo")
    private String nombreCompleto;

    private String ciudad;

    private String pais;


    @JoinColumn(name="fk_rol")
    @ManyToOne
    private RolEntity rol;

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public RolEntity getRol() {
        return rol;
    }
}