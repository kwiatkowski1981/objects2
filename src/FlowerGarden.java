public class FlowerGarden {
    public static void main(String[] args) {

        Plant plant1 = new Plant();
        plant1.name = "rose";
        plant1.color = "red";
        plant1.height = 110;
        plant1.weight = 05;
        String plant1Info = plant1.name + ", " + plant1.color + ", " + plant1.height + "Cm" + ", " + plant1.weight + "Gr";


        Plant plant2 = new Plant();
        plant2.name = "rose";
        plant2.color = "white";
        plant2.height = 121;
        plant2.weight = 88;
        String plant2Info = plant2.name + ", " + plant2.color + ", " + plant2.height + "Cm" + ", " + plant2.weight + "Gr";


        Plant plant3 = new Plant();
        plant3.name = "rose";
        plant3.color = "black";
        plant3.height = 120;
        plant3.weight = 96;
        String plant3Info = plant3.name + ", " + plant3.color + ", " + plant3.height + "Cm" + ", " + plant3.weight + "Gr";


        Plant plant4 = new Plant();
        plant4.name = "cactus";
        plant4.color = "green";
        plant4.height = 26;
        plant4.weight = 105;
        String plant4Info = plant4.name + ", " + plant4.color + ", " + plant4.height + "Cm" + ", " + plant4.weight + "Gr";

        System.out.println(plant1Info);
        System.out.println(plant2Info);
        System.out.println(plant3Info);
        System.out.println(plant4Info);

    }

}
