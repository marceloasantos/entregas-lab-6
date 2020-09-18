package service;

import model.PlanoDeVoo;

import java.util.LinkedList;
import java.util.List;

public class ServiceImpl implements Service {
    @Override
    public PlanoDeVoo cadastrarPlanoDeVoo(PlanoDeVoo planoDeVoo) {
        PlanoDeVoo novo = new PlanoDeVoo(
                planoDeVoo.id,
                planoDeVoo.aeronave,
                planoDeVoo.saidaEstimada,
                planoDeVoo.chegadaEstimada);

        return novo;
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
        for (PlanoDeVoo plano: planos) {
            if (plano.id == id) {
                planos.remove(plano);

                return true;
            }
        }

        return false;
    }
}
