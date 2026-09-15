package br.edu.nassau.apicursos.controller;

import br.edu.nassau.apicursos.model.Curso;
import br.edu.nassau.apicursos.service.CursoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public Curso cadastrar(@RequestBody Curso curso){
        return (cursoService.cadastrar(curso));
    }

    @GetMapping
    public List<Curso> listar(){
        return cursoService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscar(@PathVariable Long id){
        Curso curso = cursoService.buscarPorId(id);

        if (curso != null) {
            return ResponseEntity.ok().body(curso);
        }else{
            return ResponseEntity.notFound().build();}

}

    @PutMapping("/{id}")
    public ResponseEntity<Curso> atualizar(@PathVariable Long id, @RequestBody Curso curso) {
        Curso cursoAtualizado = cursoService.atualizar(id, curso);
        if (cursoAtualizado != null) {
            return ResponseEntity.ok().body(cursoAtualizado);
        }
        else  {
            return ResponseEntity.notFound().build();}

}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {

        boolean deletou = cursoService.remover(id);

        if (deletou) {
            return ResponseEntity.noContent().build();
        }else  {
            return ResponseEntity.notFound().build();
        }
    }

}
