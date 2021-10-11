package src;

public class Classroom {
    private int id ;
    private String code;
    private String label;

    private static int comp;

    public Classroom(String code, String label) {
        this.id = ++comp;
        this.code = code;
        this.label = label;
    }

    public int getId(){
        return this.id;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public String getCode(){
        return this.code;
    }

    public String getLabel(){
        return this.label;
    }

    @Override
    public String toString(){
        return "Class(id : " + this.id + " code : " + this.code + " label : " + this.label;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
