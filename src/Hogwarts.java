public abstract class Hogwarts {
    private final String fullName;
    private int powerOfMagic;
    private int distanceTransgression;

    public Hogwarts(String fullName, int powerOfMagic, int distanceTransgression) {
        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;
        this.fullName = fullName;
        checkErrorСharacteristic(powerOfMagic);
        checkErrorСharacteristic(distanceTransgression);

    }

    public void checkErrorСharacteristic(int characteristic) {
        if (characteristic <= 0 || characteristic > 100) {
            throw new RuntimeException("Поле заполнено не корректно");
        }
    }

    public void findBestPerson(Hogwarts second) {
        int sumOne = this.getPowerOfMagic() + this.getDistanceTransgression();
        int sumTwo = second.getPowerOfMagic() + second.getDistanceTransgression();
        System.out.println("У " + this.getFullName() + " сумма баллов равна " + sumOne + ", а у " + second.getFullName() + "– " + sumTwo);
        if (sumOne > sumTwo) {
            System.out.println(this.getFullName() + " обладает большей мощностью магии, чем " + second.getFullName());
        } else if (sumOne < sumTwo) {
            System.out.println(second.getFullName() + " обладает большей мощностью магии, чем " + this.getFullName());
        } else {
            System.out.println("Ученики одинаковы по баллам");
        }
    }

    @Override
    public String toString() {
        return "ФИО -'" + fullName + '\'' +
                ", сила магии -" + powerOfMagic +
                ", расстояние трансгрессии -" + distanceTransgression;
    }

    public static void printInfo(Hogwarts[] hogwarts) {
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i] != null) {
                System.out.println(hogwarts[i]);
            }
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        checkErrorСharacteristic(powerOfMagic);
        this.powerOfMagic = powerOfMagic;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        checkErrorСharacteristic(distanceTransgression);
        this.distanceTransgression = distanceTransgression;
    }
}
