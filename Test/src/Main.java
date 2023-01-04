import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import Package.Mobile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Mobile mobile=new Mobile();
			//mobile.setName("shree");
		//	System.out.println(mobile.getName());
			
//			HashMap<String, String> mlist = new HashMap<>();
//			mlist.put("samsung","M53");
//			mlist.put("poco","M53");
//			mlist.put("oppo","M53");
//			mlist.put("vivo","M53");
//			
//			Set<String> keys = mlist.keySet();
//			for(String key: keys) {
//				System.out.println(key + " " + mlist.get(key));
//			}
			
			//Mobile m=new Mobile();
			//m.setName("shree");
			
			ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
			mobiles.add(new Mobile("shree",10));
			mobiles.add(new Mobile("pra",2));
			mobiles.add(new Mobile("na",3));
			
			TreeMap<Integer, String> mlist = new TreeMap<>();
			
			for(Mobile m: mobiles) {
				//System.out.println(m.getName()+m.getPrice());
				
				mlist.put(m.getPrice(),m.getName());
			}
			
			Set<Integer> keys = mlist.keySet();
			for(Integer key: keys) {
				System.out.println(key + " " + mlist.get(key));
			}
	}

}
