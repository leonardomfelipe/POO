package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Repositorio<T> {
    private List<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public List<T> listarTodos() {
        return itens;
    }

    public List<T> filtrar(Predicate<T> condicao) {
        return itens.stream().filter(condicao).collect(Collectors.toList());
    }
}
