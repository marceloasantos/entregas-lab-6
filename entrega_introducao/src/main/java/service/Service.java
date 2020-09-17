package service;

import model.PlanoDeVoo;

public interface Service {
    PlanoDeVoo cadastrarPlanoDeVoo(PlanoDeVoo planoDeVoo);
    PlanoDeVoo atualizarPlanoDeVoo(PlanoDeVoo planoDeVoo);
    PlanoDeVoo buscarPlanoDeVoo(Integer id);
    Boolean excluirPlanoDeVoo(Integer id);
}
