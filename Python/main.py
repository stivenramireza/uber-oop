from car import Car
from account import Account
from uber_x import UberX


def main() -> None:
    car = Car("AMS234", Account("Andrés Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("AMS2340", Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark")
    print(vars(uberX))
    print(vars(uberX.driver))


if __name__ == "__main__":
    main()
