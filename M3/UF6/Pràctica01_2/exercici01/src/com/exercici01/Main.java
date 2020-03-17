package com.exercici01;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient

public class Main {

    public static void main(String[] args) {

        ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();

        futbolistas.add(new Futbolista("Iker", "Casillas", 33,
                new ArrayList<String>(Arrays.asList("Portero")), true));
        futbolistas.add(new Futbolista("Carles", "Puyol", 36,
                new ArrayList<String>(Arrays.asList("Central", "Lateral")), true));
        futbolistas.add(new Futbolista("Sergio", "Ramos", 28,
                new ArrayList<String>(Arrays.asList("Lateral", "Central")), true));
        futbolistas.add(new Futbolista("Andrés", "Iniesta", 30,
                new ArrayList<String>(Arrays.asList("Centrocampista", "Delantero")), true));
        futbolistas.add(new Futbolista("Fernando", "Torres", 30,
                new ArrayList<String>(Arrays.asList("Delantero")), true));
        futbolistas.add(new Futbolista("Leo", " Baptistao", 22,
                new ArrayList<String>(Arrays.asList("Delantero")), false));



        try {
            // 1 - CONNEXIÓ AL SERVER DE MONGODB
            MongoClient mongoClient = new MongoClient("localhost", 8080);

            // 2 - CONNEXIÓ A LA BD
            DB db = mongoClient.getDB("Futbol");

            // 3 - OBTENIM LA COL·LECCIÓ
            DBCollection collection = db.getCollection("Futbolistas");

            /************************************************************************/

            // 4 - CREATE - INTRODUÏM ELS OBJECTES A LA COL·LECCIÓ
            for (Futbolista fut : futbolistas) {
                collection.insert(fut.toDBObjectFutbolista());
            }

            // 5 - READ - LLEGIM TOTS ELS DOCUMENTS DE LA BD
            int numDocumentos = (int) collection.getCount();
            System.out.println("Número de documents en la col·lecció Futbolistas: " + numDocumentos + "\n");

            // 6 - BUSQUEM DOCUMENTS I ELS IMPRIMIM
            DBCursor cursor = collection.find();
            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toString());
                }
            } finally {
                cursor.close();
            }

            // 7 - READ - BUSQUEM FUTOLISTES QUE SIGUIN DELANTERS
            System.out.println("\nFutbolistas que juegan en la posición de Delantero");
            DBObject query = new BasicDBObject("demarcacion", new BasicDBObject("$regex", "Delantero"));
            cursor = collection.find(query);
            try {
                while (cursor.hasNext()) {
                    Futbolista futbolista = new Futbolista((BasicDBObject) cursor.next());
                    System.out.println(futbolista.toString());
                }
            } finally {
                cursor.close();
            }

            // 8 - UPDATE - ACTUALITZEM L'EDAT DELS JUGADORS A +100 ANYS ALS QUE TINGUIN MÉS DE 30 ANYS
            DBObject find = new BasicDBObject("edad", new BasicDBObject("$gt", 30));
            DBObject updated = new BasicDBObject().append("$inc", new BasicDBObject().append("edad", 100));
            collection.update(find, updated, false, true);

            // 9 - DELETE - ELIMINEM ELS QUE SIGUIN INTERNACIONALS
            DBObject findDoc = new BasicDBObject("internacional", true);
            collection.remove(findDoc);

            // 10 - TANQUEM LAL CONNEXIÓ
            mongoClient.close();

        } catch (UnknownHostException ex) {
            System.out.println("Error al conectar al server de Mongo: " + ex.getMessage());
        }
    }
}
