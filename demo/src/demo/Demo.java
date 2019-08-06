package demo;

public class Demo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "abc";
//        String s2 = "def";
//        StringBuilder sb = new StringBuilder();
//        int i =0, j =0;
//			while(i<s.length() && j < s2.length()){
//			    char charAt = s.charAt(i++);
//				sb.append(charAt);
//			    sb.append(s2.charAt(j++));
//			}
//
//        if(i != s.length()){
//            sb.append(s.substring(i));
//        }
//        if(j != s2.length()){
//            sb.append(s2.substring(j));
//        }
//        
//        System.out.println(sb);
		/*public class WantsToBeChanged {

		    public void performOperation(OperationDefinition op, Map<Long, String> theMainMap, OperSummary sum) {
		        for (int d = 0; d < op.getOperationDetailsStore().size(); ) {
		            OperationDetail opDetails = op.getOperationDetailsStore().get(d);
		            if (opDetails.getOpStatusId() == 1 || opDetails.getOpStatusId() == 3 || opDetails.getOpStatusId() == 4) {
		                sum.setOpCond(true);
		                
		                if (opDetails.getRelblkId() != null && opDetails.getOperationsumRefId() != null && 
		                                                                                    opDetails.getOperationsumParentId() != null) {
		                    sum.setIsReliefOperation("Y");
		                    theMainMap.put(opDetails.getOperationsumId(), "Y");
		                }
		            } else {
		                if (opDetails.getRelblkId() != null && opDetails.getOperationsumRefId() != null && 
		                                                                                     opDetails.getOperationsumParentId() != null) {
		                    sum.setOpCond(true);
		                    sum.setIsReliefOperation("Y");
		                    theMainMap.put(opDetails.getOperationsumId(), "Y");
		                } else {
		                    sum.setOpCond(true);
		                }
		            }
		            break;
		        }
		    }
		}*/
	
	public boolean isInBoth(String value, String[] arrayA, String[] arrayB) {
        boolean found = false;

        try {
            for (int a = 0; a <= arrayA.length; a++) {
                for (int b = arrayB.length - 1; b > 0; b--) {
                    if (arrayA[a].equals(arrayB[b])) {
                        throw new Exception("Found!");
                    }
                }
            }
        } catch (Exception e) {
            if ("Found!".equals(e.getMessage())) {
                found = true;
            }
        }

        return found;
    }

	}
        


