package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor   //contrutor com todos atributos
@Builder            //ele traz o componente sacola buider
@Data              //pega todos gets e sets
@Entity           //para entender que a classe é de banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"}) //ignora alguns erro json
@NoArgsConstructor      //construtor sem argumentos
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private double valorUnitario;
    @Builder.Default // define o default do metodos em true devido a proxima linha
    private Boolean disponivel = true;
    @ManyToOne
    @JsonIgnore
    private Restaurante restaurante;
}
