class sum
{ 
    int d=0;
        int sumFact(int n, int i) 
    { 
  
        // Checking if the number is less than N 
        if (i <= n) { 
            if (n % i == 0) { 
                d=d+i;
            } 
  
            // Calling the function recursively 
            // for the next number 
            sumFact(n, i + 1); 
        }  
        return d;
} 
}