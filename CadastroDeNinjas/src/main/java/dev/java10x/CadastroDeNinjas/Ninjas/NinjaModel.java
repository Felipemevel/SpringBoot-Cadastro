package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column (unique = true)
    private String email;

    @Column (name ="img_url")
    private int idade;

    @Column (name = "img_url")
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "missoes_id") // Chave Estrangeira
    private MissaoModel missaoVinculada;

}
