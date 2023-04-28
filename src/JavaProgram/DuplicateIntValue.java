package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class DuplicateIntValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] value={23,45,67,1,45,23,1};
		
		ArrayList <Integer> arr=new ArrayList<Integer>();
		
		for(int i=0;i<value.length;i++) {
			arr.add(value[i]);
		}
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.size();i++){
			map.putIfAbsent(arr.get(i), Collections.frequency(arr, arr.get(i)));
		}
       System.out.print(map);
	}

}
