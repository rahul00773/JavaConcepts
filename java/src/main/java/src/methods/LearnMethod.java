package src.methods;

public class LearnMethod {


    public static void main(String[] args){
        LearnMethod learnMethod = new LearnMethod();
        int[] arr ={1,0,1,0};
        System.out.println(learnMethod.getZeroCount(arr));
        getOneCount(arr);

    }


    public int getZeroCount(int[] arr){
        return  0;

    }






    public int getZeroCount(int[] arr,int x){
        return  0;

    }

    public int getZeroCount(int[] arr,int x,int z){
        return  0;

    }

    public static int getOneCount(int[] arr){
        getCount1(arr);
        return 1;
    }


    public int getCount(int[] arr){
        getCount1(arr);
        getZeroCount(arr);
        return  0;

    }


    public static int getCount1(int[] arr){
        getOneCount(arr);
        return  0;

    }

}
