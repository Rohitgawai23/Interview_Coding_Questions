package _MNC_Coding_Que;

public class RemoveDuplicatesFromString
{
    public static void main(String[] args)
    {
        String str ="Thinkitive";
        char ch[] = str.toCharArray();
        int lock = -1;
        int count[] = new int[str.length()];

        for(int i=0; i<ch.length; i++)
        {
            int c = 1;
            for(int j=i+1; j<ch.length; j++)
            {
                if(ch[i] == ch[j])
                {
                    c++;
                    count[j] = lock;
                }
            }
            if(count[i] !=lock)
                count[i] = c;
        }

        System.out.println("After deleting duplicate character in string :");

        for(int i=0;i<ch.length;i++)
        {
            if(count[i]!=lock)
                System.out.print(ch[i]);
        }
    }
}
