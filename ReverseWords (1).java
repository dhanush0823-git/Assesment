class ReverseWords {
    public static void main(String args[]) {
        String n = "  I love  Java Programming ";
        String[] words = n.split(" ");
        String result = "";
        boolean first = true;

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() > 0) {
                if (first) {
                    first = false;
                } else {
                    result += " ";
                }
                result += words[i];
            }
        }
        System.out.println(result);
    }
}
