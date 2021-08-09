package filter;

import logger.Logger;
import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int filter;

    public Filter(int filter) {
        this.filter = filter;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer l : source) {
            if (l > this.filter) {
                logger.log("Элемент \"" + l + "\" проходит");
                result.add(l);
            } else {
                logger.log("Элемент \"" + l + "\" не проходит");
            }
        }
        return result;
    }
}