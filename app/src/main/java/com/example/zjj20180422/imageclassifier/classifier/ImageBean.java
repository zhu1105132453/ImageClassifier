package com.example.zjj20180422.imageclassifier.classifier;

/**
 * Created by Zjj on 2018/4/21.
 */

public class ImageBean {
    
    private String date;
    private String bestLabel;
    private String labels;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getBestLabel() {
        return bestLabel;
    }

    public void setBestLabel(String bestLabel) {
        this.bestLabel = bestLabel;
    }

}
