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
        checkErrorСharacteristic(nobility);
        checkErrorСharacteristic(honor);
        checkErrorСharacteristic(bravery);

    }

    public void findBestPerson(Griffindor second) {
        int sumOne = this.getNobility() + this.getHonor() + this.getBravery();
        int sumTwo = second.getNobility() + second.getHonor() + second.getBravery();
        System.out.println("У " + this.getFullName() + " сумма баллов равна " + sumOne + ", а у " + second.getFullName() + "– " + sumTwo);
        if (sumOne > sumTwo) {
            System.out.println(this.getFullName() + " лучший Гриффиндорец, чем " + second.getFullName());
        } else if (sumOne < sumTwo) {
            System.out.println(second.getFullName() + " лучший Гриффиндорец, чем " + this.getFullName());
        }else {
            System.out.println("Ученики одинаковы по баллам");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", благородство -" + nobility +
                ", честь -" + honor +
                ", храбрость -" + bravery + '\'';
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
       checkErrorСharacteristic(nobility);
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
       checkErrorСharacteristic(honor);
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
       checkErrorСharacteristic(bravery);
        this.bravery = bravery;
    }
}
