import model.PlanoDeVoo;
import org.junit.Assert;
import org.junit.Test;
import service.ServiceImpl;

import java.util.LinkedList;
import java.util.List;

public class ApplicationTest {
    ServiceImpl service = new ServiceImpl();

    @Test
    public void deveCadastrarComSucesso() {
        PlanoDeVoo planoDeVoo = new PlanoDeVoo(1, "JET100", 1120, 1620);
        var planoDeVooCadastrado = service.cadastrarPlanoDeVoo(planoDeVoo);

        Assert.assertEquals(planoDeVoo.id, planoDeVooCadastrado.id);
    }

    @Test
    public void deveExcluirPlanoDeVoo() {
        List<PlanoDeVoo> planos = new LinkedList<PlanoDeVoo>();
        planos.add(new PlanoDeVoo(1, "JET100", 1120, 1620));
        planos.add(new PlanoDeVoo(2, "JET200", 1140, 1640));

        var isDeleted = service.excluirPlanoDeVoo(1, planos);

        Assert.assertEquals(true, isDeleted);
    }
}
