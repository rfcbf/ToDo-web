package br.com.esig.todo.dao;

import br.com.esig.todo.entity.Todo;

import java.util.List;

public interface TodoDao {

    void salvar(Todo todo);

    List<Todo> recuperar(String filtro);

    Todo recuperarPorId(Integer id);

    void atualizar(Todo todo);

    void excluir(Integer id);

    void concluir(Integer id);

    void naoConcluir(Integer id);

}
