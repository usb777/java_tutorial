/**
 * 
 */

/**
 * @author DzenDzmitry
 *
 */

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
public class MongoTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
		 MongoClient mongoClient = new MongoClient(connectionString);
		MongoDatabase database = mongoClient.getDatabase("mydb");
		MongoDatabase database1 = mongoClient.getDatabase("dzen");
		
		MongoCollection<Document> collection = database.getCollection("test");
		MongoCollection<Document> collection1 = database1.getCollection("dzmitry");
		
		Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));
		
		collection.insertOne(doc);
		collection1.insertOne(doc);
		List<Document> documents = new ArrayList<Document>();
		
		for (int i = 0; i < 100; i++) 
		{
		    documents.add(new Document("i", i));
		}
		
		collection.insertMany(documents);
		
		
		
		System.out.println(collection.count());
		
		System.out.println(doc.values());
	}

}
