class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder flipped = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch == '1') {
                flipped.append(0);
            } else {
                flipped.append(1);
            }
        }
        return Integer.parseInt(flipped.toString(), 2);
    }
}