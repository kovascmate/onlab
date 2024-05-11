package Organization;
class Person{
    public string title;
    private int age;
    public string givenName;
    public string middleName;
    public string familyName;
    public string fullName;
    private string birthday;
    protected string gender;
    private string homeAddress;

    public string printInfo(){
        return null;
    }

}
public interface Callable{
    private int phoneNumber;
}
public class Recipe{
    public string description;
}
class Hospital implements Callable{
    public string name;
    private string address;
    public aggregation Department : department;
}
class Patient extends Person implements Callable{
    public int id;
    protected boolean accepted;
    private string sickness;
    private string allergies;
    public string printPatientInfo(){
    return null;
    }
    public association Recipe : recipe;
}
class Staff extends Person{
    public string joined;
    public string education;
    public string certification;
    public string langauge;

    public string printStaffInfo(){
    return null;
    }
}
class Operations_Staff extends Staff{

}
class Doctor extends Operations_Staff{
    public string speciality;
    public string location;
}
class Nurse extends Operations_Staff{

}
class Surgeon extends Doctor{
    public void performSurgery(string name){

    }
}
class Administrative_Staff extends Staff{

}
class Front_Desk_Staff extends Administrative_Staff{

}
class Department implements Callable{
    public void addStaffToDepartment(string name){

    }
    public void removeStaffFromDepartment(string name){

    }
    public aggregation Staff : staff;
}
class Receptionist extends Front_Desk_Staff{
    public void answerCall(){

    }
}
class Technical_Staff extends Staff{

}
class Tehnician extends Technical_Staff{
    public void performMaintenance(){

    }
    public int repairEquipment(){
    return quantity;
    }
}
class Technologist extends Technical_Staff{

}
class Surgical_Technologist extends Technologist{
    public void prepareSurgicalEquipment(){

    }
}