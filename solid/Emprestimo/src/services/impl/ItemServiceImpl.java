package src.services.impl;

import java.util.Calendar;
import java.util.Date;
import src.models.Item;
import src.services.ItemService;

public class ItemServiceImpl implements ItemService {

    @Override
    public Date calculaDataDevolucao(Item item, Date data) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DATE, item.getLivro().verPrazo());
        return calendar.getTime();
    }
}