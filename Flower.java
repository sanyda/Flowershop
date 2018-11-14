package Flowershop;

class Flower {
    String flower_type;
    String color;
    int length_of_stem;
    String odor;
    String country;
    float price;
    Flower(String flower_type, String color,int length_of_stem,String odor,String country,float price){
        this.flower_type = flower_type;
        this.color = color;
        this.length_of_stem = length_of_stem;
        this.odor = odor;
        this.country = country;
        this.price = price;

    }
}



class Bouquet {
    Flower[] flowers;
    float total_price = 0;
    Bouquet(Flower[] flowers){
        this.flowers = flowers;
        for(Flower f:this.flowers){
            this.total_price += f.price;
        }


    }



}