from car import Car
from driver import Driver
from uber_x import UberX


def main() -> None:
    car = Car("AMS234", Driver("Andrés Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("AMS2340", Driver("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark")
    print(vars(uberX))
    print(vars(uberX.driver))


if __name__ == "__main__":
    main()
