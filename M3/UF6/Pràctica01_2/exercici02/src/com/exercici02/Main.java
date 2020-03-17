package com.exercici02;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static java.util.Arrays.asList;
import java.util.LinkedList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class tests for inserting data into MongoDB with <b> insertOne </ b> and <b> insertMany </ b>.
 * Clase de pruebas para la inserción de datos en MongoDB con <b>insertOne</b> y <b>insertMany</b>
 * @author xules
 */

public class JavaMongodbInsertData {

    private MongoClient mongoClient;    // Java MongoDB client (Cliente Java MongoDB)
    private MongoDatabase mongodb;      // Database object (Objeto base de datos)

    /**
     * Obtenemos la lista de todos los restaurantes de la base de datos filtrando
     * por el tipo de cocina con el paso del parámetro <b>cuisine</b> y los mostramos por pantalla.
     * @param cuisine <code>String</code> data value to filter (valor para filtrar)
     */
    public void listRestaurantsByCuisine(String cuisine){
        // We return documents with the find method by setting a <b>criteria</ b> element equal to the cuisine.
        // Devolvemos los documentos con el método find estableciendo un <b>criteria</b> igual para el elemento cuisine.
        FindIterable<Document> iterable = getMongodb().getCollection("restaurants").find(new Document("cuisine", cuisine));
        // Iterate the results and apply a block to each resulting document.
        // Iteramos los resultados y aplicacimos un bloque para cada documento.
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document);
            }
        });
    }

    /**
     * We establish the connection with the database <b>test</b>.
     * Establecemos la conexión con la base de datos <b>test</b>.
     */

    public void connectDatabase(){

        setMongoClient(new MongoClient());
        setMongodb(getMongoClient().getDatabase("test"));
    }

    /**
     * We use the method <b>insertOne</b> to add a document to the database example.
     * Usamos el método <b>insertOne</b> para añadir un documento a la base de datos de ejemplo.
     */

    public void insertOneDataTest(){

        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);

            // We add a document to the database directly (Añadimos un documento a la base de datos directamente).
            getMongodb().getCollection("restaurants").insertOne(

                    new Document("address", asList(
                            new Document()

                                    .append("street", "Avenida Castrelos 25 Bajo")
                                    .append("zipcode", "36210")
                                    .append("building", "180")
                                    .append("coord", asList(-73.9557413, 40.7720266)),

                            new Document()

                                    .append("street", "Urzáiz 77 Bajo")
                                    .append("zipcode", "36004")
                                    .append("building", "40")
                                    .append("coord", asList(-73.9557413, 40.7720266))))

                            .append("borough", "Vigo")
                            .append("cuisine", "Galician")
                            .append("grades", asList(

                                    new Document()

                                            .append("date", format.parse("2015-10-11T00:00:00Z"))
                                            .append("grade", "A")
                                            .append("score", 12),

                                    new Document()

                                            .append("date", format.parse("2015-12-11T00:00:00Z"))
                                            .append("grade", "B")
                                            .append("score", 18)))

                            .append("name", "Xules"));

        } catch (ParseException ex) {

            Logger.getLogger(JavaMongodbInsertData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**

     * We use the method <b>insertMany</b> to add a set of documents to the database example.
     * Usamos el método <b>insertMany</b> para añadir un conjunto de documentos a la base de datos de ejemplo.
     */

    public void insertManyDataTest(){

        try {

            DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);

            // We create a List<Document> (Creamos una List<Document>).
            LinkedList<Document> dataList = new LinkedList<>();

            // We add a document to the list (Añadimos un documento a la lista).
            dataList.add(new Document("address", asList(

                    new Document()

                            .append("street", "Avenida Castrelos 25 Bajo")
                            .append("zipcode", "36210")
                            .append("building", "180")
                            .append("coord", asList(-73.9557413, 40.7720266)),

                    new Document()

                            .append("street", "Urzáiz 77 Bajo")
                            .append("zipcode", "36004")
                            .append("building", "40")
                            .append("coord", asList(-73.9557413, 40.7720266))))

                    .append("borough", "Vigo")
                    .append("cuisine", "Galician")
                    .append("grades", asList(

                            new Document()

                                    .append("date", format.parse("2015-10-11T00:00:00Z"))
                                    .append("grade", "A")
                                    .append("score", 12),

                            new Document()

                                    .append("date", format.parse("2015-12-11T00:00:00Z"))
                                    .append("grade", "B")
                                    .append("score", 18)))

                    .append("name", "Xules"));

            dataList.add(new Document("address", asList(

                    new Document()

                            .append("street", "Avenida Ruz Perez")
                            .append("zipcode", "30204")
                            .append("building", "50")
                            .append("coord", asList(-73.9557413, 40.7720266))))

                    .append("borough", "Ourense")
                    .append("cuisine", "Galician")
                    .append("grades", asList(

                            new Document()

                                    .append("date", format.parse("2015-09-01T00:00:00Z"))
                                    .append("grade", "A")
                                    .append("score", 10),

                            new Document()

                                    .append("date", format.parse("2015-12-01T00:00:00Z"))
                                    .append("grade", "B")
                                    .append("score", 14)))

                    .append("name", "Código Xules"));

            // Now we insert all documents in the database (Ahora introducimos todos los documentos en la base de datos).

            getMongodb().getCollection("restaurants").insertMany(dataList);

        }
        catch (ParseException ex) {

            Logger.getLogger(JavaMongodbInsertData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public MongoClient getMongoClient() {

        return mongoClient;
    }



    public void setMongoClient(MongoClient mongoClient) {

        this.mongoClient = mongoClient;
    }



    public MongoDatabase getMongodb() {

        return mongodb;
    }



    public void setMongodb(MongoDatabase mongodb) {

        this.mongodb = mongodb;
    }

    /**
     * Adding data to the test database MongoDB Java: insertOne and insertMany example.
     * Añadiendo datos a la base test de MongoDB con Java: ejemplos insertOne e insertMany .
     * @param args
     */

    public static void main(String args[]){

        JavaMongodbInsertData javaMongodbInsertData = new JavaMongodbInsertData();
        javaMongodbInsertData.connectDatabase();
        javaMongodbInsertData.insertOneDataTest();
        javaMongodbInsertData.insertManyDataTest();
        javaMongodbList.listRestaurantsByCuisine("Galician");
    }
}