package mapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		/*
		 * ȥ��map�����е�Ԫ��
		 * ����-������
		 */
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("xiaoming", "beijing");
		map.put("xiaohong", "tianjin");
		map.put("daniu", "hebei");
		map.put("daming", "heilongjiang");
		
//		System.out.println(map.get("daming"));
//
//		//keysetȡ�����еļ������洢��set����(�����ظ�)
//		//map����û�е����������Խ�mapת��Ϊset���ϣ���ʹ�õ�����
//		Set<String> keySet=map.keySet();
//		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
//			String key = iterator.next();
//			String value=map.get(key);
//			System.out.println(key+":"+value);
//		}
		
//		//entrysetȡ��Ԫ��
//		Set<Map.Entry<String,String>> entrySet=map.entrySet();
//		for (Iterator<Map.Entry<String,String>>  iterator = entrySet.iterator(); iterator.hasNext();) {
//			Map.Entry<String, String> me=iterator.next();
//			String key=me.getKey();
//			String value=me.getValue();
//			System.out.println(key+":"+value);
//		}
		
		//values()
		Collection<String> values=map.values();
		for (Iterator<String> it = values.iterator(); it.hasNext();) {
			String value=it.next();
			System.out.println(value);
			
		}
		
	}

		
}
