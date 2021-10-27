package com.incs870.myapplication;

import com.incs870.contentdetector.action.CallToAction;
import com.incs870.contentdetector.models.Detector;

public class TestContent {

    public static void main(String[] args) {
        Detector detector = new Detector();
        detector.setZip("V6Y 4M3");
        detector.setTextContent("This is a text message");
        detector.setCity("Richmond");
        detector.setProvince("BC");
        detector.setTimeStamp("2021-10-26 21:19:45");
        detector.setUserId("tes1t@gmail.com");
        CallToAction.sendUserInfoForSA(detector);
    }
}
