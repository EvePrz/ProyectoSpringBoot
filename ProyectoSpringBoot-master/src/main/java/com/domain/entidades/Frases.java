package com.domain.entidades;

import lombok.Data;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Frases {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true, nullable = false)
   private  Long idFrase;
    @Column(name = "textoFrase", nullable = false, length = 500)
    private String textoFrase;
    @Column(name = "autorFrase", nullable = false, length = 100)
    private String autorFrase;

}
