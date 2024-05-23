package src.services.impl;

import src.models.Aluno;
import src.services.AlunoService;
import src.services.DebitoService;

public class AlunoServiceImpl implements AlunoService {

    private DebitoService debitoService;

    public AlunoServiceImpl(DebitoService debitoService) {
        this.debitoService = debitoService;
    }

    @Override
    public Aluno buscarAluno(String ra) {
        return new Aluno(ra);
    }

    @Override
    public boolean verificaExistencia(Aluno aluno) {
        return aluno.verificaAluno();
    }

    @Override
    public boolean verificaDebito(Aluno aluno) {
        return debitoService.verificaDebito(Integer.parseInt(aluno.getRA()));
    }
}