package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("BMW", "Black", "Макака"));
        listCar.add(new Car("Mini-cooper", "Red", "Чикита"));
        listCar.add(new Car("Suzuki", "Green", "Лопух"));
        listCar.add(new Car("Opel", "Blue", "Апостал"));
        listCar.add(new Car("Жигуль", "White", "Путин"));
    }

    public CarServiceImpl() {
    }

    @Override
    public List<Car> readCar(int n) {
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newListCar.add(listCar.get(i));
        }
        return newListCar;
    }
}
