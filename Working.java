package Work;

public class Working {

    private String firstName;
    private String surName;
    private int age;
    private String email;
    private String phoneNumber;
    private String position;
    private int salary;

    public Working(String firstName, String surName, int age, String email, String phoneNumber, String position, int salary){

        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
    }

    public Working(String firstName, String surName, int i, String test){
        this(firstName, surName, 18, null, null, null, 0);
    }
    public String validate() {
        if (age > 18) { return "Работник должен быть совершенно летним";
        }
        return null;
    }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getSurName() {return surName;}
    public void setSurName(String surName) {this.surName = surName;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public  String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public  String getPosition(){return position;}
    public  void setPosition(String position){this.position = position;}
    public int getSalary(){return  salary;}
    public void setSalary(int salary){this.salary = salary;}

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Working {" +
                "firsName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary +
                '}';
    }

}

