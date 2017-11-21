package com.test;

public class Metrics {
    private String maxhumidity;
    private String maxtempm;
    private String mintempm;
    private String precipim;

    public Metrics(String maxhumidity, String maxtempm, String mintempm, String precipim) {
        this.maxhumidity = maxhumidity;
        this.maxtempm = maxtempm;
        this.mintempm = mintempm;
        this.precipim = precipim;
    }

    public Metrics() {}

    public String getMaxhumidity() { return maxhumidity; }

    public void setMaxhumidity(String maxhumidity) { this.maxhumidity = maxhumidity; }

    public String getMaxtempm() { return maxtempm; }

    public void setMaxtempm(String maxtempm) { this.maxtempm = maxtempm; }

    public String getMintempm() { return mintempm; }

    public void setMintempm(String mintempm) { this.mintempm = mintempm; }

    public String getPrecipim() { return precipim; }

    public void setPrecipim(String precipim) {
        this.precipim = precipim;
    }


}
