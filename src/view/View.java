package view;

public class View {
    public static void printTxtFormat(String txt){
        int lengthTxt = txt.length()+2;
        while (lengthTxt>0) {
            System.out.print('-');
            lengthTxt--;
        }
        System.out.println();
        System.out.println(' '+txt);;
        while (txt.length()+2!=lengthTxt) {
            System.out.print('-');
            lengthTxt++;
        }
        System.out.println();
    }
    public void printTxt(String txt,boolean flag){
        if(flag){
            System.out.println(" "+txt);
        } else {
            System.out.print(" "+txt);
        }
    }

}
