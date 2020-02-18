package maxDrie;

public class Max3 {

	public static int max3(int i, int j, int k) {
		if(i < j)
			if(j<k)
				return k;
			else
				return j;
		else
			if(i<k)
				return i;
			else
				return k;
	}
	
}
