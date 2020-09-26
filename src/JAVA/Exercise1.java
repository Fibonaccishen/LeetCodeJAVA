package JAVA;
//替换问号
//leetcode1576
public class Exercise1{
    public String modifyString(String s) {
            //improved version
            char[] c=s.toCharArray();
            int length=c.length;

            for(int i=0;i<length;i++){
                if(c[i]=='?'){
                    char ahead=(i==1)?' ':c[i-1];
                    char behind=(i==length-1)?' ':c[i+1];
                    char temp='a';

                    while(ahead==temp || behind==temp)
                        temp++;
                    c[i]=temp;
                }
            }
            return new String(c);



        //own version
//        char[] c=s.toCharArray();
//        if(c[0]=='?'){
//            if(c[1]!='a')
//                c[0]='a';
//            else c[0]='b';
//        }
//        for(int i=1;i<c.length-1;i++){
//            if(c[i]=='?'){
//                if(c[i-1]=='a'){
//                    if(c[i+1]!='b')
//                        c[i]='b';
//                    else c[i]='c';
//                }
//                else{
//                    if(c[i+1]!='a')
//                        c[i]='a';
//                    else if(c[i-1]=='b')
//                        c[i]='c';
//                    else c[i]='b';
//                }
//            }
//        }
//        if(c[c.length-1]=='?')
//        c[c.length-1]=(c[c.length-2]=='a')?'b':'a';
//        String result=String.valueOf(c);
//        return result;
    }
}
