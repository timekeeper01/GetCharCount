package mapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * �����ַ���"fdgfdnkughiueskldm"
 * ��ȡ�ַ�����ÿ����ĸ���ֵĴ�������ʽa(2)b(0)c(2)..
 */
/*
 * �ܴ洢ӳ���ϵ�������������map����(set��Ȼ��֤��Ψһ�ԣ����ǲ��ܴ洢ӳ���ϵ)
 * ��ϵһ�������������ţ�ʹ��map�������Ա�֤Ψһ�Ե�һ���߱���˳��abc
 * ʹ��treeset
 * 
 * �������մ洢��Ӧ������ĸ�ʹ�����Ӧ��ϵ
 * 
 * 1.�Ƚ��ַ�������ַ�����
 * 2.�����ַ����飬��ÿһ����ĸ��Ϊ��ȥ��map����
 * 	�����ĸ�����ڣ��ͽ�����ĸ��Ϊ����1��Ϊֵ�洢��map������
 * 	������ڣ��ͽ�����ĸ����Ӧֵȡ����+1���ٽ�����ĸ��+1���ֵ�洢��map������
 * 	����ͬ��ֵ�Ḳ�ǣ������ͼ�¼�˸���ĸ�ĳ��ִ���
 */

//���ü���ֵ���������Ϊnull��˵�������������


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
			//������������ĸ��Ϊ��ȥ�����ȡ��
			Integer value=map.get(chs[i]);
//			if(value==null)//���û�����ֵ
//				map.put(chs[i], 1);
//			else {//��������ֵ
//				value++;
//				map.put(chs[i], value);
//			}
			
			int count=0;//���ڼ�¼����
			if(value!=null) {
				count=value;
			}
			count++;
			map.put(chs[i], count);
		}
		
		return toString(map);
	}

	//��map�����е�Ԫ��ת��ָ����ʽ���ַ���
	private static String toString(Map<Character, Integer> map) {
		//���ݶ࣬�������Ͷ�Ҫ����ַ�����ʹ��StringBUilder
		StringBuilder sb=new StringBuilder();
		Set<Character> keyset=map.keySet();
		for (Iterator<Character> it = keyset.iterator(); it.hasNext();) {
			Character key =  it.next();
			Integer value=map.get(key);
			//��ֵ�洢��sb��
			sb.append(key+"("+value+")");	
		}
		return sb.toString();
	}

}

