public class myThread extends Thread{
    @Override
    public void run(){
        for (int i = 0 ;i<999999998/2;i++){
            System.out.println("新年快乐，孤寡孤寡");
        }
    }
}
