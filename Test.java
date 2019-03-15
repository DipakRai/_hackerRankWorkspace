
public class Test {
	
	public static void main(String[] args) {
		String s="12:45:54PM";
		String array [] = s.split(":");
		int hr=0;
		boolean flag=false;
		String str2=array[array.length-1];
		if(str2.contains("PM")) {
			str2 = str2.substring(0, str2.length()-2);
			array[array.length-1]=str2;
			if(Integer.parseInt(array[0])!=12) {
				hr = Integer.parseInt(array[0])+12;
				flag=true;
			}			
		} else {
			System.out.println(array[0] + " array[0]");
			if(array[0].equals("12")) {
				System.out.println("true");
				hr=00;
				flag=true;
			}
			System.out.println("str2 ="+str2);
            str2 = str2.substring(0, str2.length()-2);
            array[array.length-1]=str2;
        }
		if(flag) {
			array[0]=String.format("%02d", hr);
		}
		
		for (String string : array) {
			System.out.println(string);
		}
		String result="";
		for (int i = 0; i < array.length; i++) {
			result=result.concat(array[i]).concat(":");
		}
		result=String.join(":",array);
		System.out.println(result);
	}
}
