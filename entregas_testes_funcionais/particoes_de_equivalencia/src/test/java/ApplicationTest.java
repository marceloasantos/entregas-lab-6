import model.PlanoDeVoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import service.Service;
import service.ServiceImpl;

import java.util.LinkedList;
import java.util.List;

public class ApplicationTest {
    @InjectMocks
    Service service = new ServiceImpl();

    @Test
    public void testDeveCadastrarComSucesso() {
        PlanoDeVoo planoDeVoo = new PlanoDeVoo(1, "JET100", 1120, 1620);
        var planoDeVooCadastrado = service.cadastrarPlanoDeVoo(planoDeVoo);

        Assertions.assertEquals(planoDeVoo.id, planoDeVooCadastrado.id);
    }

    @Test
    public void testNaoDeveCadastrarVooComNomeMenorQueSeisCaracteres() {
        PlanoDeVoo planoDeVoo = new PlanoDeVoo(1, "JET1", 1120, 1620);
        var planoDeVooCadastrado = service.cadastrarPlanoDeVoo(planoDeVoo);

        Assertions.assertNull(planoDeVooCadastrado);
    }

    @Test
    public void testNaoDeveCadastrarVooComNomeMaiorQueSeisCaracteres() {
        PlanoDeVoo planoDeVoo = new PlanoDeVoo(1, "JET100000", 1120, 1620);
        var planoDeVooCadastrado = service.cadastrarPlanoDeVoo(planoDeVoo);

        Assertions.assertNull(planoDeVooCadastrado);
    }

    @Test
    public void testDeveExcluirPlanoDeVoo() {
        List<PlanoDeVoo> planos = new LinkedList<PlanoDeVoo>();
        planos.add(new PlanoDeVoo(1, "JET100", 1120, 1620));
        planos.add(new PlanoDeVoo(2, "JET200", 1140, 1640));

        var isDeleted = service.excluirPlanoDeVoo(1, planos);

        Assertions.assertTrue(isDeleted);
    }
}
