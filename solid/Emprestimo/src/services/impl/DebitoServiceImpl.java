package src.services.impl;

import src.services.DebitoService;

public class DebitoServiceImpl implements DebitoService {

    @Override
    public boolean verificaDebito(int codigoAluno) {
        return codigoAluno != 4;
    }
}