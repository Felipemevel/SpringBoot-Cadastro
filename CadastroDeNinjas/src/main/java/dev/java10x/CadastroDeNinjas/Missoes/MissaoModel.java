package dev.java10x.CadastroDeNinjas.Missoes;


import dev.java10x.CadastroDeNinjas.Missoes.Dificuldades.Dificuldade;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (unique = true)
    private String titulo;
    private Dificuldade dificuldade;
    @OneToMany(mappedBy = "missaoVinculada")
    private List<NinjaModel> ninjasVinculados;
}
