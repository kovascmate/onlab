class Receptionist extends Front_Desk_Staff {
	public void answerCall(){
	}
}
class Operations_Staff extends Staff {
}
class Front_Desk_Staff extends Administrative_Staff {
}
class Recipe {
	public string description;
}
class Staff extends Person {
	public string joined;
	public string education;
	public string certification;
	public string langauge;
	public string printStaffInfo(){
		return null;
	}
}
class Patient extends Person implements Callable {
	public int id;
	protected boolean accepted;
	private string sickness;
	private string allergies;
	public string printPatientInfo(){
		return null;
	}
	public void asdasd(){
		return null;
	}
	public composition Recipe : recipe ; 
}
class Doctor extends Operations_Staff {
	public string speciality;
	public string location;
}
class Surgeon extends Doctor {
	public void performSurgery(){
	}
}
class Surgical_Technologist extends Technologist {
	public void prepareSurgicalEquipment(){
	}
}
interface Callable {
}
class Department implements Callable {
	public void addStaffToDepartment(){
	}
	public void removeStaffFromDepartment(){
	}
	public aggregation Staff : staff [0..*]; 
}
class Administrative_Staff extends Staff {
}
class Technical_Staff extends Staff {
}
class Technologist extends Technical_Staff {
}
class Hospital implements Callable {
	public string name;
	private string address;
	public association Department : department ; 
}
class Tehnician extends Technical_Staff {
	public void performMaintenance(){
	}
	public int repairEquipment(){
		return null;
	}
}
class Person {
	public string title;
	private int age;
	public string givenName;
	public string middleName;
	public string familyName;
	public string fullName;
	private date birthday;
	protected string gender;
	private string homeAddress;
	public string printInfo(){
		return null;
	}
}
class Nurse extends Operations_Staff {
}
