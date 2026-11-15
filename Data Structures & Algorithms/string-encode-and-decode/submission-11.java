class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        strs.forEach(string -> {
            sb.append(Integer.toString(string.length())).append(",");
        });
        sb.append("#");
        strs.forEach(string -> {
            sb.append(string);
        });

        return sb.toString();
    }

    public List<String> decode(String str) {
        // "2,3,4,#hibyerail"
        List<Integer> sizes = new ArrayList<>();
        List<String> res = new ArrayList<>();

        int i = 0;

        while(str.charAt(i) != '#') {
            StringBuilder currentNum = new StringBuilder();

            while (str.charAt(i) != ',') {
                currentNum.append(str.charAt(i));
                i++;
            }

            sizes.add(Integer.parseInt(currentNum.toString()));
            i++;
        }

        i++;

        for (int size : sizes) {
            res.add(str.substring(i, i + size));
            i += size;
        }

        return res;
    }
}
