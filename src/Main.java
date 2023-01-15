public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data");
        System.out.println(SumOdd.isOdd(1));
        System.out.println(SumOdd.isOdd(4));
        System.out.println(SumOdd.isOdd(33));
        System.out.println(SumOdd.isOdd(57));

        System.out.println("Adding Odd Numbers between ranges: ");
        System.out.println(SumOdd.sumOdd(1, 100));
        System.out.println(SumOdd.sumOdd(-1, 100));
        System.out.println(SumOdd.sumOdd(100, 100));
        System.out.println(SumOdd.sumOdd(13, 13));
        System.out.println(SumOdd.sumOdd(100, -100));
        System.out.println(SumOdd.sumOdd(100, 1000));

    }

    public static class SumOdd
    {
        public static boolean isOdd(int number)
        {
            if(number <= 0) return false;
            else
            {
                if(number % 2 != 0) return true;
            }
            return false;
        }

        public static int sumOdd(int start, int end)
        {
            int iTotal= 0;
            if((start > end) || (start < 0 || end < 0)) return -1;
            else
            {
                for(int i = start; i <= end; i++)
                {
                    if(isOdd(i)) iTotal = iTotal + i;
                }
                return iTotal;
            }

        }
    }
}