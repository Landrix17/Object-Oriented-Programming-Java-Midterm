public class BloodData {
private String bloodType;
private String rhFactor;
	
	public String getBloodType(){
	return bloodType;
}
	public void setBloodType(String newBloodType){
	this.bloodType=newBloodType;
}
	public String getrhFactor(){
	return rhFactor;
}

	public void setrhFactor(String newrhFactor){
	this.rhFactor=newrhFactor;
}
	public BloodData() {
	bloodType="o";
	rhFactor="+";
}
	public void display() {
	System.out.println(getBloodType()+getrhFactor()+" is added to the bloodbank.\n");
}
}
