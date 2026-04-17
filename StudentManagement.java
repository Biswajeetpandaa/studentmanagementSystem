import java.util.*;
class StudentManagemnet {
    public static void main(String[] args) {

       
        HashMap<Integer, Student> studentName = new HashMap<>();

        
        Scanner sc = new Scanner(System.in);



            // initialized ch with -1 for the try catch block else it will show ch is not initialized. 
            int ch = -1;
       
        do {

            // Display menu
            System.out.println("\nChoose any option below:");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Sort Students by ID");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            // Handle invalid input (like string instead of number)

            try {
                ch = sc.nextInt();  
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); 
                continue; 
            }

           
            switch (ch) {

               
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    
                    studentName.put(id, new Student(id, name));
                    System.out.println("Student added successfully!");
                }

               
                case 2 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();

                    
                    if (studentName.containsKey(id)) {
                        studentName.remove(id); // remove student
                        System.out.println("Deleted successfully!");
                    } else {
                        System.out.println("Invalid ID!");
                    }
                }

                
                case 3 -> {
                    System.out.print("Enter ID to search: ");
                    int id = sc.nextInt();

                    
                    if (studentName.containsKey(id)) {
                        System.out.println(studentName.get(id)); // print student
                    } else {
                        System.out.println("Student not found!");
                    }
                }

             
                case 4 -> {
                   
                    if (studentName.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\nStudent Details:");

                     
                        for (Student s : studentName.values()) {
                            System.out.println(s);
                        }
                    }
                }

               
                case 5 -> {
                    
                    if (studentName.isEmpty()) {
                        System.out.println("No data to sort.");
                    } else {
                       
                        TreeMap<Integer, Student> sorted = new TreeMap<>(studentName);

                        System.out.println("\nSorted Students:");

                        
                        for (Student s : sorted.values()) {
                            System.out.println(s);
                        }
                    }
                }

                case 0 -> System.out.println("Exiting...");

                default -> {
                        System.out.println("Invalid choice!");
                }
            }

        } while (ch != 0); 

        // Close scanner to prevent resource leak
        sc.close();
    }
}
