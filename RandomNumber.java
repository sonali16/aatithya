package string;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RandomNumber {

	

	
	public Integer getOtp() {
		
		SecureRandom secureRandomGenerator=new SecureRandom();
		List<Integer> randomNumberList=new ArrayList<Integer>();
	    
		 randomNumberList=secureRandomGenerator.ints(1,1000,9999)
		    		                              .boxed()
		    		                              .collect(Collectors.toList());
		 return randomNumberList.get(0);
	}
//	public static void main(String[] args)
//	{
//		RandomNumber rN=new RandomNumber();
//		System.out.println(rN.getOtp());
//	}

}
