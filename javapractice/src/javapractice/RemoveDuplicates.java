package javapractice;

public class RemoveDuplicates {

public static void duplicates(int a[]) {

    for(int i=0;i<a.length;i++) {
        for(int j=i+1;j<a.length;j++) {
            if(a[i]==a[j]) {
                a[j]=0;
            }
        }
    }
    for(int i=0;i<a.length;i++) {
        if(a[i]!=0) {
            System.out.print(a[i]+" ");
        }
    }
}

    public static void main(String args[]) {

        int arr[]= {1,3,7,7,9,9};

        duplicates(arr);

    }
}