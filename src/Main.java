public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Griffindor("Гарри Поттер", 10, 10, 10,
                        10, 10),
                new Griffindor("Гермиона Грейнджер", 11, 11, 11,
                        11, 11),
                new Griffindor("Рон Уизли", 12, 12, 12, 12,
                        12),
                new Puffendui("Захария Смит", 13, 13, 13,
                        13, 13),
                new Puffendui("Седрик Диггори", 14, 14, 14,
                        14, 14),
                new Puffendui("Джастин Финч-Флетчли", 15, 15, 15,
                        15, 15),
                new Kogtevran("Чжоу Чанг", 16, 16, 16, 16,
                        16, 16),
                new Kogtevran("Падма Патил", 17, 17, 17, 17,
                        17, 17),
                new Kogtevran("Маркус Белби", 18, 18, 18, 18,
                        18, 18),
                new Slizerin("Драко Малфой", 19, 19, 19, 19,
                        19, 19, 19),
                new Slizerin("Грэхэм Монтегю", 20, 20, 20, 20,
                        20, 20, 20),
                new Slizerin("Грегори Гойл", 21, 21, 21, 21,
                        21, 21, 21)
        };
        Hogwarts.printInfo(hogwarts);
        System.out.println();
        Griffindor garri = new Griffindor("Гарри Поттер", 10, 10, 10,
                10, 10);
        Griffindor germion = new Griffindor("Гермиона Грейнджер", 11, 11, 11,
                11, 11);
        garri.findBestPerson(germion);
        System.out.println();
        Puffendui zahariy = new Puffendui("Захария Смит", 13, 13, 13,
                99, 13);
        Puffendui sedrik = new Puffendui("Седрик Диггори", 14, 14, 14,
                14, 14);
        zahariy.findBestPerson(sedrik);
        System.out.println();
        Kogtevran padma = new Kogtevran("Падма Патил", 17, 17, 17, 17,
                17, 17);
        Kogtevran markus = new Kogtevran("Маркус Белби", 18, 18, 18, 18,
                18, 18);
        padma.findBestPerson(markus);
        System.out.println();
        Slizerin grehem = new Slizerin("Грэхэм Монтегю", 20, 20, 20, 20,
                20, 20, 20);
        Slizerin gregori = new Slizerin("Грегори Гойл", 21, 21, 20, 20,
                20, 20, 20);
        grehem.findBestPerson(gregori);
        System.out.println();
        Hogwarts ron = new Griffindor("Рон Уизли", 99, 12, 12, 12,
                12);
        Hogwarts drako = new Slizerin("Драко Малфой", 99, 12, 19, 19,
                19, 19, 19);
        ron.findBestPerson(drako);
    }
}