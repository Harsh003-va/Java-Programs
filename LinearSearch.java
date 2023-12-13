public class LinearSearch {

    public static int linearSearch(String menu[],String key){

        for (int i=0;i<menu.length;i++){
          if(menu[i]==key){
            return i;
          }
         
        }
             return -1;
    }
    public static void main(String arg[]){
       // int numbers[]={2,4,6,8,10,12,14,16};
        String menu[]={"Samosa","Momos","Dosa","Choco","Milk"};
        String key= "Dosa";
        int index=linearSearch(menu, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
        System.out.println("Key is at index : " + index);
        }
    }
} 
