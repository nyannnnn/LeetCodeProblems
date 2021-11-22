class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == "" && needle == "") {
			return 0;
		} else {
			return haystack.indexOf(needle);
		}
    }
}