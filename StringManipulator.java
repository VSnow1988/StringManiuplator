public class StringManipulator{
	String trimAndConcat(String strA, String strB){
		String newA = strA.trim();
		String newB = strB.trim();
		String newString = newA.concat(newB);
		return(newString);
	}
	
	int getIndexOrNull(String str, char cha){
		int newInt;
		newInt = str.indexof(cha);
		return(newInt);
	}
	
	int getIndexOrNull(String strA, String strB){
		int newInt;
		newInt = strA.indexof(strB);
		return(newInt);
	}
	
	String concatSubstring(String strA, int start, int end, String strB){
		String subA = strA.substring(start,end);
		String newString = subA.concat(strB);
		return(newString);
	}

}