package com.cecis.practicaJPA.service;
import com.cecis.practicaJPA.model.Curso;
import java.util.List;

public interface ICursoService {

    public List<Curso> getCursos();
    public void saveCurso(Curso curso);
    public void deleteCurso(Long id);
    public void editCurso(Curso curso);
    public Curso findCurso (Long id);

}
