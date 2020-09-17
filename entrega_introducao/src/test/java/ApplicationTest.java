import model.PlanoDeVoo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import service.Service;

import java.util.LinkedList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {
    Service service;

    @Test
    public void deveCadastrarComSucesso() {
        service = Mockito.mock(Service.class);
        PlanoDeVoo planoDeVoo = new PlanoDeVoo(1, "JET100", 1120, 1620);
        var planoDeVooCadastrado = service.cadastrarPlanoDeVoo(planoDeVoo);

        Assert.assertEquals(planoDeVoo, planoDeVooCadastrado);
    }

    @Test
    public void deveExcluirPlanoDeVoo() {
        service = Mockito.mock(Service.class);
        var isDeleted = service.excluirPlanoDeVoo(1);

        Assert.assertEquals(isDeleted, true);
    }
}
