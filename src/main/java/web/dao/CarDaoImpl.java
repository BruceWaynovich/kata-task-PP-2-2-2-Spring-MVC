package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Toyota", "Camry", 2018));
        carList.add(new Car("Honda", "Civic", 2020));
        carList.add(new Car("Ford", "Focus", 2011));
        carList.add(new Car("Mitsubishi", "Lancer", 2008));
        carList.add(new Car("Renault", "Logan", 2005));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }
}
