package jp.ac.uryukyu.ie.e205217;

public class report5 {
    public static void main(String[] args){
        String str = "百二十三";
            
        try {
            int value = Integer.parseInt(str);  
        }catch(NumberFormatException e){
            System.out.println("例外発生中");
        }finally{
            System.out.println("処理終了");
        }
        }
}

        //try{
          //  String str = null;
            //System.out.println(str.length());
        //}catch(NullPointerException e){
          //  System.out.println("例外発生中");
            //System.out.println(e.getMessage());
        //}
    //}
//}
