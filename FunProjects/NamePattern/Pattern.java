package Exercise.Funproject;

public class Pattern {
    public static void main(String[] args) {
        // A();
        // B();
        // C();
        // D();
        // E();
        // F();
        G();
    }

    
    static void A()
    {
        char ch='A';
        int row=7;
        for(int i=0;i<row;i++)
        {
            // for()
            for(int j=0;j<=(row*2)-1;j++)
            {
                if(j==row-i || j==row+i)
                {
                    if(i==row-3)
                    {
                        for(int k=0;k<(i*2)+1;k++)
                        {
                            System.out.print(ch);
                        }
                        break;
                   }
                    System.out.print(ch);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void B()
    {
        int row=7;
        char ch='B';
        int col=row-((row/7)*2);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0)
                {
                    System.out.print(ch+" ");
                }
                if((i==0 && j!=col-1) || (i==row-1  && j!=col-1)|| (i==row/2  && j!=col-1))
                {
                    System.out.print(ch+" ");
                }
                else if((!(i==0) && j==col-1) && (!(i==row-1)  && j==col-1) && (!(i==row/2)  && j==col-1))
                {
                    if(j==col-1)
                    {
                        System.out.print(ch+" ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }

    static void C()
    {
        int row=7;
        int col=row;
        char ch='C';
        boolean isStartEnd=false;
        for(int i=0;i<row;i++)
        {
            if(i==0 || i==row-1)
            isStartEnd=true;
            else
                isStartEnd=false;
            for(int j=0;j<col;j++)
            {
                if(!isStartEnd)
                {
                    if(j==0)
                    {
                        System.out.print(ch+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                else
                {
                    if(j==0)
                    {
                        System.out.print("  ");
                    }
                    else{
                        System.out.print(ch+" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void D()
    {
        int row=7;
        int col=row-((row/7)*4);
        char ch='D';
        boolean isMid=false;
        for(int i=1;i<=row;i++)
        {
            if(i>=col && i<=col+((col-1)*(row/7)))
                {
                    isMid=true;
                }
                else
                isMid=false;
            for(int j=0;j<=col;j++)
            {
                if(j==i && i<col)
                {
                    System.out.print(ch+" ");
                }
                if(j==0)
                {
                    System.out.print(ch+" ");
                }
                else if(isMid)
                {
                    if(j==col)
                    System.out.print(ch+" ");
                    else
                        System.out.print("  ");
                }
                else if(!isMid && i>col)
                {
                    if(i+j==row+1)
                    {
                        System.out.print(ch+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }  
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void E()
    {
        char ch='E';
        int row=7;
        int col=((row%7)/2)+5;
        int mid=row/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || i==row-1 || i==mid)
                {
                    System.out.print(ch+" ");
                }
                else if(j==0)
                {
                    System.out.print(ch+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void F()
    {
        char ch='F';
        int row=7;
        int col=((row%7)/2)+5;
        int mid=row/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0  || i==mid)
                {
                    System.out.print(ch+" ");
                }
                else if(j==0)
                {
                    System.out.print(ch+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void G()
    {
        char ch='G';
        int row=9;
        int col=((row%9)/2)+5;
        int mid=row/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if((i==0 && j!=0 && j!=col-1) || (i==row-1 && j!=0 && j!=col-1) || (j==0 && i!=0 && i!=row-1))
                {
                    System.out.print(ch+" ");
                }
                else if(i==mid && j!=1)
                {
                    System.out.print(ch+" ");
                }
                else if(i>mid && i!=row-1 && j==col-1)
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }

    static void H()
    {
        int row=7;
        char ch='H';
        int col=((row%7)/2)+6;
        int mid=row/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0 || j==col-1 || (i==mid))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void I()
    {
        int row=7;
        char ch='I';
        int col=((row%7)/2)+5;
        int mid=col/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || i==row-1 || (j==mid))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void J()
    {
        int row=7;
        char ch='J';
        int col=row;
        int mid=col/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || (j==mid && i!=row-1) || (j<mid && i==row-1 && j!=0 ) ||(i==row-2 && j==0))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void K()
    {
        int row=7;
        char ch='K';
        int col=((row%7)/2)+4;
        int mid=col/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0 || (i<=mid && j==(col-1)-i) || (i>mid && j==i-(col-1)))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void L()
    {
        int row=7;
        char ch='L';
        int col=((row%7)/2)+5;
        //int mid=col/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0 || i==row-1)
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void M()
    {
        int row=7;
        char ch='M';
        int col=row;
        int mid=col/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0 || j==row-1 ||(i<=mid && (j==i || j==(row-1)-i)))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void N()
    {
        int row=7;
        char ch='N';
        int col=row;
        //int mid=col/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0 || j==row-1 ||j==i)
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void O()
    {
        int row=7;
        int col=row;
        char ch='O';
        int start=(row/2)-1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if((i==0 && j>=start && (j<=start+((row%7)/2+2))) || (i==row-1 && j>=start && (j<=start+((row%7)/2+2))) || (i>=start && (i<=start+((row%7)/2+2) && j==0)) || (i>=start && (i<=start+((row%7)/2+2) && j==row-1)))
                {
                    System.out.print(ch+" ");
                }
                else if((j==i || j==(row-1)-i) && !(i==0 || i==row-1 || (i>=start && (i<=start+((row%7)/2+2)))))
                {
                    System.out.print(ch+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void P()
    {
        int row=7;
        char ch='P';
        int col=((row%7)/2)+3;
        //int mid=row/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0 || j==i+1 || (i==(col-1) && j==i) || (i>=col && i<=(row-1)-3 && j==(i-(col-1))))
                {
                    System.out.print(ch+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void Q()
    {
        int row=6;
        char ch='Q';
        int col=row;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || i==row-3 || (j==0 && i<row-2)|| (j==col-1 && i<row-2) || (i>=(row-2) && j==i))
                {
                    System.out.print(ch+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    static void R()
    {
        int row=9;
        int col=(row%7)/2+4;
        char ch='R';
        boolean isInceasing=true;
        int value=0;
        for(int i=0;i<row;i++)
        {
            if(isInceasing)
            {
                value++;
            }
            if(!isInceasing)
            {
                value--;
            }
            if(value==col-1)
            {
                isInceasing=false;
            }
            if(value==0 || value==1)
            {
                isInceasing=true;
            }
            for(int j=0;j<col;j++)
            {
                if(j==0 || j==value)
                {
                    System.out.print(ch+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void S()
    {
        char ch='S';
        int row=9;
        int col=(row/9)/2+5;
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++)
            {
                if((i==0  && j>=1 && j<col-1) || (i==row-1  && j>=1 && j<col-1) || (i==1  && (j==0 || j==col-i)) || (i==row-2  && (j==0 || j==col-1)) || j==(i-2))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }

    static void T()
    {
        char ch='T';
        int row=7;
        int col=row;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || j==col/2)
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void U()
    {
        int row=7;
        int col=row;
        char ch='U';
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if((i<row-2 && (j==0 || j==col-1)) || (i==row-1 && j>1 && j<col-2) || ((i==row-2) &&(j==1 || j==col-2)))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void V()
    {
        int row=5;
        int col=row*2;
        char ch='V';
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==i || j==(col-2)-i)
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    static void W()
    {
        int row=7;
        int col=row;
        char ch='W';
        int mid=row/2;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==0 || j==col-1 || (i==mid && j==mid) || (i>mid && (j==mid-(i-mid) || j==mid+(i-mid)) ))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            //System.out.println();
        }
    }

    static void X()
    {
        int row=9;
        int col=row;
        int mid=row/2;
        char ch='X';
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==i || j==(row-1)-i)
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void Y()
    {
        int row=7;
        int col=row;
        int mid=row/2;
        char ch='Y';
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if((i<=mid && (j==i || j==(row-1)-i)) || (i>mid && j==mid))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void Z()
    {
        int row=7;
        int col=row;
        char ch='Z';
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==0 || i==row-1 || (j==(row-1)-i))
                {
                    System.out.print(ch+" ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    
}
