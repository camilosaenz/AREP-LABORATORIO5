package edu.escuelaing.arep.LogService;

import java.util.ArrayList;
import java.util.Date;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConexionDB
{
    MongoClientURI uri;
    MongoClient mongoCliente;
    

    public ConexionDB() 
    {
        uri = new MongoClientURI("mongodb+srv://camilo:Nicolassaenz02@cluster0.gojsk.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        

        
        mongoCliente = new MongoClient(uri);
    }
    

    public void insertarMensaje(Mensaje mensaje)
    {
        mongoCliente = new MongoClient(uri);
        MongoDatabase database = mongoCliente.getDatabase("areplab5");
        MongoCollection<Document> coleccion =database.getCollection("mensajes");
        Document documento=new Document();
        documento.put("mensajes",mensaje.getMensaje());
        documento.put("fecha",mensaje.getFecha());
        coleccion.insertOne(documento);
    }
    

    public ArrayList<Mensaje> getMensaje() 
    {
        MongoDatabase database = mongoCliente.getDatabase("areplab5");
        MongoCollection<Document> coleccion = database.getCollection("mensajes");
        FindIterable findIterable = coleccion.find();
        ArrayList<Document> documento = new ArrayList<Document>();
        ArrayList<Mensaje> mensaje = new ArrayList<Mensaje>();
        findIterable.into(documento);
        for (Document doc : documento) {
            if (doc.get("mensajes") != null && doc.get("fecha") != null) {
            	mensaje.add(new Mensaje((String) doc.get("mensajes"), (Date) doc.get("fecha")));
            }
        }
        return mensaje;
   }
}
