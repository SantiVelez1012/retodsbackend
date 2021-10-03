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

    @Column(name="nombre_usuario")
    private String nombre_usuario;

    private String password;

    @Column(name="nombre_completo")
    private String nombre_completo;

    private String ciudad;

    private String pais;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
    private Integer idRol;



    public Integer getId() {
        return id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Integer getIdRol() {
        return idRol;
    }
}