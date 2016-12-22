package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
        int total=0;
        public int of(int start, int end)
        {
            if (start % 2 ==0)
            {start = start + 1;}
            for (int x=start; x<=end; x=x+2)
            {
                total = total +x;
            }

        return total;
    }
}
