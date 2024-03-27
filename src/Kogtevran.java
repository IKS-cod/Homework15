public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Kogtevran(String fullName, int powerOfMagic, int distanceTransgression, int smart, int wise, int witty,
                     int fullOfCreativity) {
        super(fullName, powerOfMagic, distanceTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
        checkErrorСharacteristic(smart);
        checkErrorСharacteristic(wise);
        checkErrorСharacteristic(witty);
        checkErrorСharacteristic(fullOfCreativity);
    }

    public void findBestPerson(Kogtevran second) {
        int sumOne = this.getSmart() + this.getWise() + this.getWitty() + this.getFullOfCreativity();
        int sumTwo = second.getSmart() + second.getWise() + second.getWitty() + second.getFullOfCreativity();
        System.out.println("У " + this.getFullName() + " сумма баллов равна " + sumOne + ", а у " + second.getFullName() + "– " + sumTwo);
        if (sumOne > sumTwo) {
            System.out.println(this.getFullName() + " лучший Когтевранец, чем " + second.getFullName());
        } else if (sumOne < sumTwo){
            System.out.println(second.getFullName() + " лучший Когтевранец, чем " + this.getFullName());
        }else {
            System.out.println("Ученики одинаковы по баллам");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "умный -" + smart +
                ", мудрый -" + wise +
                ", остроумный -" + witty +
                ", полны творчества -" + fullOfCreativity + '\'';
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
       checkErrorСharacteristic(smart);
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        checkErrorСharacteristic(wise);
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
       checkErrorСharacteristic(witty);
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        checkErrorСharacteristic(fullOfCreativity);
        this.fullOfCreativity = fullOfCreativity;
    }
}
