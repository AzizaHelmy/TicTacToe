/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
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

    protected GsonBuilder builder;
    protected Gson gson;
    protected String direName = "src\\records\\";
    public static String loadFileName;
    protected File recordFolder = new File(direName);
    protected FileOutputStream outputFile;
    protected JsonArray arr;
    protected List<buttonDetails> details;
    protected javax.json.JsonReader reader;
    protected JsonStructure jsonst;
    protected javax.json.JsonArray array;
    protected JsonObject object;
    protected buttonDetails detail;
    protected String[] files;

    public void recordSteps(ArrayList<Object> details, String fileName) {
        builder = new GsonBuilder();
        gson = builder.create();

        try {
            outputFile = new FileOutputStream(direName + fileName);
            arr = gson.toJsonTree(details).getAsJsonArray();
            outputFile.write(arr.toString().getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(saveSteps.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(saveSteps.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<buttonDetails> loadScreen() {
        details = new ArrayList<>();

        try {
            reader = Json.createReader(new FileReader(direName + loadFileName));
            jsonst = reader.read();
            if (jsonst.getValueType() == JsonStructure.ValueType.ARRAY) {
                array = (javax.json.JsonArray) jsonst;

                for (int i = 0; i < array.size(); i++) {
                    object = (JsonObject) array.get(i);
                    detail = new buttonDetails();
                    detail.setId(object.getString("id"));
                    detail.setContent(object.getString("content"));
                    details.add(detail);
                    System.out.println(details.get(i).getContent() + "  " + details.get(i).getId());
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(saveSteps.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }

    public String[] recordedFiles() {
        files = recordFolder.list();
        return files;
    }
}
