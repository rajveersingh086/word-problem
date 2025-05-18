package wordproblem;

public class timetoduel {
    public static String check(int arr[]){
        // check this is consicutive or not
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            if(arr[i]==0 && arr[i+1]==0){
                return "yes";
            }
        }
        //check elements are 1 or not
        boolean onesall =true;
        for (int i = 0;i<n;i++){
            if(arr[i]!=1){
                break;
            }
        }
        if(onesall){
            return "yes";
        }
        // else return no 
        return "no";
    }
}
