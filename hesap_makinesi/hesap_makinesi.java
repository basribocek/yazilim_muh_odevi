public class hesap_makinesi{

public static int toplamaYap(int a , int b){
    return a+b;
}

public static void bolmeYap(int a, int b){
    
    try{

        double sonuc = a/b;
        System.out.println(sonuc);
}   catch(Exception e){

    System.out.println("sonsuz");

}
}
}