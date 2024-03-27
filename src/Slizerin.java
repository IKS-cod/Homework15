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
       checkErrorСharacteristic(trick);
       checkErrorСharacteristic(determination);
       checkErrorСharacteristic(ambition);
       checkErrorСharacteristic(resourcefulness);
       checkErrorСharacteristic(thirstForPower);
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
        } else if(sumOne < sumTwo){
            System.out.println(second.getFullName() + " лучший Слизеринец, чем " + this.getFullName());
        }else {
            System.out.println("Ученики одинаковы по баллам");
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
        checkErrorСharacteristic(trick);
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        checkErrorСharacteristic(determination);
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        checkErrorСharacteristic(ambition);
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        checkErrorСharacteristic(resourcefulness);
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        checkErrorСharacteristic(thirstForPower);
        this.thirstForPower = thirstForPower;
    }
}
