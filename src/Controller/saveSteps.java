/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonStructure;
import model.buttonDetails;

/**
 *
 * @author Salma
 */
public class saveSteps {

    GsonBuilder builder;
    Gson gson;
    String date = Date.valueOf(LocalDate.now()).toString();
    String time = Time.valueOf(LocalTime.now()).toString().replace(":", "-");
    String fileName2 = date + "-" + time + ".json";

    public void recordSteps(ArrayList<Object> details, String fileName) {
        builder = new GsonBuilder();
        gson = builder.create();

        fileName = fileName2;
        try {
            FileOutputStream outputFile = new FileOutputStream(fileName);
            JsonArray arr = gson.toJsonTree(details).getAsJsonArray();
            outputFile.write(arr.toString().getBytes());
            outputFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(saveSteps.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(saveSteps.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<buttonDetails> loadScreen(String fileName) {
        javax.json.JsonReader reader;
        List<buttonDetails> details = new ArrayList<>();

        try {
            reader = Json.createReader(new FileReader(fileName));
            JsonStructure jsonst = reader.read();
            if (jsonst.getValueType() == JsonStructure.ValueType.ARRAY) {
                javax.json.JsonArray array = (javax.json.JsonArray) jsonst;

                for (int i = 0; i < array.size(); i++) {
                    JsonObject object = (JsonObject) array.get(i);
                    buttonDetails detail = new buttonDetails();
                    detail.setId(object.getString("id"));
                    detail.setContent(object.getString("content"));

                    details.add(detail);
                    System.out.println(details.get(0).getContent() + "  " + details.get(0).getId());

                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(saveSteps.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;

    }

}
