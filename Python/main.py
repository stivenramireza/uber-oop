from car import Car

if __name__ == "__main__":
    print("Hello world!")

    car = Car()
    car.license = "AMS234"
    car.driver = "Andrés Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE567"
    car2.driver = "Matha"
    print(vars(car2))
