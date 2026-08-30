package app.domain;
import java.sql.Date;

public class Person {
    // INSERT THE ATTRIBUTES
    private Integer id;
    private String docType;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private String password;
    private Date birthDay;

    //CONSTRUCTOR

    public Person(){
    }

    // GET AND SET ACCESS CONTROL

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    // INSERT METHODS CRUD

    public void create(){

   }
   public void selectAll(){

   }
    public void update(){

    }
    public void delete(int id){

    }
    public void selectById(int id){

    }


}


