public class SoftwareEngineer extends TechnicalEmployee {
    private int checkInCount;
    private boolean hasCodeAccess;

    public SoftwareEngineer(String name) {
        super(name);
    }

    public int getSuccessfulCheckIns() {
        return this.checkInCount;
    }

    public boolean getCodeAccess() {
        return this.hasCodeAccess;
    }

    public void setCodeAccess(boolean externalAccess) {
        this.hasCodeAccess = externalAccess;
    }

    public boolean checkInCode() {
        TechnicalLead thisManager = ((TechnicalLead) this.getManager());
        if (thisManager.approveCheckIn(this)) {
            checkInCount = checkInCount + 1;
            return true;
        } else {
            return false;
        }
    }

    public String employeeStatus() {
        return super.employeeStatus() + " has " + checkInCount + " successful check ins";
    }
}
