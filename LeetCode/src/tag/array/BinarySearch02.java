package tag.array;
/*
 * һ���򵥵Ķ��ֲ���
 * 2018/11/27
 */

public class BinarySearch02{
	public static void main(String[] args) {
		int[] nums = {1,3};
		int target = 1;
		BinarySearch02 test = new BinarySearch02();
		System.out.println( test.BS(nums, target));
		System.out.println( test.BS(nums, 0, 1, target));
	}
	public int BS( int[] nums, int target) {//��ȫ��������ж��ֲ���
		int low = 0;
		int high = nums.length - 1;
		int middle = (low + high)/2; 
		
		while( low<=high) {
			middle = (low + high)/2;
			if( nums[middle] == target) {
				return middle;
			}
			
			
			if( target > nums[middle]) {
				low = middle + 1;
			}else {
				high = middle;
			}
		}
			return -1;	
	}
	public int BS( int[] nums, int low, int high, int target) {//��nums������ض���Χ�����ö��ֲ���
		int middle = (low + high)/2;

		while( low<=high) {
			middle = (low + high)/2;
			if( nums[middle] == target) {
				return middle;
			}
			if( target > nums[middle]) {
				low = middle + 1;
			}else {
				high = middle;
			}
		}
			return -1;
}
}

