package tag.array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;;
public class ThreeSumNo15_01 {
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums); //����
		
		for( int i=0; i<nums.length - 2; i++) { //������������  -2��ԭ������Ϊ����Ҫ��������
			
			if(i>0 && nums[i] == nums[i-1]) {  //������ͬ�� ������߼��Ǻ� ��һ���Լ��Ƚ�
				continue;
			}
			int j = i +1; // ��i��һ����ʼ
			int k = nums.length - 1; //���������һ��Ԫ��
			int target = -nums[i]; // j + k Ҫ���� -i
			while( j < k) {
				if(nums[j] + nums[k] == target) {
					res.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
					while (j < k && nums[j] == nums[j-1]) j++;//������ͬ�� ������߼��Ǻ� ��һ���Լ��Ƚ�
					while (j < k && nums[k] == nums[k+1]) k--;//������ͬ�� ������߼��Ǻ� ��һ���Լ��Ƚ�
				}else if( nums[j] + nums[k] > target) { // ���� Ҫ��С (��������������)
					k--;
				}else {// С��Ҫ����
					j++; 
				}
			}
		}
		System.out.print(res.toString());
		
	}

}
