package javaTry;

public class test {
    public static void main(String[] args) {
        System.out.println(isPow(5));
    }
    public static boolean isPow(int x){
        if(((x&(x-1))==0)){
            return true;

        }
        return false;
    }
}
