package com.test2;

/**
 * Created by vikas.e.mishra on 3/22/2017.
 */
class Rocket {
    void blastOff()

    {
        System.out.println("bang");
    }
    void go(){
        System.out.println("Super Go");
    };
}

public class Shuttle extends Rocket {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        Rocket r = new Shuttle();
//r.go();
        Shuttle s = (Shuttle) new Rocket();
        s.go();

    }

    void go() {
        super.go();
        // TODO Auto-generated method stub
        System.out.println("Sub Go");
        blastOff();
        //Rocket.blastOff();
    }
    public void blastOff(){
        System.out.println("sh-bang");
    }

}
