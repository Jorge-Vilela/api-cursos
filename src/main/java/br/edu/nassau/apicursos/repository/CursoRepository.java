package br.edu.nassau.apicursos.repository;

import br.edu.nassau.apicursos.model.Curso;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoRepository {

    private List<Curso> cursos = new ArrayList<>();
    private Long geradorId = 1L;

    public Curso cadastrar(Curso curso) {
        curso.setId(geradorId++);
        cursos.add(curso);
        return curso;
    }
    public List<Curso> listar() {
        return cursos;
    }
    public Curso buscarPorId(Long id) {
        for (Curso curso : cursos) {
            if (curso.getId().equals(id)) {
                return curso;
            }
        }
        return null;
    }
    public Curso atualizar(Long id, Curso curso) {
        Curso cursoAtual = buscarPorId(id);
        if (cursoAtual != null) {
            cursoAtual.setNome(curso.getNome());
            cursoAtual.setCargaHoraria(curso.getCargaHoraria());
        }
        return cursoAtual;
    }
    public boolean remover(Long id) {
        Curso curso = buscarPorId(id);
        if (curso != null) {
            cursos.remove(curso);
            return true;
        }
        return false;
    }
}
