/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Ravi
 */
public class SingleSample implements Serializable {

    public Vector<SingleSample> leftHandSamples;
    public Vector<SingleSample> rightHandSamples;
    public SingleHand leftHand;
    public SingleHand rightHand;
    public String gestureName;
    public String speech;
    public int currHand = -1;
    public boolean leftHandEnabled, rightHandEnabled;

    public SingleSample() {
        leftHandSamples = new Vector<>();
        rightHandSamples = new Vector<>();
        leftHand = new SingleHand();
        rightHand = new SingleHand();
        gestureName = "";
        speech = "";
        leftHandEnabled = rightHandEnabled = false;
    }

    public void setHand(double[][] setData) {
        leftHand.handPos = new double[]{setData[0][0], setData[0][1], setData[0][2]};
        leftHand.TYPE_THUMB = new double[]{setData[0][3], setData[0][4], setData[0][5]};
        leftHand.TYPE_INDEX = new double[]{setData[0][6], setData[0][7], setData[0][8]};
        leftHand.TYPE_MIDDLE = new double[]{setData[0][9], setData[0][10], setData[0][11]};
        leftHand.TYPE_RING = new double[]{setData[0][12], setData[0][13], setData[0][14]};
        leftHand.TYPE_PINKY = new double[]{setData[0][15], setData[0][16], setData[0][17]};


        rightHand.handPos = new double[]{setData[1][0], setData[1][1], setData[1][2]};
        rightHand.TYPE_THUMB = new double[]{setData[1][3], setData[1][4], setData[1][5]};
        rightHand.TYPE_INDEX = new double[]{setData[1][6], setData[1][7], setData[1][8]};
        rightHand.TYPE_MIDDLE = new double[]{setData[1][9], setData[1][10], setData[1][11]};
        rightHand.TYPE_RING = new double[]{setData[1][12], setData[1][13], setData[1][14]};
        rightHand.TYPE_PINKY = new double[]{setData[1][15], setData[1][16], setData[1][17]};
    }

    public double[][] getHand() {
        double setData[][] = new double[2][18];
        setData[0][0] = leftHand.handPos[0];
        setData[0][1] = leftHand.handPos[1];
        setData[0][2] = leftHand.handPos[2];

        setData[0][3] = leftHand.TYPE_THUMB[0];
        setData[0][4] = leftHand.TYPE_THUMB[1];
        setData[0][5] = leftHand.TYPE_THUMB[2];

        setData[0][6] = leftHand.TYPE_INDEX[0];
        setData[0][7] = leftHand.TYPE_INDEX[1];
        setData[0][8] = leftHand.TYPE_INDEX[2];

        setData[0][9] = leftHand.TYPE_MIDDLE[0];
        setData[0][10] = leftHand.TYPE_MIDDLE[1];
        setData[0][11] = leftHand.TYPE_MIDDLE[2];

        setData[0][12] = leftHand.TYPE_RING[0];
        setData[0][13] = leftHand.TYPE_RING[1];
        setData[0][14] = leftHand.TYPE_RING[2];

        setData[0][15] = leftHand.TYPE_PINKY[0];
        setData[0][16] = leftHand.TYPE_PINKY[1];
        setData[0][17] = leftHand.TYPE_PINKY[2];


        setData[1][0] = rightHand.handPos[0];
        setData[1][1] = rightHand.handPos[1];
        setData[1][2] = rightHand.handPos[2];

        setData[1][3] = rightHand.TYPE_THUMB[0];
        setData[1][4] = rightHand.TYPE_THUMB[1];
        setData[1][5] = rightHand.TYPE_THUMB[2];

        setData[1][6] = rightHand.TYPE_INDEX[0];
        setData[1][7] = rightHand.TYPE_INDEX[1];
        setData[1][8] = rightHand.TYPE_INDEX[2];

        setData[1][9] = rightHand.TYPE_MIDDLE[0];
        setData[1][10] = rightHand.TYPE_MIDDLE[1];
        setData[1][11] = rightHand.TYPE_MIDDLE[2];

        setData[1][12] = rightHand.TYPE_RING[0];
        setData[1][13] = rightHand.TYPE_RING[1];
        setData[1][14] = rightHand.TYPE_RING[2];

        setData[1][15] = rightHand.TYPE_PINKY[0];
        setData[1][16] = rightHand.TYPE_PINKY[1];
        setData[1][17] = rightHand.TYPE_PINKY[2];

        return setData;
    }

    public void setSamples(SingleSample currSample) {
        if (leftHandEnabled) {

            
        } else if (rightHandEnabled) {
            
        }
    }
}
