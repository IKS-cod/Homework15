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
        checkErrorSmart();
        checkErrorWise();
        checkErrorWitty();
        checkErrorFullOfCreativity();
    }

    public void checkErrorFullOfCreativity() {
        if (this.fullOfCreativity <= 0 || this.fullOfCreativity > 100) {
            throw new RuntimeException("Поле fullOfCreativity заполнено не корректно");
        }
    }

    public void checkErrorWitty() {
        if (this.witty <= 0 || this.witty > 100) {
            throw new RuntimeException("Поле witty заполнено не корректно");
        }
    }

    public void checkErrorSmart() {
        if (this.smart <= 0 || this.smart > 100) {
            throw new RuntimeException("Поле smart заполнено не корректно");
        }
    }

    public void checkErrorWise() {
        if (this.wise <= 0 || this.wise > 100) {
            throw new RuntimeException("Поле wise заполнено не корректно");
        }
    }

    public void findBestPerson(Kogtevran second) {
        int sumOne = this.getSmart() + this.getWise() + this.getWitty() + this.getFullOfCreativity();
        int sumTwo = second.getSmart() + second.getWise() + second.getWitty() + second.getFullOfCreativity();
        System.out.println("У " + this.getFullName() + " сумма баллов равна " + sumOne + ", а у " + second.getFullName() + "– " + sumTwo);
        if (sumOne > sumTwo) {
            System.out.println(this.getFullName() + " лучший Когтевранец, чем " + second.getFullName());
        } else {
            System.out.println(second.getFullName() + " лучший Когтевранец, чем " + this.getFullName());
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
        if (smart < 0 || smart > 100) {
            System.out.println(smart + " параметр smart задан не корректно!");
            return;
        }
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (wise < 0 || wise > 100) {
            System.out.println(wise + " параметр wise задан не корректно!");
            return;
        }
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        if (witty < 0 || witty > 100) {
            System.out.println(witty + " параметр witty задан не корректно!");
            return;
        }
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        if (fullOfCreativity < 0 || fullOfCreativity > 100) {
            System.out.println(fullOfCreativity + " параметр fullOfCreativity задан не корректно!");
            return;
        }
        this.fullOfCreativity = fullOfCreativity;
    }
}
