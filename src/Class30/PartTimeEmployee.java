package Class30;

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int id, double salary) throws InvalidSalaryException {
        super(name, id, salary);
    }

    @Override
    public double calculateTax() {
        return salary * 0.1; // 10% tax
    }
}