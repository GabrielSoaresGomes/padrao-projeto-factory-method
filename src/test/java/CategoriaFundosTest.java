import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoriaFundosTest {

    @Test
    void deveRetornarAtivosFundos() {
        ICategoria categoria = CategoriaFactory.obterCategoria("Fundos");
        assertEquals("Ativos de Fundos", categoria.verAtivos());
    }

    @Test
    void deveInvestirFundos() {
        ICategoria categoria = CategoriaFactory.obterCategoria("Fundos");
        assertEquals("Foi investido em Fundos", categoria.investir());
    }
}