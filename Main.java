import src.Classroom;
import src.Classroomservice;

public class Main {
    public static void main(String args[]){
        Classroom c1 = new Classroom("A", "Room1");
        Classroom c2 = new Classroom("B", "Room2");
        Classroom c3 = new Classroom("C", "Room3");
        Classroom c4 = new Classroom("D", "Room4");
        Classroom c5 = new Classroom("E", "Room5");
        
        Classroomservice crService = new Classroomservice();
        
        crService.create(c1);
        crService.create(c2);
        crService.create(c3);
        crService.create(c4);
        crService.create(c5);

        System.out.println("Classrooms : ");
        crService.showClassrooms();
        System.out.println("\n");

        crService.delete(c4);

        Classroom cs = new Classroom("Computer science", "Room6");
        cs.setId(3);
        crService.update(cs);

        System.out.println("Classrooms : ");
        crService.showClassrooms();
        System.out.println("\n");
        
    }
}
