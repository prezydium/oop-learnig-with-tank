package com.infoshare.oop.jd;

import com.infoshare.oop.jd.body.Tower;

/**
 * Created by Krzysztof Syska
 */
public class Main {

    public static void main(String[] args){

        Tower tower = new Tower("heavy");
        tower.showInfo();

        Tower tower2 = new Tower(1.9);
        tower2.showInfo();

        Tower tower3 = new Tower(2.7, "heavy", 88, 'T');
        tower3.showInfo();


    }
}
