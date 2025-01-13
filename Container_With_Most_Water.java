public class Container_With_Most_Water {
    public int maxWater(int arr[]) {
        // Code Here
        int n=arr.length;
        if(n==1)
        {
            return 0;
        }
        int water=0;
        int i=0;
        int j=n-1;
        // for(int i=0;i<n;i++)
        // {
        while(i<=j)
        {
            int base=j-i;
            int height=Math.min(arr[i],arr[j]);
            int area=base*height;
            water=Math.max(water,area);
           if(arr[i]<arr[j])
           {
               i++;
           }
           else
           {
               j--;
           }
        }
        return water;
    }
}
