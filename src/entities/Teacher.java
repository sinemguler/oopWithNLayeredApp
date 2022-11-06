package entities;

public class Teacher {
    private int id;
    private String name;
    private String lastName;
    private String branch;

    public Teacher() {
    }

    public Teacher(int id, String name, String lastName, String branch) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
