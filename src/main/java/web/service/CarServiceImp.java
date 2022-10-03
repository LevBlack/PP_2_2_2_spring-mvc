package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getAllCars(int size) {
        List<Car> allCars= new ArrayList<>(5);

        allCars.add(new Car("Volkswagen", "Touareg", 200));
        allCars.add(new Car("Toyota", "Camry", 500));
        allCars.add(new Car("BMW", "X5", -10));
        allCars.add(new Car("MiniCooper", "S", 289));
        allCars.add(new Car("Tesla", "Model Y", 1001));

        if (size >= 5) {
            return allCars;
        }

        return allCars.subList(1,size+1);
    }
}
