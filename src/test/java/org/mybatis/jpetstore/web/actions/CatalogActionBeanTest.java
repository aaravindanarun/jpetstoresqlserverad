package org.mybatis.jpetstore.web.actions;


import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.mybatis.jpetstore.domain.Category;
import net.sourceforge.stripes.action.ActionBeanContext;
import org.mybatis.jpetstore.domain.Item;
import org.mybatis.jpetstore.domain.Product;
import org.mybatis.jpetstore.web.actions.*;
import net.sourceforge.stripes.action.ForwardResolution;

/**
 * The class <code>CatalogActionBeanTest</code> contains tests for the class <code>{@link CatalogActionBean}</code>.
 *
 * @generatedBy CodePro at 1/15/14 1:51 PM
 * @author Administrator
 * @version $Revision: 1.0 $
 */
public class CatalogActionBeanTest {
	/**
	 * Run the CatalogActionBean() constructor test.
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testCatalogActionBean_1()
		throws Exception {
		CatalogActionBean result = new CatalogActionBean();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the Category getCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		Category result = fixture.getCategory();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getCategoryId());
	}

	/**
	 * Run the String getCategoryId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetCategoryId_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		String result = fixture.getCategoryId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<Category> getCategoryList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetCategoryList_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		List<Category> result = fixture.getCategoryList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Item getItem() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		Item result = fixture.getItem();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(null-null)", result.toString());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getProduct());
		assertEquals(null, result.getProductId());
		assertEquals(null, result.getItemId());
		assertEquals(0, result.getQuantity());
		assertEquals(null, result.getListPrice());
		assertEquals(null, result.getUnitCost());
		assertEquals(null, result.getAttribute1());
		assertEquals(0, result.getSupplierId());
		assertEquals(null, result.getAttribute2());
		assertEquals(null, result.getAttribute3());
		assertEquals(null, result.getAttribute4());
		assertEquals(null, result.getAttribute5());
	}

	/**
	 * Run the String getItemId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetItemId_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		String result = fixture.getItemId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<Item> getItemList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetItemList_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		List<Item> result = fixture.getItemList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getKeyword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetKeyword_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		String result = fixture.getKeyword();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Product getProduct() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetProduct_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		Product result = fixture.getProduct();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getCategoryId());
		assertEquals(null, result.getProductId());
	}

	/**
	 * Run the String getProductId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetProductId_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		String result = fixture.getProductId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the List<Product> getProductList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testGetProductList_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		List<Product> result = fixture.getProductList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ForwardResolution searchProducts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	

	/**
	 * Run the void setCategory(Category) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetCategory_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		Category category = new Category();

		fixture.setCategory(category);

		// add additional test code here
	}

	/**
	 * Run the void setCategoryId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetCategoryId_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		String categoryId = "";

		fixture.setCategoryId(categoryId);

		// add additional test code here
	}

	/**
	 * Run the void setCategoryList(List<Category>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetCategoryList_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		List<Category> categoryList = new ArrayList<Category>();

		fixture.setCategoryList(categoryList);

		// add additional test code here
	}

	/**
	 * Run the void setItem(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetItem_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		Item item = new Item();

		fixture.setItem(item);

		// add additional test code here
	}

	/**
	 * Run the void setItemId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetItemId_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		String itemId = "";

		fixture.setItemId(itemId);

		// add additional test code here
	}

	/**
	 * Run the void setItemList(List<Item>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetItemList_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		List<Item> itemList = new ArrayList<Item>();

		fixture.setItemList(itemList);

		// add additional test code here
	}

	/**
	 * Run the void setKeyword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetKeyword_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		String keyword = "";

		fixture.setKeyword(keyword);

		// add additional test code here
	}

	/**
	 * Run the void setProduct(Product) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetProduct_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		Product product = new Product();

		fixture.setProduct(product);

		// add additional test code here
	}

	/**
	 * Run the void setProductId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetProductId_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		String productId = "";

		fixture.setProductId(productId);

		// add additional test code here
	}

	/**
	 * Run the void setProductList(List<Product>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testSetProductList_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();
		List<Product> productList = new ArrayList<Product>();

		fixture.setProductList(productList);

		// add additional test code here
	}

	/**
	 * Run the ForwardResolution viewCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	

	/**
	 * Run the ForwardResolution viewCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testViewCategory_2()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId((String) null);
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		ForwardResolution result = fixture.viewCategory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ForwardResolution{path='/WEB-INF/jsp/catalog/Category.jsp'}", result.toString());
		assertEquals("/WEB-INF/jsp/catalog/Category.jsp", result.getPath());
		assertEquals(null, result.getEvent());
		assertEquals(false, result.isEventSpecified());
	}

	/**
	 * Run the ForwardResolution viewItem() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	

	/**
	 * Run the ForwardResolution viewMain() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	@Test
	public void testViewMain_1()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId("");
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		ForwardResolution result = fixture.viewMain();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ForwardResolution{path='/WEB-INF/jsp/catalog/Main.jsp'}", result.toString());
		assertEquals("/WEB-INF/jsp/catalog/Main.jsp", result.getPath());
		assertEquals(null, result.getEvent());
		assertEquals(false, result.isEventSpecified());
	}

	/**
	 * Run the ForwardResolution viewProduct() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	
	@Test
	public void testViewProduct_2()
		throws Exception {
		CatalogActionBean fixture = new CatalogActionBean();
		fixture.setCategoryId("");
		fixture.setItemId("");
		fixture.setProductId((String) null);
		fixture.setItem(new Item());
		fixture.setKeyword("");
		fixture.setCategory(new Category());
		fixture.setProductList(new ArrayList<Product>());
		fixture.setItemList(new ArrayList<Item>());
		fixture.setProduct(new Product());
		fixture.setCategoryList(new ArrayList<Category>());
		fixture.context = new ActionBeanContext();

		ForwardResolution result = fixture.viewProduct();

		// add additional test code here
		assertNotNull(result);
		assertEquals("ForwardResolution{path='/WEB-INF/jsp/catalog/Product.jsp'}", result.toString());
		assertEquals("/WEB-INF/jsp/catalog/Product.jsp", result.getPath());
		assertEquals(null, result.getEvent());
		assertEquals(false, result.isEventSpecified());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/15/14 1:51 PM
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
	 * @generatedBy CodePro at 1/15/14 1:51 PM
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
	 * @generatedBy CodePro at 1/15/14 1:51 PM
	 */
	public static void main(String[] args) {
		//new org.junit.runner.JUnitCore().run(CatalogActionBeanTest.class);
	}
}