class ImportantMethods{
    boolean isPrime(int n){
        int flag;
        flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(flag==1){
            return false;
        }
        else {
            return true;
        }
    }

}
public class PrimeNumberRange {
    public static void main(String[] args){
        int lowlt,uplmt;
        lowlt=1;
        uplmt=150;
        ImportantMethods im = new ImportantMethods();
        for (int i=lowlt;i<=uplmt;i++){
            if(im.isPrime(i)){
                System.out.println(i+" => Prime");
            }
        }

    }
}
