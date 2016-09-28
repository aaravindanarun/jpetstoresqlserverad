package org.mybatis.jpetstore.web.actions;

import java.util.ArrayList;
import java.util.List;
import net.sourceforge.stripes.action.Resolution;
import org.junit.*;
import static org.junit.Assert.*;
import org.mybatis.jpetstore.domain.Account;
import org.mybatis.jpetstore.domain.Product;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * The class <code>AccountActionBeanTest</code> contains tests for the class <code>{@link AccountActionBean}</code>.
 *
 * @generatedBy CodePro at 1/15/14 1:42 PM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class AccountActionBeanTest {
	/**
	 * Run the AccountActionBean() constructor test.
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testAccountActionBean_1()
		throws Exception {
		AccountActionBean result = new AccountActionBean();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the Resolution editAccount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	

	/**
	 * Run the Resolution editAccountForm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testEditAccountForm_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		Resolution result = fixture.editAccountForm();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Account getAccount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testGetAccount_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		Account result = fixture.getAccount();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getState());
		assertEquals(null, result.getCountry());
		assertEquals(null, result.getPassword());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getEmail());
		assertEquals(null, result.getUsername());
		assertEquals(null, result.getFirstName());
		assertEquals(null, result.getLastName());
		assertEquals(null, result.getAddress1());
		assertEquals(null, result.getAddress2());
		assertEquals(null, result.getCity());
		assertEquals(null, result.getZip());
		assertEquals(null, result.getPhone());
		assertEquals(false, result.isListOption());
		assertEquals(null, result.getFavouriteCategoryId());
		assertEquals(null, result.getLanguagePreference());
		assertEquals(false, result.isBannerOption());
		assertEquals(null, result.getBannerName());
	}

	/**
	 * Run the List<String> getCategories() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testGetCategories_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		List<String> result = fixture.getCategories();

		// add additional test code here
		assertNotNull(result);
		assertEquals(5, result.size());
		assertTrue(result.contains("FISH"));
		assertTrue(result.contains("DOGS"));
		assertTrue(result.contains("REPTILES"));
		assertTrue(result.contains("CATS"));
		assertTrue(result.contains("BIRDS"));
	}

	/**
	 * Run the List<String> getLanguages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testGetLanguages_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		List<String> result = fixture.getLanguages();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
		assertTrue(result.contains("english"));
		assertTrue(result.contains("japanese"));
	}

	/**
	 * Run the List<Product> getMyList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testGetMyList_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		List<Product> result = fixture.getMyList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testGetPassword_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		String result = fixture.getPassword();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getUsername() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testGetUsername_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		String result = fixture.getUsername();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean isAuthenticated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testIsAuthenticated_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		boolean result = fixture.isAuthenticated();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAuthenticated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testIsAuthenticated_2()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		boolean result = fixture.isAuthenticated();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAuthenticated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testIsAuthenticated_3()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		boolean result = fixture.isAuthenticated();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAuthenticated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testIsAuthenticated_4()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		boolean result = fixture.isAuthenticated();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Resolution newAccount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	
	/**
	 * Run the Resolution newAccountForm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testNewAccountForm_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		Resolution result = fixture.newAccountForm();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setMyList(List<Product>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testSetMyList_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();
		List<Product> myList = new ArrayList<Product>();

		fixture.setMyList(myList);

		// add additional test code here
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testSetPassword_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();
		String password = "";

		fixture.setPassword(password);

		// add additional test code here
	}

	/**
	 * Run the void setUsername(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testSetUsername_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();
		String username = "";

		fixture.setUsername(username);

		// add additional test code here
	}

	/**
	 * Run the Resolution signoff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	

	/**
	 * Run the Resolution signon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	

	/**
	 * Run the Resolution signon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	

	/**
	 * Run the Resolution signonForm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Test
	public void testSignonForm_1()
		throws Exception {
		AccountActionBean fixture = new AccountActionBean();
		fixture.setMyList(new ArrayList<Product>());
		fixture.context = new ActionBeanContext();

		Resolution result = fixture.signonForm();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 1/15/14 1:42 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AccountActionBeanTest.class);
	}
}