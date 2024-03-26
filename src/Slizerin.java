public class Slizerin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slizerin(String fullName, int powerOfMagic, int distanceTransgression, int trick, int determination,
                    int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, powerOfMagic, distanceTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
        checkErrorTrick();
        checkErrorDetermination();
        checkErrorAmbition();
        checkErrorResourcefulness();
        checkErrorThirstForPower();
           }
    public void checkErrorThirstForPower() {
        if (this.thirstForPower <= 0 || this.thirstForPower > 100) {
            throw new RuntimeException("Поле thirstForPower заполнено не корректно");
        }
    }
    public void checkErrorResourcefulness() {
        if (this.resourcefulness <= 0 || this.resourcefulness > 100) {
            throw new RuntimeException("Поле resourcefulness заполнено не корректно");
        }
    }
    public void checkErrorAmbition() {
        if (this.ambition <= 0 || this.ambition > 100) {
            throw new RuntimeException("Поле ambition заполнено не корректно");
        }
    }
    public void checkErrorDetermination() {
        if (this.determination <= 0 || this.determination > 100) {
            throw new RuntimeException("Поле determination заполнено не корректно");
        }
    }
    public void checkErrorTrick() {
        if (this.trick <= 0 || this.trick > 100) {
            throw new RuntimeException("Поле trick заполнено не корректно");
        }
    }
    public void findBestPerson(Slizerin second) {
        int sumOne = this.getTrick() + this.getDetermination() + this.getAmbition()+ this.getResourcefulness()+
                this.getThirstForPower();
        int sumTwo = second.getTrick() + second.getDetermination() + second.getAmbition()+ second.getResourcefulness()+
                second.getThirstForPower();
        System.out.println("У " + this.getFullName() + " сумма баллов равна " + sumOne + ", а у " +
                second.getFullName() + "– " + sumTwo);
        if (sumOne > sumTwo) {
            System.out.println(this.getFullName() + " лучший Слизеринец, чем " + second.getFullName());
        } else {
            System.out.println(second.getFullName() + " лучший Слизеринец, чем " + this.getFullName());
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                "хитрость -" + trick +
                ", решительность -" + determination +
                ", амбициозность -" + ambition +
                ", находчивость -" + resourcefulness +
                ", жажда власти -" + thirstForPower +'\'';
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        if (trick < 0 || trick > 100) {
            System.out.println(trick + " параметр trick задан не корректно!");
            return;
        }
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            System.out.println(determination + " параметр determination задан не корректно!");
            return;
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            System.out.println(ambition + " параметр ambition задан не корректно!");
            return;
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            System.out.println(resourcefulness + " параметр resourcefulness задан не корректно!");
            return;
        }
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        if (thirstForPower < 0 || thirstForPower > 100) {
            System.out.println(thirstForPower + " параметр thirstForPower задан не корректно!");
            return;
        }
        this.thirstForPower = thirstForPower;
    }
}
