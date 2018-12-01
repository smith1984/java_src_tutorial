package Ch_3;

class CharArray2{
    public static void main(String[] args){
        char[] words=new char[]{'С','л','о','в','о'};
        char[] code=new char[words.length];
        for(int i=0;i<words.length;i++)
            code[i]=(char)(words[i]+i+1);
        System.out.println(words);
        System.out.println(code);
    }
}
