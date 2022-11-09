package PeopleInSchool;
class Student extends Person {

    private String program;
    private int yearLevel;

    public void setProgram(String program) {
        this.program = program;
    }
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    public String getProgram() {
        return program;
    }
    public int getYearLevel() {
        return yearLevel;
    }

    void callStudent(String name, String contactNum, String program, int yearLevel) {
        
        setName(name);
        setContactNum(contactNum);
        setProgram(program);
        setYearLevel(yearLevel);
        
        System.out.println("----------------------------");
        System.out.println("Name          : " + getName());
        System.out.println("Contact Number: " + getContactNum());
        System.out.println("Program       : " + getProgram());
        System.out.println("Year Level    : " + getYearLevel());
    }
}