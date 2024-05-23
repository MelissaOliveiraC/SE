package src.services.impl;

import src.models.Titulo;
import src.services.TituloService;

public class TituloServiceImpl implements TituloService {

    @Override
    public int getPrazo(Titulo titulo) {
        return titulo.getPrazo();
    }
}