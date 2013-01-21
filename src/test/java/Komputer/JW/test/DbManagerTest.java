package Komputer.JW.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import Komputer.JW.business.*;
import Komputer.JW.business.services.Client;
import Komputer.JW.business.services.DbAdapter;

public class DbManagerTest {

	DbAdapter db = new DbAdapter();

	private final static String NAME_1 = "Adam";
	private final static String SURNAME_1 = "Kolwaski";

	@Test
	public void checkConnection() {
		assertNotNull(db = new DbAdapter());
	}

	@Test
	public void checkAdding() {

		Client client = new Client(NAME_1, SURNAME_1, "cus");

		//DbAdapter.clearPersons();
		assertEquals(true, db.save(client));
		List<Client> persons = db.getAll();
		Client personRetrieved = persons.get(0);
		assertEquals(NAME_1, personRetrieved.getName());
		assertEquals(SURNAME_1, personRetrieved.getSurname());

	}

}
