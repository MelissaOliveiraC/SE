package src.services;

import src.models.Aluno;

public interface AlunoService {
    Aluno buscarAluno(String ra);
    boolean verificaExistencia(Aluno aluno);
    boolean verificaDebito(Aluno aluno);
}