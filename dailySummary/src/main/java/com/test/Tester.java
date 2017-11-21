package com.test;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String args[]) {


        try {
            System.out.println("****************\n" +
                    "http://api.wunderground.com/api/3991450d3e2b38b0/history_20171030/q/NY/New_York.json"
            );
            JsonObject data = ParseJsonDataFromUrl.getData("http://api.wunderground.com/api/3991450d3e2b38b0/history_20171030/q/NY/New_York.json");

            String maxHumidity = data.get("history").getAsJsonObject().get("dailysummary").getAsJsonArray().get(0).getAsJsonObject().get("maxhumidity").getAsString();

            String maxTempM = data.get("history").getAsJsonObject().get("dailysummary").getAsJsonArray().get(0).getAsJsonObject().get("maxtempm").getAsString();

            String minTempM = data.get("history").getAsJsonObject().get("dailysummary").getAsJsonArray().get(0).getAsJsonObject().get("mintempm").getAsString();

            String precipM = data.get("history").getAsJsonObject().get("dailysummary").getAsJsonArray().get(0).getAsJsonObject().get("precipm").getAsString();


            double precip = Double.parseDouble(precipM) * 10;

            precipM = String.valueOf(precip);

            Metrics metrics = new Metrics(maxHumidity, maxTempM, minTempM, precipM);

            Functions.emitData(metrics);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
