public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String fullName, int powerOfMagic, int distanceTransgression, int nobility, int honor,
                      int bravery) {
        super(fullName, powerOfMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        checkErrorNobility();
        checkErrorHonor();
    }
    public void checkErrorNobility() {
        if (this.nobility <= 0||this.nobility >100) {
            throw new RuntimeException("Поле nobility заполнено не корректно");
        }
    }
    public void checkErrorHonor() {
        if (this.honor <= 0||this.honor >100) {
            throw new RuntimeException("Поле honor заполнено не корректно");
        }
    }
    public void checkErrorBravery() {
        if (this.bravery <= 0||this.bravery >100) {
            throw new RuntimeException("Поле bravery заполнено не корректно");
        }
    }
    public void findBestPerson(Griffindor second) {
        int sumOne=this.getNobility() + this.getHonor() + this.getBravery();
        int sumTwo=second.getNobility() + second.getHonor() + second.getBravery();
        System.out.println("У "+ this.getFullName()+" сумма баллов равна "+ sumOne+", а у "+second.getFullName() +"– "+sumTwo);
        if(sumOne>sumTwo){
            System.out.println(this.getFullName() + " лучший Гриффиндорец, чем " + second.getFullName());
        }else {
            System.out.println(second.getFullName() + " лучший Гриффиндорец, чем " + this.getFullName());
        }
    }
    @Override
    public String toString() {
        return  super.toString()+
                ", благородство -" + nobility +
                ", честь -" + honor +
                ", храбрость -" + bravery +'\'';
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            System.out.println(nobility + " параметр nobility задан не корректно!");
            return;
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            System.out.println(honor + " параметр honor задан не корректно!");
            return;
        }
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            System.out.println(bravery + " параметр bravery задан не корректно!");
            return;
        }
        this.bravery = bravery;
    }
}
