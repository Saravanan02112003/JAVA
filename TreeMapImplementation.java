package first;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImplementation {
	static void SampleTree()
	{
		Map<String,Integer> treemap= new TreeMap<String,Integer>();
		//adding elements to the tree map
		treemap.put("one", 1);//olog(n),D(n)---storing element in tree map,n is not of element
		treemap.put("two", 2);
		treemap.put("three", 3);
		treemap.put("four", 4);
		treemap.put("five", 5);
		treemap.put("six", 6);
		System.out.println("Tree map"+treemap);
		//getting the elements from the tree map
		//int valueA=treemap.get("three");//o(log n)
		//System.out.println("tree map "+valueA);
		System.out.println("first key "+treemap.firstkey());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
