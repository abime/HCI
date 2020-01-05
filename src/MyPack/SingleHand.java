/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

import java.io.Serializable;

/**
 *
 * @author Ravi
 */
public class SingleHand implements Serializable{
    public double[] handPos;
    public double[] TYPE_THUMB, TYPE_INDEX, TYPE_MIDDLE, TYPE_RING, TYPE_PINKY;
    public SingleHand() {
        handPos = new double[3];
        TYPE_THUMB = new double[3];
        TYPE_INDEX = new double[3];
        TYPE_MIDDLE = new double[3];
        TYPE_RING = new double[3];
        TYPE_PINKY = new double[3];
    }
}
