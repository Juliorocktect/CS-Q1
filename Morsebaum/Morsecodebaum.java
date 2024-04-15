import java.sql.SQLOutput;

public class Morsecodebaum{
    
    public BinaryTree<String> morsecodebaum;

    public Morsecodebaum(){
        BinaryTree<String>[] b = new BinaryTree[40];
        b[0]=new BinaryTree<>("5");
        b[1]=new BinaryTree<>("4");
        b[2]=new BinaryTree<>("3");
        b[3]=new BinaryTree<>("2");
        b[4]=new BinaryTree<>("+");
        b[5]=new BinaryTree<>("1");
        b[6]=new BinaryTree<>("6");
        b[7]=new BinaryTree<>("=");
        b[8]=new BinaryTree<>("/");
        b[9]=new BinaryTree<>("7");
        b[10]=new BinaryTree<>("8");
        b[11]=new BinaryTree<>("9");
        b[12]=new BinaryTree<>("0");
        b[13]=new BinaryTree<>("H");
        b[14]=new BinaryTree<>("V");
        b[15]=new BinaryTree<>("F");
        b[16]=new BinaryTree<>("L");
        b[17]=new BinaryTree<>("P");
        b[18]=new BinaryTree<>("J");
        b[19]=new BinaryTree<>("B");
        b[20]=new BinaryTree<>("X");
        b[21]=new BinaryTree<>("C");
        b[22]=new BinaryTree<>("Y");
        b[23]=new BinaryTree<>("Z");
        b[24]=new BinaryTree<>("Q");
        b[25]=new BinaryTree<>("S",b[13],b[14]);
        b[26]=new BinaryTree<>("U",b[15],null);
        b[27]=new BinaryTree<>("R",b[16],null);
        b[28]=new BinaryTree<>("W",b[17],b[18]);
        b[29]=new BinaryTree<>("D",b[19],b[20]);
        b[30]=new BinaryTree<>("K",b[21],b[22]);
        b[31]=new BinaryTree<>("G",b[23],b[24]);
        b[32]=new BinaryTree<>("O");
        b[33]=new BinaryTree<>("I",b[25],b[26]);
        b[34]=new BinaryTree<>("A",b[27],b[28]);
        b[35]=new BinaryTree<>("N",b[29],b[30]);
        b[36]=new BinaryTree<>("M",b[31],b[32]);
        b[37]=new BinaryTree<>("E",b[33],b[34]);
        b[38]=new BinaryTree<>("T",b[35],b[36]);
        morsecodebaum=new BinaryTree<>("?",b[37],b[38]);
    }

    public void testDecode(String s){
        System.out.print("Decodiert mit print:  " + s + "   ->   ");
        morsezeichenDecodieren(morsecodebaum, s);
        System.out.println();
        //System.out.println("Decodiert mit return: " + s + "   ->   " + decode(morsecodebaum, s));
        System.out.println();
        //System.out.println("Decodiert mehrere Buchstaben: " + s + "   ->   " + morseCodeDecodieren(s));
    }
    
    //HA zum 17.04.:
    //Morsecode f�r einen Buchstaben decodieren und mit print ausgeben
    public void morsezeichenDecodieren(BinaryTree<String> b, String code){
        if (b.isEmpty())
            return;
        if (b.getLeftTree() == null && b.getRightTree() == null){
            System.out.println(b.getContent());
        }
        if (code.equals("-")){
            morsezeichenDecodieren(b.getRightTree(),code);
        }
        if(code.equals(".")){
            morsezeichenDecodieren(b.getLeftTree(),code);
        }
    }

    //HA zum 17.04.:
    //Morsecode für einen Buchstaben decodieren und zurückgeben
    public String decode(BinaryTree<String> b, String code){
       if (b.isEmpty())
            return null;
       if (code.length() == 1){
           return (code.charAt(0) == '-') ? b.getRightTree().getContent() : b.getLeftTree().getContent();
       }
       if (code.charAt(0) == '-'){
           return decode(b.getRightTree(),code.substring(1));
       }
       else{
            return decode(b.getLeftTree(),code.substring(1));
       }
    }
    
    //HA zum 17.04.:
    //Decodiert mehrere Buchstaben
    public String morseCodeDecodieren(String code){
        String ergebnis = "";
        while (code.indexOf(" ") != -1){
            String codeStr = code.substring(0, code.indexOf(" "));
            System.out.println(codeStr);
            ergebnis += decode(morsecodebaum,codeStr);
            code = code.substring(code.indexOf(" ")+1);
        }
        return ergebnis;
    }

    //
    //
    public void morseCodieren(String pText){
        //EIGENER CODE
    }  

    //
    //
    public void erzeugeMorsecode(char pZeichen, BinaryTree<String> pTree, String pCode){
        //EIGENER CODE
    }    

}


