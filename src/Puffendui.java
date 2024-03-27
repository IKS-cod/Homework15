public class Puffendui extends Hogwarts {
    private int hardworking;
    private int faithful;
    private int honest;


    public Puffendui(String fullName, int powerOfMagic, int distanceTransgression, int hardworking, int faithful,
                     int honest) {
        super(fullName, powerOfMagic, distanceTransgression);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
        checkErrorСharacteristic(hardworking);
        checkErrorСharacteristic(faithful);
        checkErrorСharacteristic(honest);
    }

    @Override
    public String toString() {
        return super.toString() +
                "трудолюбивый -" + hardworking +
                ", верный -" + faithful +
                ", честный -" + honest + '\'';
    }

    public void findBestPerson(Puffendui second) {
        int sumOne = this.getHardworking() + this.getFaithful() + this.getHonest();
        int sumTwo = second.getHardworking() + second.getFaithful() + second.getHonest();
        System.out.println("У " + this.getFullName() + " сумма баллов равна " + sumOne + ", а у " + second.getFullName() + "– " + sumTwo);
        if (sumOne > sumTwo) {
            System.out.println(this.getFullName() + " лучший Пуффендуйец, чем " + second.getFullName());
        } else if (sumOne < sumTwo) {
            System.out.println(second.getFullName() + " лучший Пуффендуйец, чем " + this.getFullName());
        } else {
            System.out.println("Ученики одинаковы по баллам");
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        checkErrorСharacteristic(hardworking);
        this.hardworking = hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        checkErrorСharacteristic(faithful);
        this.faithful = faithful;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        checkErrorСharacteristic(honest);
        this.honest = honest;
    }
}
