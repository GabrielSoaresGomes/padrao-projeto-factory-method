import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaBolsaTest {

    @Test
    void deveRetornarAtivosBolsa() {
        ICategoria categoria = CategoriaFactory.obterCategoria("Bolsa");
        assertEquals("Ativos da Bolsa", categoria.verAtivos());
    }

    @Test
    void deveInvestirBolsa() {
        ICategoria categoria = CategoriaFactory.obterCategoria("Bolsa");
        assertEquals("Foi investido na Bolsa", categoria.investir());
    }
}