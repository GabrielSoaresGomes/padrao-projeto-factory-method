public class CategoriaFactory {

    public static ICategoria obterCategoria(String categoria) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Categoria"+categoria);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Categoria inexistente");
        }
        if (!(objeto instanceof ICategoria)) {
            throw new IllegalArgumentException("Categoria inválida");
        }
        return (ICategoria) objeto;
    }
}