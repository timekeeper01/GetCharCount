package mapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 给定字符串"fdgfdnkughiueskldm"
 * 获取字符串中每个字母出现的次数，格式a(2)b(0)c(2)..
 */
/*
 * 能存储映射关系的容器有数组和map集合(set虽然保证了唯一性，但是不能存储映射关系)
 * 关系一方不存在有序编号，使用map，还可以保证唯一性的一方具备着顺序abc
 * 使用treeset
 * 
 * 集合最终存储的应该是字母和次数对应关系
 * 
 * 1.先将字符串变成字符数组
 * 2.遍历字符数组，用每一个字母作为键去查map集合
 * 	如果字母不存在，就将该字母作为键，1作为值存储到map集合中
 * 	如果存在，就将该字母键对应值取出并+1，再将该字母和+1后的值存储到map集合中
 * 	键相同，值会覆盖，这样就记录了该字母的出现次数
 */

//利用键查值，如果返回为null，说明不存在这个键


public class GetCharCount {

	public static void main(String[] args) {
		String str="ni..usazvcnbccnosewa";
		String char_count=getCharCount(str);
		System.out.println(char_count);
	}

	private static String getCharCount(String str) {
		char[] chs=str.toCharArray();
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for (int i = 0; i < chs.length; i++) {
			if(!(chs[i]>='a'&&chs[i]<='z'||chs[i]>='a'&&chs[i]<='z'))
				continue;
			//将遍历到的字母作为键去查表，获取表
			Integer value=map.get(chs[i]);
//			if(value==null)//如果没有这个值
//				map.put(chs[i], 1);
//			else {//如果有这个值
//				value++;
//				map.put(chs[i], value);
//			}
			
			int count=0;//用于记录次数
			if(value!=null) {
				count=value;
			}
			count++;
			map.put(chs[i], count);
		}
		
		return toString(map);
	}

	//将map集合中的元素转成指定格式的字符串
	private static String toString(Map<Character, Integer> map) {
		//数据多，无论类型都要变成字符串，使用StringBUilder
		StringBuilder sb=new StringBuilder();
		Set<Character> keyset=map.keySet();
		for (Iterator<Character> it = keyset.iterator(); it.hasNext();) {
			Character key =  it.next();
			Integer value=map.get(key);
			//将值存储到sb中
			sb.append(key+"("+value+")");	
		}
		return sb.toString();
	}

}

