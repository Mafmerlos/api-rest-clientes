package com.apiRest.desenvolvendoMinhaApi.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String nome;


}
