class Reverse_Integer {
    public int reverse(int num) {
		
		long reversed = 0;

		while (num != 0) {

			long digit = num % 10;
			reversed = reversed * 10 + digit;

			num /= 10;
		}

		if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
			return 0;

		return (int) reversed;
		
	}
}
