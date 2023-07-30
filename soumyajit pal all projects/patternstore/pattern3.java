package patternstore;
class pattern3
    {
        public static void main()
        {
            int i,j,k,m;
            System.out.println("the pattern of pascal,s Triangle:");
            m=7;
            for(i=1;i<=4;i++)
            {
                for(j=1;j<=m;j++)
                {
                    System.out.print(" ");
                }
                for(k=1;k<=i;k++)
                {
                     System.out.print(k+" ");
                    }
                for(k=i-1;k>=1;k--)
                {
                     System.out.print(k+" ");
                    }
                System.out.println();
                m=m-2;
            }
            m=3;
            for(i=3;i>=1;i--)
            {
                for(j=1;j<=m;j++)
                {
                    System.out.print(" ");
                }
                for(k=1;k<=i;k++)
                {
                     System.out.print(k+" ");
                    }
                for(k=i-1;k>=1;k--)
                {
                     System.out.print(k+" ");
                    }
                System.out.println();
                m=m+2;
            }
        }
    }
        
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            