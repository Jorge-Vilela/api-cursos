package br.edu.nassau.apicursos.service;

import br.edu.nassau.apicursos.controller.CursoController;
import br.edu.nassau.apicursos.model.Curso;
import br.edu.nassau.apicursos.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {

    private final CursoRepository repository;

    public CursoService(CursoRepository repository){
        this.repository = repository;
    }
    private void validarRegras(Curso curso){
        if(curso.getNome() == null || curso.getNome().trim().isEmpty()){
            throw new IllegalArgumentException("O nome do curso é obrigatório!");
        }
        if (curso.getCargaHoraria() == null || curso.getCargaHoraria() <= 0){
            throw new IllegalArgumentException("A carga horária têm que ser maior que zero");
        }

    }

    public Curso cadastrar(Curso curso){
        validarRegras(curso);
        return repository.save(curso);
    }
    public List<Curso> listar(){
        return repository.findAll();
    }
    public Curso buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }
    public Curso atualizar(Long id, Curso curso){
        Curso cursoAtual = buscarPorId(id);

        if (cursoAtual != null) {
            cursoAtual.setNome(curso.getNome());
            cursoAtual.setCargaHoraria(curso.getCargaHoraria());
            return repository.save(cursoAtual);
        }
        return null;
    }
    public boolean remover(Long id){
        if (buscarPorId(id) != null) {
            repository.deleteById(id);
            return true;
        }
            return false;
    }



}
