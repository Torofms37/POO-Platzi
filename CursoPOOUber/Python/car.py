from lib2to3.pgen2 import driver
from CursoPOOUber.Python.account import Account

from account import Account

class Car:
    id          = int
    license     = str
    driver      = Account("","")
    passegenger = int

    def __init__(self, license, driver):
        self.license    = license
        self.driver     = driver