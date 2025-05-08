class Department:
    def __init__(self, name: str):
        self.name = name
        self.employees = []

    def add_employee(self, employee: 'Employee') -> None:
        self.employees.append(employee)

class Employee:
    def __init__(self, name: str, salary: float):
        self.name = name
        self.salary = salary

    def work(self) -> None:
        print(f"{self.name} está trabajando.")

from models.employee import Employee
from models.department import Department

class Manager(Employee):
    def __init__(self, name: str, salary: float, department: Department):
        super().__init__(name, salary)
        self.department = department

    def manage(self) -> None:
        print(f"{self.name} gestiona el departamento {self.department.name}.")
