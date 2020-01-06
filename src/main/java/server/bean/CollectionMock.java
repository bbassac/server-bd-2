package server.bean;

import java.util.ArrayList;
import java.util.List;

public class CollectionMock {

    public static List<Bd> getCollection() {
        List<Bd> c= new ArrayList<>();
        c.add(new Bd( "1", "Bran le Maudit", "https://www.bedetheque.com/media/Couvertures/Arawn1_26012008_153221.jpg"));
        c.add(new Bd("2", "Les liens du sang", "https://www.bedetheque.com/media/Couvertures/Arawn2_22012009_150322.jpg"));

        return c;
    }


}
