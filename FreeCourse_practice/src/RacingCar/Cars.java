package RacingCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] names) {
        this.cars = Arrays.stream(names).map(Car::new).toList();
    }

    public void run(int round) {
        System.out.println("실행결과");

        for (int i = 0; i < round; i++) {
            for (Car car : cars) {
                car.move();
                System.out.println(car.getMoveResult());
            }

            System.out.println();
        }
    }

    public String getWinners() {
        int winnerMoveSize = cars.stream() // Stream<Car>
                .mapToInt(Car::getMoveSize) // IntStream
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.isWinner(winnerMoveSize)) // Stream<Car>
                .map(Car::getName) // Stream<String>
                .collect(Collectors.joining(", "));
    }
}
