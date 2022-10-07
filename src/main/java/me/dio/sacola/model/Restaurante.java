package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor   //contrutor com todos atributos
@Builder            //ele traz o componente sacola buider
@Data              //pega todos gets e sets
@Entity           //para entender que a classe é de banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"}) //ignora alguns erro json
@NoArgsConstructor      //construtor sem argumentos
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> cardapio;
    @Embedded
    private  Endereco  endereco;
}
