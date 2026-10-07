interface Employee {
    id: number;
    name: string;
    salary: number;
}

let employees: Employee[] = [];

function addEmployee() {
    let id = Number(prompt());
    let name = prompt()!;
    let salary = Number(prompt());

    employees.push({ id, name, salary });
}

function displayEmployees() {
    console.log(employees);
}

function updateEmployee() {
    let id = Number(prompt());
    let employee = employees.find(e => e.id === id);

    if (employee) {
        employee.name = prompt()!;
        employee.salary = Number(prompt());
    }
}

function deleteEmployee() {
    let id = Number(prompt());
    employees = employees.filter(e => e.id !== id);
}

let choice = Number(prompt());

if (choice === 1)
    addEmployee();
else if (choice === 2)
    displayEmployees();
else if (choice === 3)
    updateEmployee();
else if (choice === 4)
    deleteEmployee();