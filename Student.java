public class Student {
    

    int id;
    String name;

  
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString() to print student details easily
    @Override
    public String toString() {
        return "Id : " + id + ", Name : " + name;
    }

}
