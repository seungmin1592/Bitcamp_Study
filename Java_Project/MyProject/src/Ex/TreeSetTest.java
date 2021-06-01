package Ex;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TreeSet : 트리알고리즘을 이용해서 저장 -> 정렬 (오름차순, 내림차순)
		// 정렬의 기준은 프로그래머 정의 가능
		
		TreeSet<Integer> treeset = new TreeSet<>();
		
		// 데이터 저장
		treeset.add(1);
		treeset.add(5);
		treeset.add(4);
		treeset.add(2);
		treeset.add(1);
		treeset.add(3);
		treeset.add(2);
		
		// 정렬
		Iterator<Integer> itr = treeset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
