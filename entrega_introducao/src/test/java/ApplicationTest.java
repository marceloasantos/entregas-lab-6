import model.PlanoDeVoo;
import org.junit.Assert;
import org.junit.Test;
import service.ServiceImpl;

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
        var isDeleted = service.excluirPlanoDeVoo(1);

        Assert.assertEquals(true, isDeleted);
    }
}
