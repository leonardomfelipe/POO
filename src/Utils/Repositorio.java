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

    public static final Repositorio<Atletas.Atleta> atletas = new Repositorio<>();
    public static final Repositorio<Percursos.Local> locais = new Repositorio<>();
    public static final java.util.Queue<Provas.Prova> provas = new java.util.LinkedList<>();
}
