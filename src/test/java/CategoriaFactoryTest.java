import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CategoriaFactoryTest {
    @Test
    void deveRetornarExcecaoCategoriaInexistente() {
        try {
            ICategoria categoria = CategoriaFactory.obterCategoria("Cripto");
            fail();
        } catch (IllegalArgumentException error) {
            assertEquals("Categoria inexistente", error.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoCategoriaInvalida() {
        try {
            ICategoria categoria = CategoriaFactory.obterCategoria("TesouroDireto");
            fail();
        } catch (IllegalArgumentException error) {
            assertEquals("Categoria inválida", error.getMessage());
        }
    }
}