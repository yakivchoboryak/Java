package Classes;

public class BMX extends Vehicle{

    protected int _movingAngle;
    protected String _companyName;
    protected String _ownerName;
    
    public int getMovingAngle() {
        return _movingAngle;
    }

    public void setMovingAngle(int movingAngle) {
        _movingAngle =  movingAngle;
    }

    public String getCompanyName() {
        return _companyName;
    }

    public void setCompanyName(String companyName) {
        _companyName = companyName;
    }

    public String getOwnerName() {
        return _ownerName;
    }

    public void setOwnerName(String ownerName) {
        _ownerName = ownerName;
    }
}
