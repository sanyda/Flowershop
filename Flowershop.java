package Flowershop;

import java.util.Arrays;

public class Flowershop {
    Bouquet[] default_bouquet_arr;
    Flowershop(Bouquet[] default_bouquet_arr){
        this.default_bouquet_arr = default_bouquet_arr;
    }

    Bouquet form_your_boquet(Flower[] flowers){
        Bouquet bouquet = new Bouquet(flowers);
        if(Arrays.asList(default_bouquet_arr).contains(bouquet)){
            System.out.println("This bouquet is already formed");
            return null;
        }
        else{
            return bouquet;
        }


    }
    void sell(Bouquet bouquet){
        System.out.println("Your flowers are waiting for you! Come and take them! It's" + bouquet.total_price+"UAH");

    }
}
