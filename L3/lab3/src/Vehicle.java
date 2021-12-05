public class Vehicle {
    public String _name;
    public String _companyName;
    public String _ownerName;
    public int _mileage;
    protected  String _vinCode;

    Vehicle(String name, String companyName,String ownerName,int mileage,String vinCode){
        _name =name;
        _companyName = companyName;
        _ownerName = ownerName;
        _mileage = mileage;
        _vinCode = vinCode;
    }

    public String getName() {
        return _name;
    }

    public String setName(String name)
    {
        _name = name;
        return  _name;
    }

    public String getCompanyName() {
        return _companyName;
    }

    public String setCompanyName(String companyName)
    {
        _companyName = companyName;
        return  _companyName;
    }

    public String getOwnerName() {
        return _ownerName;
    }

    public String setOwnerName(String ownerName)
    {
        _ownerName = ownerName;
        return  _ownerName;
    }

    public int getMileage() {
        return _mileage;
    }

    public int setMileage(int mileage)
    {
        _mileage = mileage;
        return  _mileage;
    }

    public String getVinCode() {
        return _vinCode;
    }

    public String setVinCode(String vinCode)
    {
        _vinCode = vinCode;
        return  _vinCode;
    }
}
