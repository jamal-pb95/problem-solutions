package javaForDummies;

public class Name {
    private String firstName;
    private String lastName;
    private char middleInitial;

    public Name(String firstName, char middleInitial, String lastName) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private char getMiddleInitial() {
        return this.middleInitial;
    }

    private String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNormalOrder() {
        return this.firstName + " " + this.middleInitial + ". " + this.lastName;
    }

    public String getReverseOrder() {
        return this.lastName + ", " + this.firstName + " " + this.middleInitial + ".";
    }
}
