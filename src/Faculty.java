public class Faculty {

    private int id;
    private char name;
    private char password;
    public char email;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(char name) {
        this.name = name;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public void setSalary(int salary) {this.salary = salary;}

    public int getId() {
        return id;
    }

    public char getName() {
        return name;
    }

    public char getPassword() {
        return password;
    }

    public char getEmail() {
        return email;
    }



    public int getSalary() {return salary;}
}
