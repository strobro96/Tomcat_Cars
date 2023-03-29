package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("Tesla", 100, "Green"));
        carsList.add(new Car("Audi", 200, "Red"));
        carsList.add(new Car("Lada", 300, "Silver"));
        carsList.add(new Car("BMW", 400, "Blue"));
        carsList.add(new Car("Lamborghini", 500, "Yellow"));
    }

    @Override
    public List<Car> getCars(int count) {
        return carsList.stream().limit(count).toList();
    }
}

