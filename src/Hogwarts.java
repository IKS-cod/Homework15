public class Hogwarts {
    private final String fullName;
    private int powerOfMagic;
    private int distanceTransgression;

    public Hogwarts(String fullName, int powerOfMagic, int distanceTransgression) {
        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;
        this.fullName = fullName;
        checkErrorPowerOfMagic();
        checkErrorDistanceTransgression();
    }
    public void findBestPerson(Hogwarts second) {
        int sumOne=this.getPowerOfMagic() + this.getDistanceTransgression() ;
        int sumTwo=second.getPowerOfMagic() + second.getDistanceTransgression() ;
        System.out.println("У "+ this.getFullName()+" сумма баллов равна "+ sumOne+", а у "+second.getFullName() +"– "+sumTwo);
        if(sumOne>sumTwo){
            System.out.println(this.getFullName() + " обладает большей мощностью магии, чем " + second.getFullName());
        }else {
            System.out.println(second.getFullName() + " обладает большей мощностью магии, чем " + this.getFullName());
        }
    }
    public void checkErrorPowerOfMagic() {
        if (this.powerOfMagic <= 0||this.powerOfMagic >100) {
            throw new RuntimeException("Поле powerOfMagic заполнено не корректно");
        }
    }
    public void checkErrorDistanceTransgression() {
        if (this.distanceTransgression <= 0||this.distanceTransgression >100) {
            throw new RuntimeException("Поле distanceTransgression заполнено не корректно");
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
        if (powerOfMagic < 0 || powerOfMagic > 100) {
            System.out.println(powerOfMagic + " параметр powerOfMagic задан не корректно!");
            return;
        }
        this.powerOfMagic = powerOfMagic;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        if (distanceTransgression < 0 || distanceTransgression > 100) {
            System.out.println(distanceTransgression + " параметр distanceTransgression задан не корректно!");
            return;
        }
        this.distanceTransgression = distanceTransgression;


    }
}
