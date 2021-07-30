package dept;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dept.dao.DeptDao;
import dept.domain.Dept;
import jdbc.util.ConnectionProvider;

public class DeptDaoTest {
	
	static DeptDao dao;
	static Connection conn;
	static Dept dept;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = dao.getInstance();
		conn = ConnectionProvider.getConnection();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getDeptList() {
		List<Dept> list = dao.getDeptList(conn);
		assertNotNull("리스트 생성 확인",list); 
	}
	
	@Test
	public void insertDept() {
		int result = dao.insertDept(conn, new Dept(11, "test","서울"));
		assertSame("dept insert 확인", result, 1);
	}
	
	@Test
	public void deleteDept() {
		int result = dao.deleteDept(conn, 11);
		assertSame("dept delete 확인", result, 1);
	}
	
	@Test
	public void selectByDeptno() {
		dept = dao.selectByDeptno(conn, 10);
		assertNotNull("해당하는 deptno 선택 확인", dept);
	}
	
	@Test
	public void updateDept() {
		int result = dao.updateDept(conn, new Dept(12, "test1", "안산"));
		assertSame("해당하는 deptno 수정 확인", result, 1);
	}
	

	

}
