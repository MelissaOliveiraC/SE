package src.services;

import java.util.Date;
import src.models.Item;

public interface ItemService {
    Date calculaDataDevolucao(Item item, Date data);
}