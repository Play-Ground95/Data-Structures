public class Demo5 {
    public static void main(String[] args) {
        int x=10; //first of all make a stack and store a x's value in stack
        int y=20; //store the y's value in stack

        int [] nums1=new int[3]; //it means size 3 array will be built in heap and int[]nums1 array store in stack
        nums1[0]=x; //array have 3 ints its mean 32bits*3 -> 0'th index filled with 10 
        nums1[1]=y;//1st index filled with 20

        int [] nums2 =new int[5];//it means size 5 array will be built in heap and int[]nums2 array store in stack
        nums2[nums1.length]=x; //nums2[3]->10
        nums2[nums2.length-1]=y;//nums2[5-1]-->20

        int[] nums3=nums1; //nums1[] stored in nums3[] array
        nums1=nums2;//nums2 array assign to nums1 array
        nums2=nums3;//nums3 array assign to num2 array
        nums3=null; //num3 array is assign to null value

            System.out.println(nums1);///nums1 address
            System.out.println(nums2);//nums2 address
            System.out.println(nums3);//null
            System.out.println(nums1[nums1.length-1]);//nums1(4)-->20
            System.out.println(nums1[nums1.length-2]);//10
            System.out.println(nums2[nums2.length-1]);//0
            System.out.println(nums2[nums2.length-2]);//20

    }
}
