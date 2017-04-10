import java.util.ArrayList;

class LCM{
    public static ArrayList getLCM1(int[] a,int len){
        int lcm=0;
        ArrayList al = new ArrayList<>();
        boolean found;
        for(int i=1; i<len; i++){
            found=true;
            for(int x=0; x<a.length;x++){
                if(i%a[x]!=0){
                    found=false;
                    break;
                }
            }
            if(found){
               al.add(i);
            }
        }
        return al;
    }
    
     
    public static void main(String[] args){
        int a[]={2,4};
        int b[] ={16,32,96};
        System.out.println(getLCM1(a,b[b.length-1]));
    }
}