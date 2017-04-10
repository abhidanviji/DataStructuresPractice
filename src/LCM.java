class LCM{
    public static int getLCM1(int ... a){
        int lcm=0;
        boolean found;
        for(int i=1; ; i++){
            found=true;
            for(int x=0; x<a.length;x++){
                if(i%a[x]!=0){
                    found=false;
                    break;
                }
            }
            if(found){
                lcm=i;
                break;
            }
        }
        return lcm;
    }
    public static int getLCM2(int ... a){
        int lcm, max;
        boolean found;
        max=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max) max=a[i];
        }
        for(int i=max; ; i+=max){
            found=true;
            for(int x=0; x<a.length;x++){
                if(i%a[x]!=0){
                    found=false;
                    break;
                }
            }
            if(found){
                lcm=i;
                break;
            }
        }
        return lcm;
    }
    public static void main(String[] args){
        int a[]={2,4};
        System.out.println(getLCM1(a));
        System.out.println(getLCM2(a));
    }
}