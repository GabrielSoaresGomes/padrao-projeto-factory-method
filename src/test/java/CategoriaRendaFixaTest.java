import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoriaRendaFixaTest {

    @Test
    void deveRetornarAtivosRendaFixa() {
        ICategoria categoria = CategoriaFactory.obterCategoria("RendaFixa");
        assertEquals("Ativos de Renda Fixa", categoria.verAtivos());
    }

    @Test
    void deveInvestirRendaFixa() {
        ICategoria categoria = CategoriaFactory.obterCategoria("RendaFixa");
        assertEquals("Foi investido na Renda Fixa", categoria.investir());
    }
}