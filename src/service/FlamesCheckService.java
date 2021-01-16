package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService {
	public char findFlames(String name1,String name2) {
		name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();
        System.out.println("Your name is "+name1);
        System.out.println("Your partner name is "+name2);
        StringBuilder na1 = new StringBuilder(name1);
        StringBuilder na2 = new StringBuilder(name2);
       
        int m=na1.length();
        int n=na2.length();
        for(int i=0;i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(na1.charAt(i) == na2.charAt(j))
                {
                    na1.replace(i,i+1,"0");
                    na2.replace(j,j+1,"0");
                }
            }
        }

        String s1="",s3="",s4="";
        String s2="";
        s3 = na1.toString();
        s4 = na2.toString();
        for(int i=0;i<s3.length();i++){ 
            if(s3.charAt(i)!='0'){
               s1=s1+s3.charAt(i);
                    }
            }
        for(int i=0;i<s4.length();i++){
            if(s4.charAt(i)!='0'){
                s2=s2+s4.charAt(i);
                
                }
            }
        System.out.println("First String: "+s1);
        System.out.println("Second String: "+s2);
        int x = s1.length()+s2.length(); 
        System.out.println("Length is: "+x);  
        String flames = "flames";
        StringBuilder fla = new StringBuilder(flames);
        char c='a';
        while(fla.length()!=1)
        {
            int y = x%fla.length(); 
            String out;
            
            if(y!=0)
            {
                out=fla.substring(y)+fla.substring(0, y-1);
                
            }
            else
            {
                out=fla.substring(0, fla.length()-1);
                
            }
            System.out.println(out);
            fla =new StringBuilder(out);
            c=fla.charAt(0);
        }
        switch(c)
        {
            case 'f':
                c='f';
                System.out.println("You two are \"FRIENDS\"");
                break;
            case 'l':
                c='l';
                System.out.println("You two are \"LOVERS\"");
                break;
            case 'a':
            	c='a';
            	System.out.println("You two are \"AFFECTIONATE\"");
            	break;
            case 'm':
            	c='m';
            	System.out.println("You two are \"MARRIED\"");
            	break;
            case 'e':
            	c='e';
            	System.out.println("You two are \"ENEMIES\"");
            	break;
            case 's':
            	c='s';
            	System.out.println("You two are \"SIBLINGS\"");
            	break;
                
        }
        return c;
    }
	}
