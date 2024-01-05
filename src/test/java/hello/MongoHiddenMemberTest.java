package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.mongodb.MongoClient;

public class MongoHiddenMemberTest {

    @Test
    public void startSessionOnHiddenMember() {
        MongoClient client = new MongoClient("localhost", 27021);
        assertDoesNotThrow(() -> {
            client.startSession();
        });
        client.close();
    }
}