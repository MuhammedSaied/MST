package moazkrapackage;


    public class spanningtrrrrree {

    public int isVisited[] = new int[15];
    public int cost[][] = new int[10][10];
    public int minimum_cost;
    public int total =0;

    public void tree(int n)
    {   
      int i,j,min=Integer.MAX_VALUE,num_edges=1,a=1,b=1,minpos_i=1,minpos_j=1;
        
         
    while(num_edges < n)
         {    

       for(i=1,min=Integer.MAX_VALUE;i<=n;i++)
       for(j=1;j<=n;j++)
       if(this.cost[i][j]<min)
       if(this.isVisited[i]!=0)
        {
         min=this.cost[i][j];
         a=minpos_i=i;
         b=minpos_j=j;

        }
            
  if(this.isVisited[minpos_i]==0 || this.isVisited[minpos_j]==0)
            {
          System.out.println(a+ "\t:\t" +b+ "\t=\t" +min);
             this.minimum_cost=this.minimum_cost+min;
             num_edges=num_edges+1; 
             total+=min;
             this.isVisited[b]=1;        
            }
  this.cost[a][b]=this.cost[b][a]=Integer.MAX_VALUE;  
    }
  System.out.println("The total weight of the spanning tree is "+ total);
}
    
           
    public static void main(String[] args) 
    {
        int total;
        int nodes,i,j;
        java.util.Scanner a = new java.util.Scanner(System.in);
        System.out.println("Enter the Number of Nodes");
        nodes = a.nextInt();
        spanningtrrrrree p = new spanningtrrrrree();
        System.out.println("Enter the Cost Matrix Weights :");
        for(i=1;i<=nodes;i++)
          for(j=1;j<=nodes;j++)
          {
            p.cost[i][j]=a.nextInt();
            if(p.cost[i][j]==0)
              p.cost[i][j]=Integer.MAX_VALUE;
          }
       
        System.out.println("SOURCE  : DESTINATION   =  WEIGHT");
        p.isVisited[1]=1; // Initialization 
        p.tree(nodes);
/*
0 2 5 4 0 0 0
2 0 2 0 7 0 0
5 2 0 1 4 3 0
4 0 1 0 0 4 0
0 0 0 0 0 1 5
0 0 0 0 1 0 7
0 0 0 0 0 0 0
*/ 
  }
} 
