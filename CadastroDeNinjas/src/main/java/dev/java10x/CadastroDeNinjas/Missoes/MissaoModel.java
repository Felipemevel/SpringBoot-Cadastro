package dev.java10x.CadastroDeNinjas.Missoes;


import dev.java10x.CadastroDeNinjas.Missoes.Dificuldades.Dificuldade;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="tb_missoes")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Dificuldade dificuldade;
    @OneToMany(mappedBy = "missaoVinculada")
    private List<NinjaModel> ninjasVinculados;
}
