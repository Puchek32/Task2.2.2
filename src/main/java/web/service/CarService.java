package web.service;

import org.springframework.ui.ModelMap;
import web.models.Car;
import java.util.List;

public interface CarService {
    public List<Car> numbersOfCars(ModelMap model, String count);
}
