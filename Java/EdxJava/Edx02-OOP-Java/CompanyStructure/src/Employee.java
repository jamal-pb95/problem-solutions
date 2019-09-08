public abstract class Employee {
    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;
    private double bonus;

    private static int nextID = 1;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        employeeID = nextID++;
    }

    @Override
    public String toString() {
        return employeeID + " " + name;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeId() {
        return this.employeeID;
    }

    public Employee getManager() {
        return this.manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public boolean equals(Employee other) {
        return (this.employeeID == other.employeeID);
    }

    public String employeeStatus() {
        return this.getEmployeeId() + " " + this.getName();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }
}
