package ref;

public class NullMain3 {

    public static void main(String[] args) {

        try{
            BigData bigData = new BigData();
            System.out.println("BigData.data = " + bigData.data);
            System.out.println("BigData.count = " + bigData.count);
            System.out.println("BigData.data = " + bigData.data.value);

        }catch (Exception e){
            System.out.println("예외발생!!!!!!!!!!!!!!!");
            e.printStackTrace();
        }



    }
}
