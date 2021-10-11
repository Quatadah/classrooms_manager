package src;
import java.util.ArrayList;
import java.util.List;

public class Classroomservice implements IDao<Classroom>{
    private List<Classroom> classrooms;

    public Classroomservice(){
        classrooms = new ArrayList<Classroom>();
    }

    @Override
    public boolean create(Classroom o) {
        return classrooms.add(o);
    }

    @Override
    public boolean delete(Classroom o) {
        return classrooms.remove(o);
    }

    @Override
    public boolean update(Classroom o) {
        for (Classroom c : classrooms){
            if (c.getId() == o.getId()){
                c.setCode(o.getCode());
                c.setLabel(o.getLabel());
                return true;
            }
        }
        return false;
    }

    @Override
    public Classroom findById(int id) {
        for (Classroom c : classrooms){
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Classroom> findAll() {
        return classrooms;
    }

    public void showClassrooms(){
        for (Classroom c : this.classrooms){
            System.out.println(c.toString()); 
        }
    }
}
