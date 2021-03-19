/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.optimizeddiagnosticsystem.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.text.Document;

/**
 *
 * @author FailOverflow
 */
public class MongoDBManager {

    DB dataBase;
    DBCollection collection;
    BasicDBObject mainDocument = new BasicDBObject();

    public MongoDBManager() {

    }

    public void openConnection() {
        try {
            //MongoClientURI uri = new MongoClientURI(
            //      "mongodb+srv://tentacle:atlas1234@cluster0.pq2gf.mongodb.net/FailOverFlow?retryWrites=true&w=majority");

            //MongoClient mongoClient = new MongoClient(uri);
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            //MongoDatabase database = mongoClient.getDatabase("FailOverflow");
            //MongoCollection<org.bson.Document> collections = database.getCollection("FailOverflow");
            dataBase = mongoClient.getDB("FailOverflow");
            collection = dataBase.getCollection("FailOverflow");

        } catch (Exception ex) {
            System.out.println("The connection was unsuccesfull");
        }

    }

    /*public void id(String id) {
        mainDocument.put("id", id);
    }*/
    public void save(String option, BasicDBObject basicObject, String dBCollection) {
        openConnection();
        collection = dataBase.getCollection(dBCollection);

        if ("Register".equals(option)) {
            collection.insert(basicObject);
        } else if ("Clinic History".equals(option)) {
            collection.insert(mainDocument);
        }
    }

    public String read(String dBCollection) {
        openConnection();
        collection = dataBase.getCollection(dBCollection);

        DBCursor cursor = collection.find();
        String name = "";

        while (cursor.hasNext()) {
            System.out.println(cursor.next().get("Name"));
            name = "Name: " + cursor.curr().get("Name");
            return name;
        }
        return name;
    }

    public void deleteObject(String search, String basicObject, String dBCollection, boolean decision) {
        openConnection();
        collection = dataBase.getCollection(dBCollection);
        if (decision) {
            collection.remove(new BasicDBObject().append(basicObject, search));
        }
    }

    public String[] readPassword(String search, String dBCollection) {
        openConnection();
        collection = dataBase.getCollection(dBCollection);

        String[] user = new String[2];

        BasicDBObject consultation = new BasicDBObject();
        consultation.put("Name", search);

        DBCursor cursor = collection.find(consultation);

        while (cursor.hasNext()) {
            user[0] = (String) cursor.next().get("Name");
            user[1] = (String) cursor.curr().get("Password");
        }
        return user;
    }

    public DB getDataBase() {
        return dataBase;
    }

    public void setDataBase(DB dataBase) {
        this.dataBase = dataBase;
    }

    public DBCollection getCollection() {
        return collection;
    }

    public void setCollection(DBCollection collection) {
        this.collection = collection;
    }

    public BasicDBObject getMainDocument() {
        return mainDocument;
    }

    public void setMainDocument(BasicDBObject mainDocument) {
        this.mainDocument = mainDocument;
    }

}
