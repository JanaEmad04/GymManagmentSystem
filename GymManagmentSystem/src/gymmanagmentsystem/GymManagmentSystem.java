
import java.time.LocalDate;

public class GymManagmentSystem {

    public static void main(String[] args) {
        double totalMark = 0;

        // Trainer Management Test (3 Marks)
        System.out.println("Testing Trainer Management...");
        totalMark += testTrainerManagement();


        // Member Management Test (2 Marks)
        System.out.println("Testing Member Management...");
        totalMark += testMemberManagement();


        // Class Management Test (4 Marks)
        System.out.println("Testing Class Management...");
        totalMark += testClassManagement();


        // Registration Management Test (9 Marks)
        System.out.println("Testing Registration Management...");
        totalMark += testRegistrationManagement();


        // Display final score
        System.out.println("Total Score: " + totalMark + "/18");
        System.out.println("7 Marks for comparing files");
    }

    public static double testTrainerManagement() {
        // Do not Forget to Clear File
        double mark = 0;
        try {
            AdminRole admin = new AdminRole();
            // Adding Trainer Test
            Trainer trainer = new Trainer("T001", "David", "david@fitlife.com", "Yoga", "0123456789");
            admin.addTrainer(trainer);
            if (admin.getListOfTrainers().size() == 1) {
                mark += 0.5;
                System.out.println("Mark: " + mark);
            }

            // Duplicate Trainer Test
            trainer = new Trainer("T001", "David", "david@fitlife.com", "Yoga", "0123456789");
            admin.addTrainer(trainer);
            if (admin.getListOfTrainers().size() == 1) {
                mark += 1;
                System.out.println("Mark: " + mark);
            }

            // Adding another Trainer Test
            trainer = new Trainer("T002", "David", "david@fitlife.com", "Yoga", "0123456789");
            admin.addTrainer(trainer);
            if (admin.getListOfTrainers().size() == 2) {
                mark += 0.5;
                System.out.println("Mark: " + mark);
            }


            // Removing Trainer Test
            admin.removeTrainer("T001");
            if (admin.getListOfTrainers().size() == 1) {
                mark += 1;
                System.out.println("Mark: " + mark);
            }
            admin.logout();

        } catch (Exception e) {
            System.out.println("Trainer Management Test Failed: " + e.getMessage());
        }
        return mark;
    }

    public static double testMemberManagement() {
        double mark = 0;
        try {
            TrainerRole trainer = new TrainerRole();
            // Adding Member Test
            Member member = new Member("M001", "John", "Monthly", "john@gmail.com", "0123456789", "active");
            trainer.addMember(member);
            if (trainer.getListOfMembers().size() == 1) {
                mark += 0.5; // 1 Mark
                System.out.println("Mark: " + mark);
            }

            // Duplicate Member Test
            member = new Member("M001", "John", "Monthly", "john@gmail.com", "0123456789", "active");
            trainer.addMember(member);
            if (trainer.getListOfMembers().size() == 1) {
                mark += 0.5;
                System.out.println("Mark: " + mark);
            }


            // Verify Member Data Test
            if (trainer.getListOfMembers().get(0).getSearchKey().equals("M001")) {
                mark += 1;

            }
            trainer.logout();

        } catch (Exception e) {
            System.out.println("Member Management Test Failed: " + e.getMessage());
        }
        return mark;
    }

    public static double testClassManagement() {
        double mark = 0;
        try {
            TrainerRole trainer = new TrainerRole();

            // Adding Class Test
            trainer.addClass("C001", "Yoga", "T001", 60, 1);
            if (trainer.getListOfClasses().size() == 1) {
                mark += 0.5;
            }

            // Prevent Duplicate Class Test
            trainer.addClass("C001", "Yoga", "T001", 60, 1);
            if(trainer.getListOfClasses().size() == 1){
                mark += 0.5;
            }

            // If member preserved from member list + Register Member to Class Test
            boolean registered = trainer.registerMemberForClass(trainer.getListOfMembers().get(0).getSearchKey(), "C001", LocalDate.now());
            if (registered && trainer.getListOfClasses().get(0).getAvailableSeats() == 0 && trainer.getListOfRegistrations().get(0).getSearchKey().equals("M001C001")) {
                mark += 1.5;
            }

            // Test Full Class Registration
            Member member = new Member("M004","mem4","Monthly","mem4@example.com","044","Active");
            trainer.addMember(member);
            boolean fullRegistration = trainer.registerMemberForClass("M004", "C001", LocalDate.now());
            if (!fullRegistration) {
                mark += 1.5;
            }
            trainer.logout();

        } catch (Exception e) {
            System.out.println("Class Management Test Failed: " + e.getMessage());
        }
        return mark;
    }

    public static double testRegistrationManagement() {
        double mark = 0;
        try {
            TrainerRole trainer = new TrainerRole();
            // Register Member for Non-Existed Class Test
            boolean registered = trainer.registerMemberForClass("M001", "C002", LocalDate.now());
            if (!registered) {
                mark += 1;
            }

            // Register Non Exist Member for Existed Class Test
            registered = trainer.registerMemberForClass("M002", "C001", LocalDate.now());
            if (!registered) {
                mark += 1;
            }

            // Register to class with No Seats
            Member member = new Member("M002","member2", "Monthly","mem2@example.com","0222","Active");
            trainer.addMember(member);
            registered = trainer.registerMemberForClass("M002", "C001", LocalDate.now());
            if (!registered) {
                mark += 2;
            }

            // Register New Member to New class
            trainer.addClass("C002","Run","T001",20,30);
            registered = trainer.registerMemberForClass("M002", "C002", LocalDate.now());
            if (registered) {
                mark += 1;
            }

            // Cancel Registration Test (within 3 days)
            boolean cancelled = trainer.cancelRegistration("M002", "C002");
            if (cancelled && trainer.getListOfClasses().get(1).getAvailableSeats() == 30) {
                mark += 1;
            }

            // Test Invalid Cancellation (after 3 days)
            LocalDate oldDate = LocalDate.now().minusDays(5);
            registered = trainer.registerMemberForClass("M002", "C002", oldDate);
            if(!registered){
                mark += 1;
            }
            Member member1 = new Member("M003","member3", "Monthly","mem3@example.com","0333","Active");
            trainer.addMember(member1);
            registered = trainer.registerMemberForClass("M003","C002",oldDate);
            boolean invalidCancellation = trainer.cancelRegistration("M003", "C002");
            if (registered && !invalidCancellation) {
                mark += 2;
            }

            trainer.logout();

        } catch (Exception e) {
            System.out.println("Registration Management Test Failed: " + e.getMessage());
        }
        return mark;
    }
}