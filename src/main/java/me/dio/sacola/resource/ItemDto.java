package me.dio.sacola.resource;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor   //contrutor com todos atributos
@Builder            //ele traz o componente sacola buider
@Data              //pega todos gets e sets
@Embeddable        // classe faz parte de outra e nao sera usada em banco de dados reaproveitamento de codigo
@NoArgsConstructor      //construtor sem argumentos
public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long idSacola;
}
