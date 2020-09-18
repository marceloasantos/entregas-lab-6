package service;

import model.PlanoDeVoo;

import java.util.List;

public interface Service {
    PlanoDeVoo cadastrarPlanoDeVoo(PlanoDeVoo planoDeVoo);
    PlanoDeVoo atualizarPlanoDeVoo(PlanoDeVoo planoDeVoo);
    PlanoDeVoo buscarPlanoDeVoo(Integer id);
    Boolean excluirPlanoDeVoo(Integer id, List<PlanoDeVoo> planos);
}
