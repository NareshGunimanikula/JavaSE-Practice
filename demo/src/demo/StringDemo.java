package demo;

public class StringDemo {

	public static void main(String args[]) {
		String[] a = {"string", "new", "night"};
		String[] b = {"demo","noon","new","string"};
		String value = "demo";
		boolean st = isInBoth(value, a, b);
		System.out.println(st);
		
		
	}

	public static boolean isInBoth(String value, String[] arrayA, String[] arrayB) {
        boolean found = false;
        //arrayB
        try {
        	int length = arrayA.length<arrayB.length ? arrayB.length: arrayA.length; 
            for (int a = 0; a <= length; a++) {
            	for(int b=arrayB.length-1;b>0; b--) {
//                for (int b = 0; b< arrayB.length; b++) {
                	if(value.equals(arrayA[a]) && value.equals(arrayB[b])) {
                		throw new Exception("Found!"); 
                		
                	}
////                    if (arrayA[a].equals(arrayB[b])) {
////                        throw new Exception("Found!");
////                    }
//                }
//            	if(arrayA[a].contains(value) && arrayB[a].contains(value)){
//            		return true;
//            	}
            }
            }
          
        } catch (Exception e) {
        	e.getMessage();
            if ("Found!".equals(e.getMessage())) {
                found = true;
            }
        }

        return found;
    }

}
