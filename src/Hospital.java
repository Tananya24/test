import com.sun.jdi.Field;

public class Hospital {
    public FieldHospital f;
    public Hospital(FieldHospital f){
        this.f = new FieldHospital(100);
    }
}
class FieldHospital{
    private int numBed = 200;
    public FieldHospital(int {
        this.numBed = pajs=s;
    }
    public  int getNumBed(){
        return numBed;
    }
}
class Deploy{
    public static void main(String[] args) {
        Hospital h = new Hospital(new FieldHospital(300));
        System.out.println(h.f.getNumBed());
        }
    }
}
