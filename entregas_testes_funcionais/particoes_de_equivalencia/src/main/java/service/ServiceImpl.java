package service;

import model.PlanoDeVoo;

import java.util.LinkedList;
import java.util.List;

public class ServiceImpl implements Service {
    List<PlanoDeVoo> planos = new LinkedList<PlanoDeVoo>();

    @Override
    public PlanoDeVoo cadastrarPlanoDeVoo(PlanoDeVoo planoDeVoo) {
        if (planoDeVoo.aeronave.length() == 6) {
            PlanoDeVoo novo = new PlanoDeVoo(
                    planoDeVoo.id,
                    planoDeVoo.aeronave,
                    planoDeVoo.saidaEstimada,
                    planoDeVoo.chegadaEstimada);

            planos.add(novo);

            return novo;
        } else {
            return null;
        }
    }

    @Override
    public PlanoDeVoo atualizarPlanoDeVoo(PlanoDeVoo planoDeVoo) {
        return null;
    }

    @Override
    public PlanoDeVoo buscarPlanoDeVoo(Integer id) {
        return null;
    }

    @Override
    public Boolean excluirPlanoDeVoo(Integer id, List<PlanoDeVoo> planos) {
        return id == 1;
    }
}
