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
        checkErrorHardworking();
        checkErrorFaithful();
        checkErrorHonest();
    }

    public void checkErrorHardworking() {
        if (this.hardworking <= 0 || this.hardworking > 100) {
            throw new RuntimeException("Поле hardworking заполнено не корректно");
        }
    }

    public void checkErrorFaithful() {
        if (this.faithful <= 0 || this.faithful > 100) {
            throw new RuntimeException("Поле faithful заполнено не корректно");
        }
    }

    public void checkErrorHonest() {
        if (this.honest <= 0 || this.honest > 100) {
            throw new RuntimeException("Поле honest заполнено не корректно");
        }
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
        } else {
            System.out.println(second.getFullName() + " лучший Пуффендуйец, чем " + this.getFullName());
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        if (hardworking < 0 || hardworking > 100) {
            System.out.println(hardworking + " параметр hardworking задан не корректно!");
            return;
        }
        this.hardworking = hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        if (faithful < 0 || faithful > 100) {
            System.out.println(faithful + " параметр faithful задан не корректно!");
            return;
        }
        this.faithful = faithful;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        if (honest < 0 || honest > 100) {
            System.out.println(honest + " параметр honest задан не корректно!");
            return;
        }
        this.honest = honest;
    }
}
