from car import Car
from account import Account

if __name__ == '__main__':
    car=Car("Andres Jaramillo", "1233455", "34355", Account("sebastian", "23444"))
    print(vars(car))
    print(vars(car.driver))
    
