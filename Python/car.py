from account import Account

class Car(Account):
    id=int
    license=str
    driver=str
    passenger=str

    def __init__(self,name, document, license, driver):
        #heredad de Account
        super().__init__(name, document)
        self.license
        self.driver

    def mostrar(self):
        print(vars(Car))
