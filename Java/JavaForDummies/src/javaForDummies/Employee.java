package javaForDummies;

public class Employee {
    private String name;
    private String jobTitle;

//    public Employee(String name, String jobTitle) {
//        this.name = name;
//        this.jobTitle = jobTitle;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void cutCheck(double paidAmount) {
        System.out.printf("Pay to the order of %s ", name);
        System.out.printf("(%s) *******$", jobTitle);
        System.out.printf("%, .2f\n", paidAmount);
    }
}
