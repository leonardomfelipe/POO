package Utils;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private List<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public List<T> listarTodos() {
        return itens;
    }

    public T buscarPorIndice(int index) {
        return itens.get(index);
    }

    public int tamanho() {
        return itens.size();
    }
}
