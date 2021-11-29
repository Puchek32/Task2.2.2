package web.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> numbersOfCars(ModelMap model, String count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mersedes", ("Benz"), 12));
        cars.add(new Car("Reno", "Logan", 3400));
        cars.add(new Car("Lada", "Baklazhan", 1488));
        cars.add(new Car("Tank", "IS", 2));
        cars.add(new Car("Musorovoz", "Star", 2312));
        if (count != null)
            cars = cars.stream().limit(Integer.parseInt(count)).collect(Collectors.toList());
        return cars;
    }
}
