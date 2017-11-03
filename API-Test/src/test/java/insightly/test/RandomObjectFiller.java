package insightly.test;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import insightly.model.v22.Contact;
 
public class RandomObjectFiller {
 
    private Random random = new Random();
 
    public <T> T make(Class<T> clazz) throws Exception{
        T instance = clazz.newInstance();
        return instance;
    }
    
    public Contact createContact() {
		try {
			return make(Contact.class);
		}
		catch(Exception ex) {
			return null;
		}
    }
}