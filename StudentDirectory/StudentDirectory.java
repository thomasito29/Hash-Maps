import java.util.HashMap;
import java.util.Scanner;

    public class StudentDirectory{

        public static void main(String [ ] args){
            Scanner sc = new Scanner (System.in);
            HashMap<String, String> studentList = new HashMap<>();

            //input the number of student
             
             System.out.print("Enter number of students: ");
             int n = sc.nextInt();
             sc.nextLine();

             //input student input

             for (int i = 0; i < n; i++){

                   System.out.println("Enter Student Number");
                   String StudNum = sc.nextLine();

                   System.out.println("Enter Student Name");
                   String StudName = sc.nextLine();

                   studentList.put (StudNum, StudName);
             }   
           //display student directory
                System.out.println("Student directory:" + studentList);

                int choice;

            do {
                    System.out.println("\nChoose an operation:");
                    System.out.println("1 - Search, 2 - Remove, 3 - Add/Update, 4 - Exit");
                    System.out.print("Enter your choice: ");

                    choice = sc.nextInt();
                    sc.nextLine();

            switch(choice){

                case 1:
                     System.out.print("Enter student number to search: ");
                     String searchNum = sc.nextLine();
                      
                      if (studentList.containsKey(searchNum)) {
                        System.out.println("Student name: "
                                + studentList.get(searchNum));
                    
                    } else {
                        System.out.println("Student not found.");
                    
                    }
                    break;

                case 2:
                    // Remove student
                    System.out.print("Enter student number to remove: ");
                    String removeNum = sc.nextLine();

                    if (studentList.containsKey(removeNum)) {
                        String removedName = studentList.remove(removeNum);
                        System.out.println("Removed student "
                                + removedName);
                        System.out.println("Updated student directory: "
                                + studentList);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    // Add or update student
                    System.out.print("Enter student number to add or update: ");
                    String newNum = sc.nextLine();

                    System.out.print("Enter student name: ");
                    String newName = sc.nextLine();

                    if (studentList.containsKey(newNum)) {
                        studentList.put(newNum, newName);
                        System.out.println("Updated existing entry.");
                    } else {
                        studentList.put(newNum, newName);
                        System.out.println("No existing record found. Added new entry.");
                    }

                    System.out.println("Updated student directory: "
                            + studentList);
                    break;

                case 4:
                    // Exit program
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            }    while (choice !=4);
            sc.close();



        }

    }
